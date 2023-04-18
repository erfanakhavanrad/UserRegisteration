 <template>
  
 <div id="home" dir="rtl">

  <dir style="position: center; text-align: center;align-items: center;">
 <router-link to="form"> <b-button block variant="secondary" style="margin: 10px;padding: 20px;" @click="aa">ثبت کاربر جدید</b-button></router-link>
<router-link to="form2"><b-button block variant="secondary" style="margin: 10px;padding: 20px;" @click="ab">تعرفه حافظتی بسیجیان</b-button></router-link>
<router-link to="form5"><b-button block variant="secondary" style="margin: 10px;padding: 20px;" @click="abbd"> ثبت نام دوره</b-button></router-link>
<router-link to="form3"><b-button block variant="secondary" style="margin: 10px;padding: 20px;" @click="abb"> فرم سوم</b-button></router-link>
<router-link to="form4"> <b-button block variant="secondary" style="margin: 10px;padding: 20px;" @click="abc"> درخواست عضویت در بسیج</b-button></router-link>
<b-button block variant="danger" style="margin: 10px;padding: 20px;" @click="exportPDF">خروجی pdf</b-button>  
  
</dir> 
</div> 
<!-- <div>
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
</div> -->

  

</template>
<script>
// import swal from 'sweetalert';
import axios from 'axios';
import jsPDF from 'jspdf';
// import html2pdf from 'html2pdf.js';

export default {
     name: 'home',

   timer: undefined,
  data() {
    return {
      users:[],

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
  mounted() {
  this.getData(123);
},

    methods:{
      async getData(id) {
  try {
    const response = await axios.get(`http://localhost:8080/pdf/${id}`);
    const data = response.data;
  this.data = data
  } catch (error) {
    console.error(error);
  }
},
async exportPDF() {
  try {
    const response = await axios.get('http://localhost:8080/pdf/123');
    const data = response.data;
    this.createPDF(data);
  } catch (error) {
    console.error(error);
  }
},

createPDF(data) {
  const doc = new jsPDF();
  // Add data to the PDF document
  doc.text(data.title, 10, 10);
  doc.text(data.description, 10, 20);
  // Save the PDF document
  doc.save('document.pdf');
},

    //  aa(){
    //   router.push('/form')
    //  },
    //  ab(){
    //   router.push('/form2')
    //  },
    //  abb(){
    //   router.push('/form3')
    //  },
    //    abc(){
    //     router.push('/form4')
    //    },
    //    abbd(){
    //     router.push('/form5')
    //    },
    },
  
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

