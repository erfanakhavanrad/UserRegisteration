<template>

    <div id="form3" dir="rtl">
    <form @submit.prevent="submitForm">
       
            <!-- <h2>تعرفه حفاظت بسیجیان</h2> -->
       
 
        <label for="nameKhanevadegi">نام خانوادگی</label>
        <input type="text" id="nameKhanevadegi" v-model="form.nameKhanevadegi"><br>

        <label for="nesbat">نسبت</label>
        <input type="text" id="nesbat" v-model="nesbat"><br>

        <label for="noeFaaliatSiasi">نوع فعالیت سیاسی اجتماعی</label>
        <input type="text" id="noeFaaliatSiasi" v-model="form.noeFaaliatSiasi"><br>

        <label for="nameTashakol">نام تشکل</label>
        <input type="text" id="nameTashakol" v-model="form.nameTashakol"><br>

        <label for="mahalFaaliat">محل فعالیت</label>
        <input type="text" id="mahalFaaliat" v-model="form.mahalFaaliat"><br>

        <label for="nooFaaliat">نوع فعالیت تشکل</label>
        <input type="text" id="nooFaaliat" v-model="form.nooFaaliat"><br>

        <label for="nooFaaliatShomaBaBastegan">نوع فعالیت با بستگان </label>
        <input type="text" id="nooFaaliatShomaBaBastegan" v-model="form.nooFaaliatShomaBaBastegan"><br>

        <label for="angizeHamkari">انگیزه همکاری و ارتباط و نحوه اشنایی</label>
        <input type="text" id="angizeHamkari" v-model="form.angizeHamkari"><br>

        <label for="modatHamkariAs">مدت همکاری از</label>
        <input type="date" id="modatHamkariAs" v-model="form.modatHamkariAs"><br>

        <label for="modatHamkariTa">مدت همکاری تا</label>
        <input type="date" id="modatHamkariTa" v-model="form.modatHamkariTa"><br>

        <label for="elatGhatHamkari">علت قطع همکاری</label>
        <input type="text" id="elatGhatHamkari" v-model="form.elatGhatHamkari"><br>

        <label for="kadrNamoNameKhanevadegi">نام و نام خانوادگی</label>
        <input type="text" id="kadrNamoNameKhanevadegi" v-model="form.kadrNamoNameKhanevadegi"><br>

        <label for="kadrNamePedar">نام پدر  </label>
        <input type="text" id="kadrNamePedar" v-model="form.kadrNamePedar"><br>

        <label for="kadrNesbat">نسبت </label>
        <input type="text" id="kadrNesbat" v-model="form.kadrNesbat"><br>



          <div>
            <label for="kadrSeShoghl">نوع اتهام:</label>
            <input type="text" id="kadrSeShoghl" v-model="form.kadrSeShoghl">
          </div>
          <div>
            <label for="kadrSeNameKeshvar">تاریخ اعدام زندانی قرار:</label>
            <input type="text" id="kadrSeNameKeshvar" v-model="form.kadrSeNameKeshvar">
          </div>
          <div>
            <label for="kadrSeModatEghamat">در صورت زندانی یا فراری بودن وضعیت فعلی  :</label>
            <input type="text" id="kadrSeModatEghamat" v-model="form.kadrSeModatEghamat">
          </div>

          <div>
            <label for="kadrSeNamoNameKhanevadegi"> نام و نام خانوادگی پناهنده:</label>
            <input type="text" id="kadrSeNamoNameKhanevadegi" v-model="form.kadrSeNamoNameKhanevadegi">
          </div>  <div>
            <label for="kadrSeNamePedar"> نام پدر:</label>
            <input type="text" id="kadrSeNamePedar" v-model="form.kadrSeNamePedar">
          </div>  <div>
            <label for="kadrSeNesbat"> نسبت:</label>
            <input type="text" id="kadrSeNesbat" v-model="form.kadrSeNesbat">
          </div>  <div>
            <label for="kadrSeShoghl"> شغل:</label>
            <input type="text" id="kadrSeShoghl" v-model="form.kadrSeShoghl">
          </div>


          <div>
            <label for="kadrSeTabeiat"> تابعیت:</label>
            <input type="text" id="kadrSeTabeiat" v-model="form.kadrSeTabeiat">
          </div>
          <div>
            <label for="kadrSePanahandegi">پناهندگی  :</label>
            <input type="text" id="kadrSePanahandegi" v-model="form.kadrSePanahandegi">
          </div>
          <div>
            <label for="kadrSeMosaferat">مسافرت:</label>
            <input type="text" id="kadrSeMosaferat" v-model="form.kadrSeMosaferat">
          </div>
          <div>
            <label for="kadrSeTahmil">تحصیل:</label>
            <input type="text" id="kadrSeTahmil" v-model="form.kadrSeTahmil">
          </div>
          <div>
            <label for="kadrSeGheire">غیره:</label>
            <input type="text" id="kadrSeGheire" v-model="form.kadrSeGheire">
          </div>
          <div>
            <label for="kadrChaharNameKhanevadegi">نام و نام خانوادگی دوستان نزدیک:</label>
            <input type="text" id="kadrChaharNameKhanevadegi" v-model="form.kadrChaharNameKhanevadegi">
          </div>
          <div>
            <label for="kadrChaharNamePedar">نام پدر:</label>
            <input type="text" id="kadrChaharNamePedar" v-model="form.kadrChaharNamePedar">
          </div>
          <div>
            <label for="kadrChaharSen">سن:</label>
            <input type="text" id="kadrChaharSen" v-model="form.kadrChaharSen">
          </div>

          <div>
            <label for="kadrChaharShoghlFeli">شغل فعلی:</label>
            <input type="text" id="kadrChaharShoghlFeli" v-model="form.kadrChaharShoghlFeli">
          </div> <div>
            <label for="kadrChaharShoghlGhabli">شغل قبلی:</label>
            <input type="text" id="kadrChaharShoghlGhabli" v-model="form.kadrChaharShoghlGhabli">
          </div> <div>
            <label for="kadrChaharModatAshnaei">مدت آشنایی:</label>
            <input type="text" id="kadrChaharModatAshnaei" v-model="form.kadrChaharModatAshnaei">
          </div>
          <div>
            <label for="kadrChaharNeshani">نشانی:</label>
            <input type="text" id="kadrChaharNeshani" v-model="form.kadrChaharNeshani">
          </div>

         
        <label for="kadrChaharTelephone">تلفن ثابت:</label>
        <input type="text" id="kadrChaharTelephone" v-model="form.kadrChaharTelephone"><br><br>
        
        <label for="kadrPanjNameKhanevadegi">نام ونام خانوادگی بستگان درجه یک:</label>
        <input type="text" id="kadrPanjNameKhanevadegi" v-model="form.kadrPanjNameKhanevadegi"><br><br>
        
        <label for="kadrPanjNamePedar">نام پدر:</label>
        <input type="text" id="kadrPanjNamePedar" v-model="form.kadrPanjNamePedar"><br><br>
        
        <label for="kadrPanjNesbat">نسبت:</label>
        <input type="text" id="kadrPanjNesbat" v-model="form.kadrPanjNesbat"><br><br>
        
        <label for="kadrPanjSen">سن:</label>
        <input type="text" id="kadrPanjSen" v-model="form.kadrPanjSen"><br><br>
        
        <label for="kadrPanjTahsilat">تحصیلات:</label>
        <input type="text" id="kadrPanjTahsilat" v-model="form.kadrPanjTahsilat"><br><br>
        
        <label for="kadrPanjShoghl">شغل:</label>
        <input type="text" id="kadrPanjShoghl" v-model="form.kadrPanjShoghl"><br><br>
        
        <label for="kadrPanjTabeiat">تابعیا:</label>
        <input type="text" id="kadrPanjTabeiat" v-model="form.kadrPanjTabeiat"><br><br>
        
        <label for="kadrPanjDin">دین:</label>
        <input type="text" id="kadrPanjDin" v-model="form.kadrPanjDin"><br><br>
        
        <label for="kadrPanjMazhab">مذهب:</label>
        <input type="text" id="kadrPanjMazhab" v-model="form.kadrPanjMazhab"><br><br>
        
        <label for="kadrPanjDarGheyd">در قید:</label>
        <input type="text" id="kadrPanjDarGheyd" v-model="form.kadrPanjDarGheyd"><br><br>
        
        <label for="iAgree">تاییده موافق با کلیه  سوالات موجود در این تعرفه را صادقانه و کامل پاسخ داده ام/:</label>
        <input type="checkbox" id="iAgree" v-model="form.iAgree"><br><br>
        

           
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
    nameKhanevadegi: '',
    nesbat: '',
    noeFaaliatSiasi: '',
    nameTashakol: '',
    mahalFaaliat: '',
    nooFaaliat: '',
    nooFaaliatShomaBaBastegan: '',
    angizeHamkari: '',
    modatHamkariAs: '',
    modatHamkariTa: '',
    elatGhatHamkari: '',
    kadrNamoNameKhanevadegi: '',
    kadrNamePedar: '',
    kadrNesbat: '',
    kadrNoEtteham: '',
    kadrTerikhEdamZendani: '',
    kadrVaziatFeli: '',
    kadrMizanErtebat: '',
    mahalKeshvar: '',
    mahalOstan: '',
    kadrSeNamoNameKhanevadegi: '',
    kadrSeNamePedar: '',
    kadrSeNesbat: '',
    kadrSeShoghl: '',
    kadrSeNameKeshvar: '',
    kadrSeModatEghamat: '',
    kadrSeTabeiat: '',
    kadrSePanahandegi: '',
    kadrSeMosaferat: '',
    kadrSeTahmil: '',
    kadrSeGheire: '',
    kadrChaharNameKhanevadegi: '',
    kadrChaharNamePedar: '',
    kadrChaharSen: '',
    kadrChaharShoghlFeli: '',
    kadrChaharShoghlGhabli: '',
    kadrChaharModatAshnaei: '',
    kadrChaharNeshani: '',
    kadrChaharTelephone: '',
    kadrPanjNameKhanevadegi: '',
    kadrPanjNamePedar: '',
    kadrPanjNesbat: '',
    kadrPanjSen: '',
    kadrPanjTahsilat: '',
    kadrPanjShoghl: '',
    kadrPanjTabeiat: '',
    kadrPanjDin: '',
    kadrPanjMazhab: '',
    kadrPanjDarGheyd: '',
    iAgree: false
            


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
     
        axios.post('http://localhost:8080/third', this.form)

      }
    }
  };
  </script>
  