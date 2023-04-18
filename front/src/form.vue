<template>

    <div id="form" dir="rtl">
    <form @submit.prevent="submitForm">
        <div v-if="page === 1">
            <h2>مشخصات فردی و ایثارگری</h2>
            <label>نام:</label>
        <input type="text" v-model="form.name">
        <label>نام خانوادگی:</label>
        <input type="text" v-model="form.lastName">
        <label>نام پدر:</label>
        <input type="text" v-model="form.fatherName">
        <label>کد ملی:</label>
        <input type="text" v-model="form.idCode">
        <label>شماره شناسنامه:</label>
        <input type="text" v-model="form.passportNumber">
        <label>تولد:</label>
        <input type="text" v-model="form.birthday">
    
        <label>محل تولد:</label>
        <input type="text" v-model="form.birthPlace">
        <label>محل صدور:</label>
        <input type="text" v-model="form.DataexportPlace">
        <label>جنسیت:</label>
        <input type="text" v-model="form.gender">
        <label>مذهب:</label>
        <input type="text" v-model="form.religion">
        <label>گروه خونی:</label>
        <input type="text" v-model="form.bloodyType">
        <label>وضعیت تاهلل:</label>
        <input type="text" v-model="form.marriageStatus">

        <label>تعداد فرزند:</label>
        <input type="text" v-model="form.kidsNumber">
        <label>شماره همراه:</label>
        <input type="text" v-model="form.mobileNumber">
        <label>ایمیل:</label>
        <input type="text" v-model="form.email">
        <label>آدرس:</label>
        <input type="text" v-model="form.address">
        <label>کدپستی:</label>
        <input type="text" v-model="form.postalCode">
        <label>تلفن ثابت:</label>
        <input type="text" v-model="form.telephone">
      

        <label>آدرس محل کار:</label>
        <input type="text" v-model="form.workPlaceAddress">
        <label>تلفن محل کار:</label>
        <input type="text" v-model="form.workPlaceTelephone">
        <label>فکس:</label>
        <input type="text" v-model="form.fax">
        <label>میزان حضور در جبهه ماه:</label>
        <input type="text" v-model="form.timeInFrontAsMonth">
        <label>درصد جانبازی:</label>
        <input type="text" v-model="form.handicapPercentage">
        <label>مدت اسارت به ماه:</label>
        <input type="text" v-model="form.captivityAsMonth">
        <label>خانواده شهید:</label>
        <input type="text" v-model="form.martyrFamily">
        <label>خانواده جانباز:</label>
        <input type="text" v-model="form.captivityFamily">
        <button v-on:click="page--">صفحه قبل</button>
        <button v-on:click="page++">بعدی</button>
</div>
<div v-if="page === 2">
    <h2>سوابق تحصیلی و آموزشی</h2>
    <div class="form-group">
          <label>سطح حوزوی:</label>
          <input type="text" v-model="form.hozoaviLevel" class="form-control">
        </div>
        <div class="form-group">
          <label>تحصیلات حوزوی:</label>
          <input type="text" v-model="form.studyHoze" class="form-control">
        </div>
        <div class="form-group">
          <label>آخرین مدرک دانشگاهی:</label>
          <input type="text" v-model="form.lastDegree" class="form-control">
        </div>
        <div class="form-group">
          <label>سال اخذ مدرک :</label>
          <input type="text" v-model="form.graduationYear" class="form-control">
        </div>
        <div class="form-group">
          <label>دانشگاه:</label>
          <input type="text" v-model="form.university" class="form-control">
        </div>
        <div class="form-group">
          <label>محل تحصیل:</label>
          <input type="text" v-model="form.graduationCity" class="form-control">
        </div>
       
    
      
        <div class="form-group">
          <label>رشته تحصیلی:</label>
          <input type="text" v-model="form.field" class="form-control">
        </div>
        <div class="form-group">
          <label>گرایش:</label>
          <input type="text" v-model="form.fieldOrientation" class="form-control">
        </div>
        <div class="form-group">
          <label>عنوان پایان نامه:</label>
          <input type="text" v-model="form.dissertationTitle" class="form-control">
        </div>
        
        <div class="form-group">
            <label>تسلط کامل به زبان های خارجه</label>
          <label>انگلیسی:</label>
          <input type="text" v-model="form.english" class="form-control">
        </div>
        <div class="form-group">
          <label>عربی:</label>
          <input type="text" v-model="form.arabic" class="form-control">
        </div>
        <div class="form-group">
          <label>فرانسه:</label>
          <input type="text" v-model="form.french" class="form-control">
        </div>
        <div class="form-group">
          <label>اسپانیایی:</label>
          <input type="text" v-model="form.spanish" class="form-control">
        </div>
        <div class="form-group">
          <label>المانی:</label>
          <input type="text" v-model="form.german" class="form-control">
        </div>
        <div class="form-group">
          <label>روسی:</label>
          <input type="text" v-model="form.russian" class="form-control">
        </div>
        <div class="form-group">
          <label>دیگر:</label>
          <input type="text" v-model="form.others" class="form-control">
        </div>
        <button v-on:click="page--">صفحه قبل</button>
        <button v-on:click="page++">بعدی</button>
    </div>
        <div v-if="page === 3">
    <h2>سوابق  پژوهشی</h2>
        <label for="iSINamayeCount">تعداد مقالات نمایه شده ISI:</label>
        <input type="text" v-model="form.iSINamayeCount" id="iSINamayeCount"><br><br>
        <label for="iSCNamayeCount">تعداد مقالات نمایه شده ISC:</label>
        <input type="text" v-model="form.iSCNamayeCount" id="iSCNamayeCount"><br><br>
        <label for="scientificResearchesCount">تعداد مقالات علمی-پژوهشی:</label>
        <input type="text" v-model="form.scientificResearchesCount" id="scientificResearchesCount"><br><br>
        <label for="internationalPresentedResearchesCount">تعداد مقالات ارایه شده در کنفرانس های بین المللی :</label>
        <input type="text" v-model="form.internationalPresentedResearchesCount" id="internationalPresentedResearchesCount"><br><br>
        <label for="researchesInternalAndSpecializedMagazinesCount">تعداد مقالات در کنفرانس های داخلی و مجلات تخصصی:</label>
        <input type="text" v-model="form.researchesInternalAndSpecializedMagazinesCount" id="researchesInternalAndSpecializedMagazinesCount"><br><br>
        <label for="finishedResearchesCount">تعداد پژوهش های پایان یافته:</label>
        <input type="text" v-model="form.finishedResearchesCount" id="finishedResearchesCount"><br><br>
        <label for="writtenBooksCount">تعداد کتاب های تالیف شده:</label>
        <input type="text" v-model="form.writtenBooksCount" id="writtenBooksCount"><br><br>
        <label for="translatedBooksCount">کتاب های ترجمه شده:</label>
        <input type="text" v-model="form.translatedBooksCount" id="translatedBooksCount"><br><br>
        <label for="registeredInventionsCount">تعداد اختراعات دارای گواهی تایید:</label>
        <input type="text" v-model="form.registeredInventionsCount" id="registeredInventionsCount"><br><br>
        <label for="internationConferenceAttendanceCount">تعداد حضور در سمینار های خارجی:</label>
        <input type="text" v-model="form.internationConferenceAttendanceCount" id="internationConferenceAttendanceCount"><br><br>
        <label for="scientificMeetingsHeldCount">تعداد برگزاری نشست های علمی:</label>
        <input type="text" v-model="form.scientificMeetingsHeldCount" id="scientificMeetingsHeldCount"><br><br>
        <label for="internationMeetingsHeldCount">تعداد برگزاری همایش های بین المللی:</label>
        <input type="text" v-model="form.internationMeetingsHeldCount" id="internationMeetingsHeldCount"><br><br>
        <button v-on:click="page--">صفحه قبل</button>
        <button v-on:click="page++">بعدی</button>
        </div>
        <div v-if="page === 4">
    <h2>سوابق  شغلی</h2>

      <label for="state">استان</label>
      <input type="text" id="state" v-model="form.state">
      
      <label for="city">شهر</label>
      <input type="text" id="city" v-model="form.city">
      
      <label for="teachingUniversity">دانشگاه محل تدریس</label>
      <input type="text" id="teachingUniversity" v-model="form.teachingUniversity">
      
      <label for="teachingCollege">دانشکده محل تدریس</label>
      <input type="text" id="teachingCollege" v-model="form.teachingCollege">
      
      <label for="scientificGroup">گروه علمی</label>
      <input type="text" id="scientificGroup" v-model="form.scientificGroup">
      
      <label for="mainExpertiseField">زمینه تخصصی اصلی</label>
      <input type="text" id="mainExpertiseField" v-model="form.mainExpertiseField">

 
      <label for="scientificPosition">مرتبه علمی</label>
      <input type="text" id="scientificPosition" v-model="form.scientificPosition">
      
      <label for="hiringDate">وضعیت استخدام</label>
      <input type="text" id="hiringDate" v-model="form.hiringDate">
      

        <button v-on:click="page--">صفحه قبل</button>
        <button v-on:click="page++">بعدی</button>
        </div>
        <div v-if="page === 5">
    <h2>زمینه همکاری</h2>

  <label>نوع همکاری:</label>
  <input type="text" name="cooperationType"><br>

  <label>اقشار بسیج در صورت وجود:</label>
  <input type="text" name="otherBasicOrganizationsIfExists"><br>

  <label>کارگاه مطالعاتی:</label>
  <input type="text" name="kargrouhMotaleati"><br>

  <label>کارگاه علمی:</label>
  <input type="text" name="halgheElmi"><br>

  <label>علوم انسانی:</label>
  <input type="text" name="olomEnsani"><br>

  <label>سخنرانی:</label>
  <input type="text" name="sokhanrani"><br>

  <label>فرهنگی:</label>
  <input type="text" name="farhangi"><br>

  <label>تحقیقاتی:</label>
  <input type="text" name="tahghighati"><br>

  <label>مدیریتی:</label>
  <input type="text" name="modiriati"><br>

  <label>مشاوره ایی:</label>
  <input type="text" name="moshavarei"><br>

  <label>سایبری:</label>
  <input type="text" name="cyberi"><br>

  <label>سیاسی:</label>
  <input type="text" name="siasi"><br>

  <label>اجتماعی:</label>
  <input type="text" name="ejtemaei"><br>

  <label>تربیتی:</label>
  <input type="text" name="tarbiati"><br>

  <label>راهبردی:</label>
  <input type="text" name="rahbordi"><br>

  <label>اجرایی:</label>
  <input type="text" name="ejraie"><br>

  <label>تالیف:</label>
  <input type="text" name="talif"><br>

  <label>ترجمه:</label>
  <input type="text" name="tarjome"><br>

  <label>تشکل های مردمی نهاد:</label>
  <input type="text" name="taskilMardomNahad"><br>

  <label for="iAgreeToTerm">تایید موارد فوق:</label>
  <input type="checkbox" id="iAgreeToTerm" name="iAgreeToTerm" value="true"><br>

        <button v-on:click="submitForm">ذخیره</button>
        </div>
</form>
</div> 
 
    <!-- <div v-if="page === 2">
      <label for="kidsNumber">تعداد فرزند:</label>
      <input type="number" id="kidsNumber" v-model="form.kidsNumber" required>

      <label for="religion">مذهب:</label>
      <input type="text" id="religion" v-model="form.religion" required>

      <label for="scientificPosition">موقعیت علمی:</label>
      <input type="text" id="scientificPosition" v-model="form.scientificPosition" required>

      <label for="scientificGroup">Scientific Group:</label>
      <input type="text" id="scientificGroup" v-model="form.scientificGroup" required>

      <label for="lastDegree">Last Degree:</label>
      <input type="text" id="lastDegree" v-model="form.lastDegree" required>

      <label for="university">University:</label>
      <input type="text" id="university" v-model="form.university" required>

      <button @click="page--">قبلی</button>
      <button @click="page++">بعدی</button>
    </div>

    <div v-if="page === 3">
      <label for="teachingUniversity">Teaching University:</label>
      <input type="text" id="teachingUniversity" v-model="form.teachingUniversity" required>

      <label for="studyHoze">Study Hoze:</label>
      <input type="text" id="studyHoze" v-model="form.studyHoze" required>

      <label for="hozouLevel">Hozou Level:</label>
      <input type="text" id="hozouLevel" v-model="form.hozouLevel" required>

      <label for="field">Field:</label>
      <input type="text" id="field" v-model="form.field" required>

      <label for="writtenBooksCount">Written Books Count:</label>
      <input type="number" id="writtenBooksCount" v-model="form.writtenBooksCount" required>

      <label for="finishedResearchesCount">Finished Researches Count:</label>
      <input type="number" id="finishedResearchesCount" v-model="form.finishedResearchesCount" required>

      <button @click="page--">قبلی</button>
      <button @click="page++">بعدی</button>
    </div>
 
      <div v-if="page === 4">
        <label for="registeredInventionsCount">Registered Inventions Count:</label>
        <input type="text" id="registeredInventionsCount" v-model="formData.registeredInventionsCount">

        <label for="scientificMeetingsHeldCount">Scientific Meetings Held Count:</label>
        <input type="text" id="scientificMeetingsHeldCount" v-model="formData.scientificMeetingsHeldCount">

        <label for="internationMeetingsHeldCount">International Meetings Held Count:</label>
        <input type="text" id="internationMeetingsHeldCount" v-model="formData.internationMeetingsHeldCount">

        <label for="researchesInternalAndSpecializedMagazinesCount">Researches in Internal and Specialized Magazines Count:</label>
        <input type="text" id="researchesInternalAndSpecializedMagazinesCount" v-model="formData.researchesInternalAndSpecializedMagazinesCount">

        <label for="taskilMardomNahad">Taskil Mardom Nahad:</label>
        <input type="text" id="taskilMardomNahad" v-model="formData.taskilMardomNahad">

        <label for="iSCNamayeCount">ISC Namaye Count:</label>
        <input type="text" id="iSCNamayeCount" v-model="formData.iSCNamayeCount">
        <button @click="page--">قبلی</button>
      <button @click="page++">بعدی</button>
      </div>

      <div v-if="page === 5">
        <label for="iSINamayeCount">ISI Namaye Count:</label>
        <input type="text" id="iSINamayeCount" v-model="formData.iSINamayeCount">

        <label for="sokhanrani">Sokhanrani:</label>
        <input type="text" id="sokhanrani" v-model="formData.sokhanrani">

        <label for="halgheElmi">Halghe Elmi:</label>
        <input type="text" id="halgheElmi" v-model="formData.halgheElmi">

        <label for="moshavarei">Moshavarei:</label>
        <input type="text" id="moshavarei" v-model="formData.moshavarei">

        <label for="ejraie">Ejraie:</label>
        <input type="text" id="ejraie" v-model="formData.ejraie">

        <label for="modiriati">Modiriati:</label>
        <input type="text" id="modiriati" v-model="formData.modiriati">
        <button @click="page--">قبلی</button>
      <button @click="page++">بعدی</button>
      </div>

      <div v-if="page === 6">
        <label for="cyberi">Cyberi:</label>
        <input type="text" id="cyberi" v-model="formData.cyberi">

        <label for="phone">Phone:</label>
        <input type="text" id="phone" v-model="formData.phone">

        <label for="email">Email:</label>
        <input type="email" id="email" v-model="formData.email">

        <label for="address">Address:</label>
            <input type="email" id="address" v-model="formData.address">

            <button @click="page--">قبلی</button>
      <button @click="page++">بعدی</button>
    </div>
   
    <div v-if="currentPage === 7">
  
      <label for="hiringDate">Hiring Date:</label>
      <input type="text" id="hiringDate" v-model="formData.hiringDate">
      <br>
      <label for="captivityAsMonth">Captivity as Month:</label>
      <input type="text" id="captivityAsMonth" v-model="formData.captivityAsMonth">
      <br>
      <label for="timeInFrontAsMonth">Time in Front as Month:</label>
      <input type="text" id="timeInFrontAsMonth" v-model="formData.timeInFrontAsMonth">
      <br>
      <label for="captivityFamily">Captivity Family:</label>
      <input type="text" id="captivityFamily" v-model="formData.captivityFamily">
      <br>
      <label for="martyrFamily">Martyr Family:</label>
      <input type="text" id="martyrFamily" v-model="formData.martyrFamily">
      <br>
      <label for="kargrouhMotaleati">Kargrouh Motaleati:</label>
      <input type="text" id="kargrouhMotaleati" v-model="formData.kargrouhMotaleati">
      <br>
      <button @click="page--">قبلی</button>
      <button @click="page++">بعدی</button>
    </div>
    <div v-if="currentPage === 8">
  
      <label for="ejtemaei">Ejtemaei:</label>
      <input type="text" id="ejtemaei" v-model="formData.ejtemaei">
      <br>
      <label for="farhangi">Farhangi:</label>
      <input type="text" id="farhangi" v-model="formData.farhangi">
      <br>
      <label for="tahghighati">Tahghighati:</label>
      <input type="text" id="tahghighati" v-model="formData.tahghighati">
      <br>
      <label for="siasi">Siasi:</label>
      <input type="text" id="siasi" v-model="formData.siasi">
      <br>
      <label for="olomEnsani">Olom Ensani:</label>
      <input type="text" id="olomEnsani" v-model="formData.olomEnsani">
      <br>
      <label for="exportPlace">Export Place:</label>
      <input type="text" id="exportPlace" v-model="formData.exportPlace">
      <br>
      <button @click="page--">قبلی</button>
      <button @click="page++">بعدی</button>
    </div>
    <div v-if="currentPage === 9">

      <label for="passportNumber">Passport Number:</label>
      <input type="text" id="passportNumber" v-model="formData.passportNumber">
      <br>
      <label for="scientificMeetingsHeldCount">Scientific Meetings Held Count:</label>
      <input type="text" id="scientificMeetingsHeldCount" v-model="formData.scientificMeetingsHeldCount">

      <label for="others">Others:</label>
      <input type="text" id="others" v-model="form.others">
      <br><br>
      <label for="russian">Russian:</label>
      <input type="text" id="russian" v-model="form.russian">
      <br><br>
      <label for="arabic">Arabic:</label>
      <input type="text" id="arabic" v-model="form.arabic">
      <br><br>
      <label for="spanish">Spanish:</label>
      <input type="text" id="spanish" v-model="form.spanish">
      <br><br>
      <label for="bloodType">Blood Type:</label>
      <select id="bloodType" v-model="form.bloodType">
        <option value=""></option>
        <option value="A">A</option>
        <option value="B">B</option>
        <option value="AB">AB</option>
        <option value="O">O</option>
      </select>
      <br><br>
      <button @click="submitForm">ذخیره</button>
      </div>
      </div> -->
  </template>
  
  <script>
  import axios from 'axios';
  export default {
    name:'form',
    data() {
      return {
        form: {
          name: '',
          lastName: '',
          gender: '',
          birthday: '',
          birthPlace: '',
          maritalStatus: '',
          kidsNumber: '',
          religion: '',
          scientificPosition: '',
          scientificGroup: '',
          lastDegree: '',
          university: '',
          teachingUniversity: '',
          studyHoze: '',
          hozouLevel: '',
          field: '',
          writtenBooksCount: '',
          finishedResearchesCount: '',
          registeredInventionsCount: '',
          scientificMeetingsHeldCount: '',
          internationMeetingsHeldCount: '',
          researchesInternalAndSpecializedMagazinesCount: '',
          taskilMardomNahad: '',
          iSCNamayeCount: '',
          iSINamayeCount: '',
          sokhanrani: '',
          halgheElmi: '',
          moshavarei: '',
          ejraie: '',
          modiriati: '',
          cyberi: '',
          phone: '',
          email: '',
          address: '',
          hiringDate: '',
          captivityAsMonth: '',
          timeInFrontAsMonth: '',
          captivityFamily: '',
          martyrFamily: '',
          kargrouhMotaleati: '',
          ejtemaei: '',
          farhangi: '',
          tahghighati: '',
          siasi: '',
          olomEnsani: '',
          exportPlace: '',
          passportNumber: '',
        //   scientificMeetingsHeldCount: '',
          others: '',
          russian: '',
          arabic: '',
          spanish: '',
          bloodyType: ''
        },
        page: 1
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
     
        axios.post('http://localhost:8080/users', this.form)

      }
    }
  };
  </script>
  