<template>

    <div id="form" dir="rtl">
    <form @submit.prevent="submitForm">
       
            <h2>تعرفه حفاظت بسیجیان</h2>
        
            <div>
            <label for="idCode">ایدی کد:</label>
            <input type="text" id="idCode" v-model="form.idCode" />
          </div>
          <div>
            <label for="postalCode">کد پستی:</label>
            <input type="text" id="postalCode" v-model="form.postalCode" />
          </div>
          <div>
            <label for="fiftheendigitsBasigi">شناسه ۱۵ رقمی بسیجی:</label>
            <input type="text" id="fiftheendigitsBasigi" v-model="form.fiftheendigitsBasigi" />
          </div>
          <div>
            <label for="name">نام:</label>
            <input type="text" id="name" v-model="form.name" />
          </div>
          <div>
            <label for="lastName">نام خانوادگی :</label>
            <input type="text" id="lastName" v-model="form.lastName" />
          </div>
          <div>
            <label for="fatherName">نام پدر :</label>
            <input type="text" id="fatherName" v-model="form.fatherName" />
          </div>
          <div>
            <label for="passportNumber">شماره شناسنامه :</label>
            <input type="text" id="passportNumber" v-model="form.passportNumber" />
          </div>
          <div>
            <label for="exportPlace">محل صدور:</label>
            <input type="text" id="exportPlace" v-model="form.exportPlace" />
          </div>
          <div>
            <label for="birthPlace">محل تولد :</label>
            <input type="text" id="birthPlace" v-model="form.birthPlace" />
          </div>
          <div>
            <label for="birthday">تاریخ تولد:</label>
            <input type="text" id="birthday" v-model="form.birthday" />
          </div>
          <div>
            <label for="previousNameAndLastName">نام و نام خانوادگی قبلی:</label>
            <input type="text" id="previousNameAndLastName" v-model="form.previousNameAndLastName" />
          </div>
          <div>
            <label for="nameAndLastNameChangeDate">تاریخ تغییر نام و نام خانودگی:</label>
            <input type="text" id="nameAndLastNameChangeDate" v-model="form.nameAndLastNameChangeDate" />
          </div>
          <div>
            <label for="gender">جنسیت:</label>
            <input type="text" id="gender" v-model="form.gender" />
          </div>
          <div>
            <label for="nationality">ملیت:</label>
            <input type="text" id="nationality" v-model="form.nationality" />
          </div>
          <div>
            <label for="marriageStatus"> وضعیت تاهل:</label>
            <input type="text" id="marriageStatus" v-model="form.marriageStatus" />
          </div>
          <div>
            <label for="nickName"> نام مستعار:</label>
            <input type="text" id="nickName" v-model="form.nickName"/>

</div>
<div>
          <label for="previousTabeiat">تابعیت قبلی :</label>
          <input type="text" id="previousTabeiat" v-model="form.previousTabeiat" />
        </div>
        <div>
          <label for="currentTabeiat">تابعیت حال حاضر :</label>
          <input type="text" id="currentTabeiat" v-model="form.currentTabeiat" />
        </div>
        <div>
          <label for="previousRelegion">دین قبلی :</label>
          <input type="text" id="previousRelegion" v-model="form.previousRelegion" />
        </div>
        <div>
          <label for="currentRelegion"> دین فعلی:</label>
          <input type="text" id="currentRelegion" v-model="form.currentRelegion" />
        </div>
        <div>
          <label for="previousMazhab">مذهب قبلی :</label>
          <input type="text" id="previousMazhab" v-model="form.previousMazhab" />
        </div>
        <div>
          <label for="currentMazhab"> مذهب فعلی:</label>
          <input type="text" id="currentMazhab" v-model="form.currentMazhab" />
        </div>
        <div>
          <label for="margaTaghlid">مرجع تقلید :</label>
          <input type="text" id="margaTaghlid" v-model="form.margaTaghlid" />
        </div>
        <div>
          <label for="normalRegistrationDate">تاریخ عضویت عادی  :</label>
          <input type="text" id="normalRegistrationDate" v-model="form.normalRegistrationDate" />
        </div>
        <div>
          <label>استان:</label>
          <input type="text" v-model="form.state">
        </div>
        <div>
          <label>ناحیه:</label>
          <input type="text" v-model="form.zone">
        </div>
        <div>
          <label>حوزه:</label>
          <input type="text" v-model="form.hoze">
        </div>
        <div>
          <label>کانون:</label>
          <input type="text" v-model="form.kanoon">
        </div>
        <div>
          <label>قشر:</label>
          <input type="text" v-model="form.gheshr">
        </div>
        <div>
          <label>پایگاه:</label>
          <input type="text" v-model="form.paygah">
        </div>
        <div>
          <label>آدرس:</label>
          <input type="text" v-model="form.address">
        </div>
        <div>
          <label>ایمیل:</label>
          <input type="email" v-model="form.email">
        </div>
        <div>
          <label>شماره همراه :</label>
          <input type="tel" v-model="form.mobileNumber">
        </div>
        <div>
          <label>شماره ثابت:</label>
          <input type="tel" v-model="form.telephone">
        </div>
        <div>
          <label>نشانی بلاگ شخصی :</label>
          <input type="url" v-model="form.personalBlog">
        </div>
        <div>
          <label>تلفن محل کار:</label>
          <input type="tel" v-model="form.workPlaceTelephone">
        </div>
        <div>
          <label>تحصیلات:</label>
          <input type="text" v-model="form.education">
        </div>
        <div>
          <label>مقطع تحصیلی:</label>
          <input type="text" v-model="form.maghtaTahsili">
        </div>
        <div>
          <label> رشته دبیرستان:</label>
          <input type="text" v-model="form.dabirestanReshte">
        </div>
        <div>
        <label for="dabirestanNameMarkaz">نام مرکز:</label>
        <input type="text" id="dabirestanNameMarkaz" v-model="form.dabirestanNameMarkaz">
      </div>
      <div>
        <label for="dabirestanKeshvar">کشور:</label>
        <input type="text" id="dabirestanKeshvar" v-model="form.dabirestanKeshvar">
      </div>
      <div>
        <label for="dabirestanOstan">استان:</label>
        <input type="text" id="dabirestanOstan" v-model="form.dabirestanOstan">
      </div>
      <div>
        <label for="dabirestanShahr">شهر:</label>
        <input type="text" id="dabirestanShahr" v-model="form.dabirestanShahr">
      </div>
      <div>
        <label for="dabirestanBakhsh">بخش:</label>
        <input type="text" id="dabirestanBakhsh" v-model="form.dabirestanBakhsh">
      </div>
      <div>
        <label for="dabirestanSalShooro">سال شروع :</label>
        <input type="text" id="dabirestanSalShooro" v-model="form.dabirestanSalShooro">
      </div>
      <div>
        <label for="dabirestanSaleKhateme">سال پایان :</label>
        <input type="text" id="dabirestanSaleKhateme" v-model="form.dabirestanSaleKhateme">
      </div>
      <div>
        <label for="dabirestanDesc">توضیحات:</label>
        <textarea id="dabirestanDesc" v-model="form.dabirestanDesc"></textarea>
      </div>

      <h2>اطلاعات کاردانی</h2>
      <div>
        <label for="kardaniReshte">رشته:</label>
        <input type="text" id="kardaniReshte" v-model="form.kardaniReshte">
      </div>
      <div>
        <label for="kardaniNameMarkaz">نام مرکز:</label>
        <input type="text" id="kardaniNameMarkaz" v-model="form.kardaniNameMarkaz">
      </div>
      <div>
        <label for="kardaniKeshvar">کشور:</label>
        <input type="text" id="kardaniKeshvar" v-model="form.kardaniKeshvar">
      </div>
      <div>
        <label for="kardaniOstan">استان:</label>
        <input type="text" id="kardaniOstan" v-model="form.kardaniOstan">
      </div>
      <div>
        <label for="kardaniShahr">شهر:</label>
        <input type="text" id="kardaniShahr" v-model="form.kardaniShahr">
      </div>
      <div>
        <label for="kardaniBakhsh">بخش:</label>
        <input type="text" id="kardaniBakhsh" v-model="form.kardaniBakhsh">
</div>
<label>سال شروع کاردانی:</label>
        <input type="text" v-model="form.karshenasiSaleShooro">

        <label>سال خاتمه کاردانی:</label>
        <input type="text" v-model="form.karshenasiSaleKhateme">

        <label>توضیحات کاردانی:</label>
        <textarea v-model="form.karshenasiDesc"></textarea>

        <label>رشته کارشناسی ارشد:</label>
        <input type="text" v-model="form.arshadReshte">

        <label>نام مرکز:</label>
        <input type="text" v-model="form.arshadNameMarkaz">

        <label>کشور :</label>
        <input type="text" v-model="form.arshadKeshvar">

        <label>استان :</label>
        <input type="text" v-model="form.arshadOstan">

        <label>شهر:</label>
        <input type="text" v-model="form.arshadBakhsh">

        <label>سال شروع:</label>
        <input type="text" v-model="form.arshadSaleShooro">

        <label>سال پایان:</label>
        <input type="text" v-model="form.arshadSaleKhateme">

        <label>توضیحات:</label>
        <textarea v-model="form.arshadDesc"></textarea>

        <label>رشته دکتری:</label>
        <input type="text" v-model="form.drReshte">

        <label>نام مرکز دکتری:</label>
        <input type="text" v-model="form.drNameMarkaz">

        <label>کشور:</label>
        <input type="text" v-model="form.drKeshvar">

        <label>استان:</label>
        <input type="text" v-model="form.drOstan">

        <label>بخش:</label>
        <input type="text" v-model="form.drBakhsh">

        <label>سال شروع:</label>
        <input type="text" v-model="form.drSaleShooro">

        <label>سال خاتمه:</label>
        <input type="text" v-model="form.drSaleKhateme">

        <label>توضیحات:</label>
        <textarea v-model="form.drDesc"></textarea>

        <label>شغل فعلی:</label>
        <input type="text" v-model="form.currentShogl">

        <label>نوع فعالیت حال حاضر:</label>
        <input type="text" v-model="form.currentNooFaaliat">

        <label>موسسه حال حاضر:</label>
        <input type="text" v-model="form.currentMoassese">

        <label>مالک موسسه:</label>
        <input type="text" v-model="form.currentMalekiat">

        <label for="currentTabeiatMossese">تابعیت موسسه:</label>
        <input type="text" id="currentTabeiatMossese" v-model="form.currentTabeiatMossese"><br>

        <label for="currentMosseseKeshvar">کشور:</label>
        <input type="text" id="currentMosseseKeshvar" v-model="form.currentMosseseKeshvar"><br>

        <label for="currentMosseseState">استان:</label>
        <input type="text" id="currentMosseseState" v-model="form.currentMosseseState"><br>

        <label for="currentMosseseCity">شهر:</label>
        <input type="text" id="currentMosseseCity" v-model="form.currentMosseseCity"><br>

        <label for="currentMosseseFrom">تاریخ شروع:</label>
        <input type="date" id="currentMosseseFrom" v-model="form.currentMosseseFrom"><br>

        <label for="currentMosseseTo">تاریخ پایان:</label>
        <input type="date" id="currentMosseseTo" v-model="form.currentMosseseTo"><br>

        <label for="currentReasonOfResigning">علت کناره گیری از شغل یا فعالیت:</label>
        <input type="text" id="currentReasonOfResigning" v-model="form.currentReasonOfResigning"><br>

        <label for="previousShogl">شغل قبلی:</label>
        <input type="text" id="previousShogl" v-model="form.previousShogl"><br>

        <label for="previousNooFaaliat">نوع فعالیت:</label>
        <input type="text" id="previousNooFaaliat" v-model="form.previousNooFaaliat"><br>

        <label for="previousMoassese">موسسه:</label>
        <input type="text" id="previousMoassese" v-model="form.previousMoassese"><br>

        <label for="previousMalekiat">مالکیت موسسه:</label>
        <input type="text" id="previousMalekiat" v-model="form.previousMalekiat"><br>

        <label for="previousTabeiatMossese">تابعیت موسسه:</label>
        <input type="text" id="previousTabeiatMossese" v-model="form.previousTabeiatMossese"><br>

        <label for="previousMosseseKeshvar">کشور:</label>
        <input type="text" id="previousMosseseKeshvar" v-model="form.previousMosseseKeshvar"><br>

        <label for="previousMosseseState">استان:</label>
        <input type="text" id="previousMosseseState" v-model="form.previousMosseseState"><br>

        <label for="previousMosseseCity">شهر  :</label>
        <input type="text" id="previousMosseseCity" v-model="form.previousMosseseCity"><br>

        <label for="previousMosseseFrom">تاریخ شروع: </label>
        <input type="text" id="previousMosseseFrom" v-model="form.previousMosseseFrom"><br>


        <label for="previousMosseseTo">تاریخ پایان:</label>
        <input type="text" id="previousMosseseTo" v-model="form.previousMosseseTo"><br>

        <label for="previousReasonOfResigning">علت کناره گیری از شغل یا فعالیت: </label>
        <input type="text" id="previousReasonOfResigning" v-model="form.previousReasonOfResigning"><br>

  
            <label for="timeInFrontAsMonth">سوابق حضور در جبهه به ماه:</label>
            <input type="text" id="timeInFrontAsMonth" v-model="form.timeInFrontAsMonth">
            <label for="handicapOrInjuryPercentage">درصد جانبازی:</label>
            <input type="text" id="handicapOrInjuryPercentage" v-model="form.handicapOrInjuryPercentage">
            <label for="captivityAsMonth">مدت اسارت یا گروگان بودن:</label>
            <input type="text" id="captivityAsMonth" v-model="form.captivityAsMonth">
            <label for="freedomRate">رتبه آزادگی:</label>
            <input type="text" id="freedomRate" v-model="form.freedomRate">
            <label for="sabegheHamkariBanahad">سابقه همکاری با نهاد های انقلاب:</label>
            <input type="text" id="sabegheHamkariBanahad" v-model="form.sabegheHamkariBanahad">
            <label for="nooHamkari">نوع همکاری:</label>
            <input type="text" id="nooHamkari" v-model="form.nooHamkari">
            <label for="hamkariFrom">مدت همکاری از:</label>
            <input type="text" id="hamkariFrom" v-model="form.hamkariFrom">
            <label for="hamkariTo">تا:</label>
            <input type="text" id="hamkariTo" v-model="form.hamkariTo">
            <label for="elatghatHamkari">علت قطع همکاری:</label>
            <input type="text" id="elatghatHamkari" v-model="form.elatghatHamkari">
            <label for="vabastegiBeKhanevadeIsarGaran">وابستگی به خانواده ایثارگران:</label>
            <input type="text" id="vabastegiBeKhanevadeIsarGaran" v-model="form.vabastegiBeKhanevadeIsarGaran">
            <label for="fullNameIsargar">نام کامل ایثارگر:</label>
            <input type="text" id="fullNameIsargar" v-model="form.fullNameIsargar">
            <label for="nesbatIsargarBaShoma">نسبت با شما:</label>
            <input type="text" id="nesbatIsargarBaShoma" v-model="form.nesbatIsargarBaShoma">
            <label for="firstState">استان:</label>
            <input type="text" id="firstState" v-model="form.firstState">
            <label for="firstZone">ناحیه:</label>
            <input type="text" id="firstZone" v-model="form.firstZone">
            <label for="firstMarkazMoghavemat">مرکز مقاومت:</label>
            <input type="text" id="firstMarkazMoghavemat" v-model="form.firstMarkazMoghavemat">

            <label for="firstModatFrom">شروع همکاری از:</label>
            <input type="text" id="firstModatFrom" v-model="form.firstModatFrom">
            <label for="firstModatTo">تا:</label>
            <input type="text" id="firstModatTo" v-model="form.firstModatTo">
            <label for="firstNoe">نوع عضویت:</label>
            <input type="text" id="firstNoe" v-model="form.firstNoe">
            <label for="firstZekrMasooliat">نوع فعالیت و ذکر مسئولیت:</label>
            <input type="text" id="firstZekrMasooliat" v-model="form.firstZekrMasooliat">
    
            <label for="secondPaygahMoghavemat">مرکز مقاومت:</label>
            <input type="text" id="secondPaygahMoghavemat" v-model="form.secondPaygahMoghavemat">
            <label for="secondState">استان:</label>
            <input type="text" id="secondState" v-model="form.secondState">
            <label for="secondZone">ناحیه:</label>
            <input type="text" id="secondZone" v-model="form.secondZone">
            <label for="secondMarkazMoghavemat">مرکز مقاومت:</label>
            <input type="text" id="secondMarkazMoghavemat" v-model="form.secondMarkazMoghavemat">

            <label for="secondModatFrom">شروع همکاری از:</label>
            <input type="text" id="secondModatFrom" v-model="form.secondModatFrom">
            <label for="secondModatTo">تا:</label>
            <input type="text" id="secondModatTo" v-model="form.secondModatTo">
            <label for="secondNoe">نوع عضویت:</label>
            <input type="text" id="secondNoe" v-model="form.secondNoe">
            <label for="fsecondZekrMasooliat">نوع فعالیت و ذکر مسئولیت:</label>
            <input type="text" id="secondZekrMasooliat" v-model="form.secondZekrMasooliat">

            
            <label>استان محل سکونت پنج سال گذشته:</label>
          <input type="text" v-model="fiveYearsFirstState"><br>
          <label>شهر:</label>
          <input type="text" v-model="fiveYearsFirstShahr"><br>
          <label>آدرس:</label>
          <input type="text" v-model="fiveYearsFirstAddress"><br>
          <label>از تاریخ:</label>
          <input type="text" v-model="fiveYearsFirstFrom"><br>
          <label>تا:</label>
          <input type="text" v-model="fiveYearsFirstTo"><br>
          <label>شماره ثابت:</label>
          <input type="text" v-model="fiveYearsFirstTelephone"><br>
        </form>
        <h2>دومین آدرس</h2>
        <form>
          <label>استان:</label>
          <input type="text" v-model="fiveYearsSecondState"><br>
          <label>شهر:</label>
          <input type="text" v-model="fiveYearsSecondShahr"><br>
          <label>آدرس:</label>
          <input type="text" v-model="fiveYearsSecondAddress"><br>
          <label>از تاریخ:</label>
          <input type="text" v-model="fiveYearsSecondFrom"><br>
          <label>تا:</label>
          <input type="text" v-model="fiveYearsSecondTo"><br>
          <label>شماره ثابت:</label>
          <input type="text" v-model="fiveYearsSecondTelephone"><br>

           
        <button v-on:click="submitForm">ذخیره</button>
      
</form>
</div> 
 
    </template>
  
  <script>
  import axios from 'axios';
  export default {
    name:'form',
    data() {
      return {
        form: {
            idCode: '',
    postalCode: '',
    fiftheendigitsBasigi: '',
    name: '',
    lastName: '',
    fatherName: '',
    passportNumber: '',
    exportPlace: '',
    birthPlace: '',
    birthday: '',
    previousNameAndLastName: '',
    nameAndLastNameChangeDate: '',
    gender: '',
    nationality: '',
    marriageStatus: '',
    nickName: '',
    previousTabeiat: '',
    currentTabeiat: '',
    previousRelegion: '',
    currentRelegion: '',
    previousMazhab: '',
    currentMazhab: '',
    margaTaghlid: '',
    normalRegistrationDate: '',
    state: '',
    zone: '',
    hoze: '',
    kanoon: '',
    gheshr: '',
    paygah: '',
    address: '',
    email: '',
    mobileNumber: '',
    telephone: '',
    personalBlog: '',
    workPlaceTelephone: '',
    education: '',
    maghtaTahsili: '',
    dabirestanReshte: '',
    dabirestanNameMarkaz: '',
    dabirestanKeshvar: '',
    dabirestanOstan: '',
    dabirestanShahr: '',
    dabirestanBakhsh: '',
    dabirestanSalShooro: '',
    dabirestanSaleKhateme: '',
    dabirestanDesc: '',
    kardaniReshte: '',
    kardaniNameMarkaz: '',
    kardaniKeshvar: '',
    kardaniOstan: '',
    kardaniShahr: '',
    kardaniBakhsh: '',
    kardaniSaleShooro: '',
    kardaniSaleKhateme: '',
    kardaniDesc: '',
    karshenasiReshte: '',
    karshenasiNameMarkaz: '',
    karshenasiKeshvar: '',
    karshenasiOstan: '',
    karshenasiBakhsh: '',
    karshenasiSaleShooro: '',
    karshenasiSaleKhateme: '',
    karshenasiDesc: '',
    arshadReshte: '',
    arshadNameMarkaz: '',
    arshadKeshvar: '',
    arshadOstan: '',
    arshadBakhsh: '',
    arshadSaleShooro: '',
    arshadSaleKhateme: '',
    arshadDesc: '',
    drReshte: '',
    drNameMarkaz: '',
    drKeshvar: '',
    drOstan: '',
    drBakhsh: '',
    drSaleShooro: '',
    drSaleKhateme: '',
    drDesc: '',
    currentShogl: '',
    currentNooFaaliat: '',
    currentMoassese: '',
    currentMalekiat: '',
    currentTabeiatMossese: '',
    currentMosseseKeshvar: '',
    currentMosseseState: '',
    currentMosseseCity: '',
    currentMosseseFrom: '',
    currentMosseseTo: '',
    currentReasonOfResigning: '',
    previousShogl: '',
    previousNooFaaliat: '',
    previousMoassese: '',
    previousMalekiat: '',
    previousTabeiatMossese: '',
    previousMosseseKeshvar: '',
    previousMosseseState: '',
    previousMosseseCity: '',
    previousMosseseFrom: '',
    previousMosseseTo: '',
    previousReasonOfResigning: '',
    timeInFrontAsMonth: '',
    handicapOrInjuryPercentage: '',
    captivityAsMonth: '',
    freedomRate: '',
    sabegheHamkariBanahad: '',
    nooHamkari: '',
    hamkariFrom: '',
    hamkariTo: '',
    elatghatHamkari: '',
    vabastegiBeKhanevadeIsarGaran: '',
    fullNameIsargar: '',
    nesbatIsargarBaShoma: '',
    firstState: '',
    firstZone: '',
    firstMarkazMoghavemat: '',
    firstHozeMoghavemat: '',
    firstPaygahMoghavemat: '',
    firstModatFrom: '',
    firstModatTo: '',
    firstNoe: '',
    firstZekrMasooliat: '',
    secondState: '',
    secondZone: '',
    secondMarkazMoghavemat: '',
    secondHozeMoghavemat: '',
    secondPaygahMoghavemat: '',
    secondModatFrom: '',
    secondModatTo: '',
    secondNoe: '',
    secondZekrMasooliat: '',
    fiveYearsFirstState: '',
    fiveYearsFirstShahr: '',
    fiveYearsFirstAddress: '',
    fiveYearsFirstFrom: '',
    fiveYearsFirstTo: '',
    fiveYearsFirstTelephone: '',
    fiveYearsSecondState: '',
    fiveYearsSecondShahr: '',
    fiveYearsSecondAddress: '',
    fiveYearsSecondFrom: '',
    fiveYearsSecondTo: '',
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
     
        axios.post('http://localhost:8080/second', this.form)

      }
    }
  };
  </script>
  