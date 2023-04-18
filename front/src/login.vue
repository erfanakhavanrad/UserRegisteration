<template>
  <div id="home" dir="rtl">
   <dir style="position: center; text-align: center;align-items: center;">
   <b-button block variant="secondary" style="margin: 10px;padding: 20px;">ثبت کاربر جدید</b-button>
   <b-button block variant="danger" style="margin: 10px;padding: 20px;">خروجی pdf</b-button>  
 </dir>  
 <div>
   <b-table striped hover :items="users">
       <template #cell(user)="row">
         {{ row.value.name }}
       </template>
       <template #cell(username)="row">
         {{ row.value.username }}
       </template>
       <template #cell(phone)="row">
         {{ row.value.phone }}
       </template>
     </b-table>
   </div>
 </div>
 
   
 
 </template>
 <script>
 import swal from 'sweetalert';
 import axios from 'axios';
  
 export default {
      name: 'login',
 
    timer: undefined,
   data() {
     return {
       users:[]
       
     };
     
   },
   created() {
   axios
     .get('https://jsonplaceholder.typicode.com/users')
     .then(response => (this.users = response.data))
     .catch(error => console.log(error));
 },
     beforeCreate () {
     // if (localStorage.getItem('Token')==null) {
     //   this.$router.push({ path: '/' })
     // }
   },
 
     methods:{
      logout(){
       localStorage.removeItem("Token")
       window.location.reload();
      },
 
     submitForm(){
       if(this.selectedItem==[]){
        swal("! لطفاً بازاریاب مورد نظر خود را انتخاب کنید")
 
       }
   
 let Start = this.StartDate.replaceAll("/","%2F");
 let End = this.EndDate.replaceAll("/","%2F")
 const TOKEN = this.token;
 const BASEURL =  'http://127.0.0.1:8080/tws/sale/coordinates/byname';
 const ENDPOINT = '?percomname='+this.selectedItem+'&startDate='+Start+'&endDate='+End;
 
   axios.create({
         baseURL: BASEURL,
         headers: {
             'Content-Type': 'application/json',
             'Authorization': 'Bearer '+TOKEN
         }
     })
     .get(ENDPOINT)
     .catch(function (error) {
     if (error.response.status==500) {
        swal("!داده های وارد شده معتبر نیست")
     }
   })
     .then(res => {
         if (res.status==204) {
        swal("داده ایی برای کاربر مورد نظر یافت نشد")
     }
       const response = res.data;
       const objData = []
      const LatLngData = []
       for (const index in response) {
         const obj = {}
                             
         obj.StartTime = response[index].startTime
         obj.EndTime = response[index].endTime
         obj.name = response[index].customerName
         obj.lng = response[index].longitude
         obj.lat = response[index].latitude
         objData.push(obj)
         LatLngData.push([objData[index].lat,objData[index].lng])
       }
   this.markers = objData;
   this.polyline.latlngs= LatLngData;
   this.bounds = LatLngData;
   this.maxBounds = LatLngData;
     });
     },
   },
 
      mounted(){
           
        const TOKEN = this.token;
         const headers = { "Content-Type": "application/json",
         "Authorization": "Bearer "+TOKEN
          };
 
   axios.get("http://127.0.0.1:8080/tws/sale/marketingmen", { headers })
    .then(res => {
   
       const response = res.data;
       const objData = []
       for (const index in response) {
         const obj = {}
         obj.id = response[index].customerID
          obj.name = response[index].customerName
         objData.push(obj)
       }
   this.customerNames = objData;
     });
 }
 }
 
 
 </script>
 
 <style>
 @import url('https://fonts.cdnfonts.com/css/iranian-sans');
 .logout {
   position: absolute;
   bottom: 8px;
   right: 16px;
   font-size: 18px;
   font-family: 'Iranian Sans';
   position: fixed;
   background-color: #0d6efd;
   z-index:100000;
   width:10vh;
   margin-right: 1em;
   
   justify-content: center;
   
 }
 .logo {
   position: absolute;
   bottom: 6%;
   right: 20px;
   font-size: 18px;
   font-family: 'Iranian Sans';
   position: fixed;
   z-index:100000;
   width:4%;
   margin-right: 1em;
   ;
   justify-content: center;
   
 }
 .marketing-man-card:hover {
         cursor:default;
         
 }
 .button{
   font-family: 'Iranian Sans';
   margin-top: 1em;
 }
 .card-title{
     font-size:20px;
 }
 .textPos{
   position:center;
   text-align: center;
 }
 .dromdown{
 position:center;
   text-align: center;
 }
 #form__BV_toggle_{
   width: 100%;
   font-size: 25px;
 }
 #btn-primary{
   width: 100%;
   font-size: 25px;
 }
 #btn{
   width: 100%;
 
 }
 #btn-sm{
   width: 100%;
   font-size: 25px;
 }
 #btn-block{
   width: 100%;
   font-size: 25px;
 }
 #card-title{
     width: 100%;
 }
 .DivMap{
 height:100vh;
 position:fixed;
  width:100%
 }
 .Map{
 height:100vh;
 position:fixed;
 }
 .paddingStyle{
   padding-block: 10px;
 }
 .button {
   transition-duration: 0.4s;
 }
 
 .button:hover {
   background-color: #4CAF50; /* Green */
   color: white;
 }
 </style> 
 
 