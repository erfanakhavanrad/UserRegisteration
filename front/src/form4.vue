<template>

    <div id="form3" dir="rtl">
    <form @submit.prevent="submitForm">
       
            <h2>  درخواست عضویت در بسیج</h2>
       
 
    
    <label>استان:</label>
    <input type="text" v-model="form.ostan"><br>

    <label>ناحیه:</label>
    <input type="text" v-model="form.nahie"><br>

    <label>حوزه:</label>
    <input type="text" v-model="form.hoze"><br>

    <label>پایگاه:</label>
    <input type="text" v-model="form.paygah"><br>

    <label> شناسه پایگاه:</label>
    <input type="text" v-model="form.shenasePaygah"><br>

    <label> نام قشر:</label>
    <input type="text" v-model="form.nameGheshr"><br>

    <label>نام:</label>
    <input type="text" v-model="form.name"><br>

    <label>نام خانوادگی:</label>
    <input type="text" v-model="form.nameKhanevadegi"><br>

    <label>نام پدر :</label>
    <input type="text" v-model="form.namePedar"><br>

    <label>شماره ملی:</label>
    <input type="text" v-model="form.shomareMelli"><br>

    <label>شماره شناسنامه :</label>
    <input type="text" v-model="form.shomareShenasname"><br>

    <label>تاریخ تولد :</label>
    <input type="text" v-model="form.tarikhTavalod"><br>

    <label>محل تولد :</label>
    <input type="text" v-model="form.mahalTavalod"><br>

    <label>شهرستان:</label>
    <input type="text" v-model="form.sharestan"><br>

    <label>شهر:</label>
    <input type="text" v-model="form.shar"><br>

    <label>بخش:</label>
    <input type="text" v-model="form.bakhsh"><br>

    <label>جنسیت:</label>
    <input type="text" v-model="form.gensiat"><br>

    <label>تاهل:</label>
    <input type="text" v-model="form.taahol"><br>

      <label> گروه خونی:</label>
      <input type="text" v-model="form.goorohKhoon">
      <br>

      <label> وضعیت جسمانی:</label>
      <input type="text" v-model="form.vaziatGesmani">
      <br>

      <label>     فعالیت ویژه:</label>
      <input type="text" v-model="form.faaliatVizhe">
      <br>

      <label>دین:</label>
      <input type="text" v-model="form.din">
      <br>

      <label>Mazhab:</label>
      <input type="text" v-model="form.mazhab">
      <br>

      <label>تابعیت:</label>
      <input type="text" v-model="form.tebeiat">
      <br>

      <label> تحصیلات کلاسیک:</label>
      <input type="text" v-model="form.tahsilatClassic">
      <br>

      <label>رشته تحصیلی :</label>
      <input type="text" v-model="form.reshteTahsili">
      <br>

      <label>تحصیلات حوزوی:</label>
      <input type="text" v-model="form.tahsilatHozavi">
      <br>

      <label>تاریخ پیشبینی اتمام تحصیل :</label>
      <input type="text" v-model="form.tarikhPishBiniEtmamTahsil">
      <br>

      <label> خواندن و نوشتن:</label>
      <input type="text" v-model="form.khandanNeveshtan">
      <br>

      <label>وضعیت شغل :</label>
      <input type="text" v-model="form.vaziatShoghli">
      <br>

      <label>  عنوان دقیق شغل:</label>
      <input type="text" v-model="form.onvanDaghighShoghli">
      <br>

      <label>محصل:</label>
      <input type="text" v-model="form.mohasel">
      <br>

      <label>نظامی:</label>
      <input type="text" v-model="form.nezami">
      <br>

      <label>متخصص:</label>
      <input type="text" v-model="form.motekhases">
      <br>

      <label>خانه دار:</label>
      <input type="text" v-model="form.khanedar">
      <br>

      <label>بازنشسته:</label>
      <input type="text" v-model="form.bazneshaste">
      <br>

      <label>غیره:</label>
      <input type="text" v-model="form.gheydOnvan">
      <br>
      <label>جویای شغل:</label>
          <input type="text" v-model="form.joyaeShoghl"><br>
          <label>سایر:</label>
          <input type="text" v-model="form.sayer"><br>
          <label>عنوان شغلی را نام ببرید:</label>
          <input type="text" v-model="form.onvanShoghlRaNamBebarid"><br>
          <label>وضعیت خدمت عمومی:</label>
          <input type="text" v-model="form.vaziatKhedmatVazifeOmoomi"><br>
          <label>نوع معافیت:</label>
          <input type="text" v-model="form.noeMafiat"><br>
          <label>قومیت:</label>
          <input type="text" v-model="form.ghomiat"><br>
          <label>قومت را بنویسید:</label>
          <input type="text" v-model="form.ghomiatRaNameBebarid"><br>
          <label>سوابق ایثارگری:</label>
          <input type="text" v-model="form.noeIsargariDavtalab"><br>
          <label>نسبت داوطب با ایثارگر:</label>
          <input type="text" v-model="form.nesbatDavtalabBaIsargar"><br>
          <label>استان محل سکونت:</label>
          <input type="text" v-model="form.sokoonatOstan"><br>
          <label>شهرستان محل سکونت:</label>
          <input type="text" v-model="form.sokoonatShahrestan"><br>
          <label>شهر محل سکومت :</label>
          <input type="text" v-model="form.sokoonatShar"><br>
          <label>محله محل سکونت :</label>
          <input type="text" v-model="form.sokoonatMahale"><br>
          <label>خیابان:</label>
          <input type="text" v-model="form.sokoonatKhiaban"><br>
          <label>کوچه :</label>
          <input type="text" v-model="form.sokoonatKooche"><br>
          <label>بلوک:</label>
          <input type="text" v-model="form.sokoonatBoolook"><br>
          <label>پلاک:</label>
          <input type="text" v-model="form.sokoonatPelak"><br>
          <label>طبقه:</label>
          <input type="text" v-model="form.sokoonatTabaghe"><br>
          <label>واحد:</label>
          <input type="text" v-model="form.sokoonatVahed"><br>
          <label>کد:</label>
          <input type="text" v-model="form.sokoonatCodePosti"><br>
          <label>شماره ثابت:</label>
          <input type="text" v-model="form.SokoonatTelephone"><br>

           

          <label>تلفن محل کار:</label>
          <input type="text" v-model="form.sokoonatWorkPhone"><br>
          <label>شماره همراه:</label>
          <input type="text" v-model="form.Telephone"><br>
          <label>آدرس ایمیل:</label>
          <input type="text" v-model="form.sokoonatEmail"><br>
           

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
  
    id: '',
    ostan: '',
    nahie: '',
    hoze: '',
    paygah: '',
    shenasePaygah: '',
    nameGheshr: '',
    name: '',
    nameKhanevadegi: '',
    namePedar: '',
    shomareMelli: '',
    shomareShenasname: '',
    tarikhTavalod: '',
    mahalTavalod: '',
    sharestan: '',
    shar: '',
    bakhsh: '',
    gensiat: '',
    taahol: '',
    goorohKhoon: '',
    vaziatGesmani: '',
    faaliatVizhe: '',
    din: '',
    mazhab: '',
    tebeiat: '',
    tahsilatClassic: '',
    reshteTahsili: '',
    tahsilatHozavi: '',
    tarikhPishBiniEtmamTahsil: '',
    khandanNeveshtan: '',
    vaziatShoghli: '',
    onvanDaghighShoghli: '',
    mohasel: '',
    nezami: '',
    motekhases: '',
    khanedar: '',
    bazneshaste: '',
    gheydOnvan: '',
    joyaeShoghl: '',
    sayer: '',
    onvanShoghlRaNamBebarid: '',
    vaziatKhedmatVazifeOmoomi: '',
    noeMafiat: '',
    ghomiat: '',
    ghomiatRaNameBebarid: '',
    noeIsargariDavtalab: '',
    nesbatDavtalabBaIsargar: '',
    sokoonatOstan: '',
    sokoonatShahrestan: '',
    sokoonatShar: '',
    sokoonatMahale: '',
    sokoonatKhiaban: '',
    sokoonatKooche: '',
    sokoonatBoolook: '',
    sokoonatPelak: '',
    sokoonatTabaghe: '',
    sokoonatVahed: '',
    sokoonatCodePosti: '',
    sokoonatTelephone: '',
    sokoonatWorkPhone: '',
    sokoonatMobile: '',
    sokoonatEmail: ''
         


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
     
        axios.post('http://localhost:8080/Fourth', this.form)

      }
    }
  };
  </script>
  