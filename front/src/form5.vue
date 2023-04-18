<template>

    <div id="form3" dir="rtl">
    <form @submit.prevent="submitForm">
       
            <h2>  درخواست عضویت در بسیج</h2>
       
       
      <div>
        <label for="title">عنوان:</label>
        <input type="text" id="title" v-model="form.title">
      </div>
      <div>
        <label for="takhasosi">تخصوصی:</label>
        <input type="text" id="takhasosi" v-model="form.takhasosi">
      </div>
      <div>
        <label for="vizhegi">ویژگی:</label>
        <input type="text" id="vizhegi" v-model="form.vizhegi">
      </div>
      <div>
        <label for="onvanDoreh">عنوان دوره :</label>
        <input type="text" id="onvanDoreh" v-model="form.onvanDoreh">
      </div>
      <div>
        <label for="zamanEjraShoro"> زمان اجرا:</label>
        <input type="text" id="zamanEjraShoro" v-model="form.zamanEjraShoro">
      </div>
      <div>
        <label for="zamanEjraPayan">زمان پایان  :</label>
        <input type="text" id="zamanEjraPayan" v-model="form.zamanEjraPayan">
      </div>
      <div>
        <label for="zamanAmoozeshRooz"> مدت آموزش روز :</label>
        <input type="text" id="zamanAmoozeshRooz" v-model="form.zamanAmoozeshRooz">
      </div>
      <div>
        <label for="zamanAmoozeshSaat">مدت آموزش ساعت  :</label>
        <input type="text" id="zamanAmoozeshSaat" v-model="form.zamanAmoozeshSaat">
      </div>
      <div>
        <label for="mahalAmoozesh">محل آموزش :</label>
        <input type="text" id="mahalAmoozesh" v-model="form.mahalAmoozesh">
      </div>
      <div>
        <label for="mahalTaeedVaMohr">  محل تایید مهر امضای سرمایه انسانی :</label>
        <input type="text" id="mahalTaeedVaMohr" v-model="form.mahalTaeedVaMohr">
      </div>
      <div>
        <label for="onvanOzviatAdi">  عضویت عادی:</label>
        <input type="text" id="onvanOzviatAdi" v-model="form.onvanOzviatAdi">
      </div>
      <div>
        <label for="onvanOzviatVizhe">  عضویت ویژه:</label>
        <input type="text" id="onvanOzviatVizhe" v-model="form.onvanOzviatVizhe">
      </div>
      <label for="normalKartNumber">  شماره کارت عضویت عادی:</label>
      <input type="checkbox" id="normalKartNumber" v-model="form.normalKartNumber">
      
      <label for="normalKartGereftam">کارت عادی گرفته ام  :</label>
      <input type="checkbox" id="normalKartGereftam" v-model="form.normalKartGereftam">
      
      <label for="vipCardNumber">شماره کارت ویژه:</label>
      <input type="text" id="vipCardNumber" v-model="form.vipCardNumber">
      
      <label for="vipCardGereftam">کارت ویژه گرفتم:</label>
      <input type="checkbox" id="vipCardGereftam" v-model="form.vipCardGereftam">



        <button v-on:click="submitForm">ذخیره</button>
      
</form>
</div> 
 
    </template>
  
  <script>
  import axios from 'axios';
  export default {
    name:'form3',
    data() {
      return {
        form: {
    id: null,
    title: '',
    takhasosi: '',
    vizhegi: '',
    onvanDoreh: '',
    zamanEjraShoro: '',
    zamanEjraPayan: '',
    zamanAmoozeshRooz: '',
    zamanAmoozeshSaat: '',
    mahalAmoozesh: '',
    mahalTaeedVaMohr: '',
    onvanOzviatAdi: '',
    onvanOzviatVizhe: '',
    normalKartNumber: '',
    normalKartGereftam: false,
    vipCardNumber: '',
    vipCardGereftam: false,
    fiveYearsSecondTelephone: ''
     


      },
    };
},
    methods: {
      nextPage() {
        this.page++;
      },
      previousPage() {
        this.page--;
      },
      submitForm() {
     
        axios.post('http://localhost:8080/fifth', this.form)

      }
    }
  };
  </script>
  