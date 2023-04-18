package com.example.userregisteration.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

/**
 * @author Erfan Akhavan Rad
 * @created 04/18/2023
 */
@RestController
@RequestMapping("/pdf")
public class InfoForPdfController {
    String url = "jdbc:sqlserver://localhost;databaseName=Test_DB" + ";encrypt=true;trustServerCertificate=true";
    String user = "tiny";
    String password = "ResidentEvil6";


    @GetMapping(path = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public JSONObject getAllUsers(@PathVariable String id) throws Exception {
        String selectAllQuery;


        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        try {
            Connection connection = DriverManager.getConnection(url
                    , user, password);
            System.out.println("Connected");

            selectAllQuery = "SELECT * FROM FourthForm, FifthForm,ThirdForm, SecondForm, RegistrationFormFirst AS rf WHERE rf.id = " + id;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectAllQuery);

            while (resultSet.next()) {
                JSONObject record = new JSONObject();
                record.put("id", resultSet.getInt("id"));
                record.put("nameKhanevadegi", resultSet.getString("nameKhanevadegi"));
                record.put("nesbat", resultSet.getString("nesbat"));
                record.put("noeFaaliatSiasi", resultSet.getString("noeFaaliatSiasi"));
                record.put("nameTashakol", resultSet.getString("nameTashakol"));
                record.put("mahalFaaliat", resultSet.getString("mahalFaaliat"));
                record.put("nooFaaliat", resultSet.getString("nooFaaliat"));
                record.put("nooFaaliatShomaBaBastegan", resultSet.getString("nooFaaliatShomaBaBastegan"));
                record.put("angizeHamkari", resultSet.getString("angizeHamkari"));
                record.put("modatHamkariAs", resultSet.getString("modatHamkariAs"));
                record.put("modatHamkariTa", resultSet.getString("modatHamkariTa"));
                record.put("elatGhatHamkari", resultSet.getString("elatGhatHamkari"));
                record.put("kadrNamoNameKhanevadegi", resultSet.getString("kadrNamoNameKhanevadegi"));
                record.put("kadrNamePedar", resultSet.getString("kadrNamePedar"));
                record.put("kadrNesbat", resultSet.getString("kadrNesbat"));
                record.put("kadrNoEtteham", resultSet.getString("kadrNoEtteham"));
                record.put("kadrTerikhEdamZendani", resultSet.getString("kadrTerikhEdamZendani"));
                record.put("kadrVaziatFeli", resultSet.getString("kadrVaziatFeli"));
                record.put("kadrMizanErtebat", resultSet.getString("kadrMizanErtebat"));
                record.put("mahalKeshvar", resultSet.getString("mahalKeshvar"));
                record.put("mahalOstan", resultSet.getString("mahalOstan"));
                record.put("kadrSeNamoNameKhanevadegi", resultSet.getString("kadrSeNamoNameKhanevadegi"));
                record.put("kadrSeNamePedar", resultSet.getString("kadrSeNamePedar"));
                record.put("kadrSeNesbat", resultSet.getString("kadrSeNesbat"));
                record.put("kadrSeShoghl", resultSet.getString("kadrSeShoghl"));
                record.put("kadrSeNameKeshvar", resultSet.getString("kadrSeNameKeshvar"));
                record.put("kadrSeModatEghamat", resultSet.getString("kadrSeModatEghamat"));
                record.put("kadrSeTabeiat", resultSet.getString("kadrSeTabeiat"));
                record.put("kadrSePanahandegi", resultSet.getString("kadrSePanahandegi"));
                record.put("kadrSeMosaferat", resultSet.getString("kadrSeMosaferat"));
                record.put("kadrSeTahmil", resultSet.getString("kadrSeTahmil"));
                record.put("kadrSeGheire", resultSet.getString("kadrSeGheire"));
                record.put("kadrChaharNameKhanevadegi", resultSet.getString("kadrChaharNameKhanevadegi"));
                record.put("kadrChaharNamePedar", resultSet.getString("kadrChaharNamePedar"));
                record.put("kadrChaharSen", resultSet.getString("kadrChaharSen"));
                record.put("kadrChaharShoghlFeli", resultSet.getString("kadrChaharShoghlFeli"));
                record.put("kadrChaharShoghlGhabli", resultSet.getString("kadrChaharShoghlGhabli"));
                record.put("kadrChaharModatAshnaei", resultSet.getString("kadrChaharModatAshnaei"));
                record.put("kadrChaharNeshani", resultSet.getString("kadrChaharNeshani"));
                record.put("kadrChaharTelephone", resultSet.getString("kadrChaharTelephone"));
                record.put("kadrPanjNameKhanevadegi", resultSet.getString("kadrPanjNameKhanevadegi"));
                record.put("kadrPanjNamePedar", resultSet.getString("kadrPanjNamePedar"));
                record.put("kadrPanjNesbat", resultSet.getString("kadrPanjNesbat"));
                record.put("kadrPanjSen", resultSet.getString("kadrPanjSen"));
                record.put("kadrPanjTahsilat", resultSet.getString("kadrPanjTahsilat"));
                record.put("kadrPanjShoghl", resultSet.getString("kadrPanjShoghl"));
                record.put("kadrPanjTabeiat", resultSet.getString("kadrPanjTabeiat"));
                record.put("kadrPanjDin", resultSet.getString("kadrPanjDin"));
                record.put("kadrPanjMazhab", resultSet.getString("kadrPanjMazhab"));
                record.put("kadrPanjDarGheyd", resultSet.getString("kadrPanjDarGheyd"));
                record.put("iAgree", resultSet.getBoolean("iAgree"));
                record.put("firstFormID", resultSet.getInt("firstFormID"));
                record.put("idCode", resultSet.getString("idCode"));
                record.put("postalCode", resultSet.getString("postalCode"));
                record.put("fiftheendigitsBasigi", resultSet.getString("fiftheendigitsBasigi"));
                record.put("name", resultSet.getString("name"));
                record.put("lastName", resultSet.getString("lastName"));
                record.put("fatherName", resultSet.getString("fatherName"));
                record.put("passportNumber", resultSet.getString("passportNumber"));
                record.put("exportPlace", resultSet.getString("exportPlace"));
                record.put("birthPlace", resultSet.getString("birthPlace"));
                record.put("birthday", resultSet.getString("birthday"));
                record.put("previousNameAndLastName", resultSet.getString("previousNameAndLastName"));
                record.put("nameAndLastNameChangeDate", resultSet.getString("nameAndLastNameChangeDate"));
                record.put("gender", resultSet.getString("gender"));
                record.put("nationality", resultSet.getString("nationality"));
                record.put("marriageStatus", resultSet.getString("marriageStatus"));
                record.put("nickName", resultSet.getString("nickName"));
                record.put("previousTabeiat", resultSet.getString("previousTabeiat"));
                record.put("currentTabeiat", resultSet.getString("currentTabeiat"));
                record.put("previousRelegion", resultSet.getString("previousRelegion"));
                record.put("currentRelegion", resultSet.getString("currentRelegion"));
                record.put("previousMazhab", resultSet.getString("previousMazhab"));
                record.put("currentMazhab", resultSet.getString("currentMazhab"));
                record.put("margaTaghlid", resultSet.getString("margaTaghlid"));
                record.put("normalRegistrationDate", resultSet.getString("normalRegistrationDate"));
                record.put("state", resultSet.getString("state"));
                record.put("zone", resultSet.getString("zone"));
                record.put("hoze", resultSet.getString("hoze"));
                record.put("kanoon", resultSet.getString("kanoon"));
                record.put("gheshr", resultSet.getString("gheshr"));
                record.put("paygah", resultSet.getString("paygah"));
                record.put("address", resultSet.getString("address"));
                record.put("email", resultSet.getString("email"));
                record.put("mobileNumber", resultSet.getString("mobileNumber"));
                record.put("telephone", resultSet.getString("telephone"));
                record.put("personalBlog", resultSet.getString("personalBlog"));
                record.put("workPlaceTelephone", resultSet.getString("workPlaceTelephone"));
                record.put("education", resultSet.getString("education"));
                record.put("maghtaTahsili", resultSet.getString("maghtaTahsili"));
                record.put("dabirestanReshte", resultSet.getString("dabirestanReshte"));
                record.put("dabirestanNameMarkaz", resultSet.getString("dabirestanNameMarkaz"));
                record.put("dabirestanKeshvar", resultSet.getString("dabirestanKeshvar"));
                record.put("dabirestanOstan", resultSet.getString("dabirestanOstan"));
                record.put("dabirestanShahr", resultSet.getString("dabirestanShahr"));
                record.put("dabirestanBakhsh", resultSet.getString("dabirestanBakhsh"));
                record.put("dabirestanSalShooro", resultSet.getString("dabirestanSalShooro"));
                record.put("dabirestanSaleKhateme", resultSet.getString("dabirestanSaleKhateme"));
                record.put("dabirestanDesc", resultSet.getString("dabirestanDesc"));
                record.put("kardaniReshte", resultSet.getString("kardaniReshte"));
                record.put("kardaniNameMarkaz", resultSet.getString("kardaniNameMarkaz"));
                record.put("kardaniKeshvar", resultSet.getString("kardaniKeshvar"));
                record.put("kardaniOstan", resultSet.getString("kardaniOstan"));
                record.put("kardaniShahr", resultSet.getString("kardaniShahr"));
                record.put("kardaniBakhsh", resultSet.getString("kardaniBakhsh"));
                record.put("kardaniSaleShooro", resultSet.getString("kardaniSaleShooro"));
                record.put("kardaniSaleKhateme", resultSet.getString("kardaniSaleKhateme"));
                record.put("kardaniDesc", resultSet.getString("kardaniDesc"));
                record.put("karshenasiReshte", resultSet.getString("karshenasiReshte"));
                record.put("karshenasiNameMarkaz", resultSet.getString("karshenasiNameMarkaz"));
                record.put("karshenasiKeshvar", resultSet.getString("karshenasiKeshvar"));
                record.put("karshenasiOstan", resultSet.getString("karshenasiOstan"));
                record.put("karshenasiBakhsh", resultSet.getString("karshenasiBakhsh"));
                record.put("karshenasiSaleShooro", resultSet.getString("karshenasiSaleShooro"));
                record.put("karshenasiSaleKhateme", resultSet.getString("karshenasiSaleKhateme"));
                record.put("karshenasiDesc", resultSet.getString("karshenasiDesc"));
                record.put("arshadReshte", resultSet.getString("arshadReshte"));
                record.put("arshadNameMarkaz", resultSet.getString("arshadNameMarkaz"));
                record.put("arshadKeshvar", resultSet.getString("arshadKeshvar"));
                record.put("arshadOstan", resultSet.getString("arshadOstan"));
                record.put("arshadBakhsh", resultSet.getString("arshadBakhsh"));
                record.put("arshadSaleShooro", resultSet.getString("arshadSaleShooro"));
                record.put("arshadSaleKhateme", resultSet.getString("arshadSaleKhateme"));
                record.put("arshadDesc", resultSet.getString("arshadDesc"));
                record.put("drReshte", resultSet.getString("drReshte"));
                record.put("drNameMarkaz", resultSet.getString("drNameMarkaz"));
                record.put("drKeshvar", resultSet.getString("drKeshvar"));
                record.put("drOstan", resultSet.getString("drOstan"));
                record.put("drBakhsh", resultSet.getString("drBakhsh"));
                record.put("drSaleShooro", resultSet.getString("drSaleShooro"));
                record.put("drSaleKhateme", resultSet.getString("drSaleKhateme"));
                record.put("drDesc", resultSet.getString("drDesc"));
                record.put("currentShogl", resultSet.getString("currentShogl"));
                record.put("currentNooFaaliat", resultSet.getString("currentNooFaaliat"));
                record.put("currentMoassese", resultSet.getString("currentMoassese"));
                record.put("currentMalekiat", resultSet.getString("currentMalekiat"));
                record.put("currentTabeiatMossese", resultSet.getString("currentTabeiatMossese"));
                record.put("currentMosseseKeshvar", resultSet.getString("currentMosseseKeshvar"));
                record.put("currentMosseseState", resultSet.getString("currentMosseseState"));
                record.put("currentMosseseCity", resultSet.getString("currentMosseseCity"));
                record.put("currentMosseseFrom", resultSet.getString("currentMosseseFrom"));
                record.put("currentMosseseTo", resultSet.getString("currentMosseseTo"));
                record.put("currentReasonOfResigning", resultSet.getString("currentReasonOfResigning"));
                record.put("previousShogl", resultSet.getString("previousShogl"));
                record.put("previousNooFaaliat", resultSet.getString("previousNooFaaliat"));
                record.put("previousMoassese", resultSet.getString("previousMoassese"));
                record.put("previousMalekiat", resultSet.getString("previousMalekiat"));
                record.put("previousTabeiatMossese", resultSet.getString("previousTabeiatMossese"));
                record.put("previousMosseseKeshvar", resultSet.getString("previousMosseseKeshvar"));
                record.put("previousMosseseState", resultSet.getString("previousMosseseState"));
                record.put("previousMosseseCity", resultSet.getString("previousMosseseCity"));
                record.put("previousMosseseFrom", resultSet.getString("previousMosseseFrom"));
                record.put("previousMosseseTo", resultSet.getString("previousMosseseTo"));
                record.put("previousReasonOfResigning", resultSet.getString("previousReasonOfResigning"));
                record.put("timeInFrontAsMonth", resultSet.getString("timeInFrontAsMonth"));
                record.put("handicapOrInjuryPercentage", resultSet.getString("handicapOrInjuryPercentage"));
                record.put("captivityAsMonth", resultSet.getString("captivityAsMonth"));
                record.put("freedomRate", resultSet.getString("freedomRate"));
                record.put("sabegheHamkariBanahad", resultSet.getString("sabegheHamkariBanahad"));
                record.put("nooHamkari", resultSet.getString("nooHamkari"));
                record.put("hamkariFrom", resultSet.getString("hamkariFrom"));
                record.put("hamkariTo", resultSet.getString("hamkariTo"));
                record.put("elatghatHamkari", resultSet.getString("elatghatHamkari"));
                record.put("vabastegiBeKhanevadeIsarGaran", resultSet.getString("vabastegiBeKhanevadeIsarGaran"));
                record.put("fullNameIsargar", resultSet.getString("fullNameIsargar"));
                record.put("nesbatIsargarBaShoma", resultSet.getString("nesbatIsargarBaShoma"));
                record.put("firstState", resultSet.getString("firstState"));
                record.put("firstZone", resultSet.getString("firstZone"));
                record.put("firstMarkazMoghavemat", resultSet.getString("firstMarkazMoghavemat"));
                record.put("firstHozeMoghavemat", resultSet.getString("firstHozeMoghavemat"));
                record.put("firstPaygahMoghavemat", resultSet.getString("firstPaygahMoghavemat"));
                record.put("firstModatFrom", resultSet.getString("firstModatFrom"));
                record.put("firstModatTo", resultSet.getString("firstModatTo"));
                record.put("firstNoe", resultSet.getString("firstNoe"));
                record.put("firstZekrMasooliat", resultSet.getString("firstZekrMasooliat"));
                record.put("secondState", resultSet.getString("secondState"));
                record.put("secondZone", resultSet.getString("secondZone"));
                record.put("secondMarkazMoghavemat", resultSet.getString("secondMarkazMoghavemat"));
                record.put("secondHozeMoghavemat", resultSet.getString("secondHozeMoghavemat"));
                record.put("secondPaygahMoghavemat", resultSet.getString("secondPaygahMoghavemat"));
                record.put("secondModatFrom", resultSet.getString("secondModatFrom"));
                record.put("secondModatTo", resultSet.getString("secondModatTo"));
                record.put("secondNoe", resultSet.getString("secondNoe"));
                record.put("secondZekrMasooliat", resultSet.getString("secondZekrMasooliat"));
                record.put("fiveYearsFirstState", resultSet.getString("fiveYearsFirstState"));
                record.put("fiveYearsFirstShahr", resultSet.getString("fiveYearsFirstShahr"));
                record.put("fiveYearsFirstAddress", resultSet.getString("fiveYearsFirstAddress"));
                record.put("fiveYearsFirstFrom", resultSet.getString("fiveYearsFirstFrom"));
                record.put("fiveYearsFirstTo", resultSet.getString("fiveYearsFirstTo"));
                record.put("fiveYearsFirstTelephone", resultSet.getString("fiveYearsFirstTelephone"));
                record.put("fiveYearsSecondState", resultSet.getString("fiveYearsSecondState"));
                record.put("fiveYearsSecondShahr", resultSet.getString("fiveYearsSecondShahr"));
                record.put("fiveYearsSecondAddress", resultSet.getString("fiveYearsSecondAddress"));
                record.put("fiveYearsSecondFrom", resultSet.getString("fiveYearsSecondFrom"));
                record.put("fiveYearsSecondTo", resultSet.getString("fiveYearsSecondTo"));
                record.put("fiveYearsSecondTelephone", resultSet.getString("fiveYearsSecondTelephone"));
                record.put("title", resultSet.getString("title"));
                record.put("takhasosi", resultSet.getString("takhasosi"));
                record.put("vizhegi", resultSet.getString("vizhegi"));
                record.put("onvanDoreh", resultSet.getString("onvanDoreh"));
                record.put("zamanEjraShoro", resultSet.getString("zamanEjraShoro"));
                record.put("zamanEjraPayan", resultSet.getString("zamanEjraPayan"));
                record.put("zamanAmoozeshRooz", resultSet.getString("zamanAmoozeshRooz"));
                record.put("zamanAmoozeshSaat", resultSet.getString("zamanAmoozeshSaat"));
                record.put("mahalAmoozesh", resultSet.getString("mahalAmoozesh"));
                record.put("mahalTaeedVaMohr", resultSet.getString("mahalTaeedVaMohr"));
                record.put("onvanOzviatAdi", resultSet.getString("onvanOzviatAdi"));
                record.put("onvanOzviatVizhe", resultSet.getString("onvanOzviatVizhe"));
                record.put("normalKartNumber", resultSet.getString("normalKartNumber"));
                record.put("normalKartGereftam", resultSet.getBoolean("normalKartGereftam"));
                record.put("vipCardNumber", resultSet.getString("vipCardNumber"));
                record.put("vipCardGereftam", resultSet.getBoolean("vipCardGereftam"));
                record.put("religion", resultSet.getString("religion"));
                record.put("bloodyType", resultSet.getString("bloodyType"));
                record.put("kidsNumber", resultSet.getString("kidsNumber"));
                record.put("workPlaceAddress", resultSet.getString("workPlaceAddress"));
                record.put("fax", resultSet.getString("fax"));
                record.put("handicapPercentage", resultSet.getString("handicapPercentage"));
                record.put("martyrFamily", resultSet.getString("martyrFamily"));
                record.put("captivityFamily", resultSet.getString("captivityFamily"));
                record.put("hozoaviLevel", resultSet.getString("hozoaviLevel"));
                record.put("studyHoze", resultSet.getString("studyHoze"));
                record.put("lastDegree", resultSet.getString("lastDegree"));
                record.put("graduationYear", resultSet.getString("graduationYear"));
                record.put("university", resultSet.getString("university"));
                record.put("graduationCity", resultSet.getString("graduationCity"));
                record.put("field", resultSet.getString("field"));
                record.put("fieldOrientation", resultSet.getString("fieldOrientation"));
                record.put("dissertationTitle", resultSet.getString("dissertationTitle"));
                record.put("english", resultSet.getString("english"));
                record.put("arabic", resultSet.getString("arabic"));
                record.put("french", resultSet.getString("french"));
                record.put("spanish", resultSet.getString("spanish"));
                record.put("german", resultSet.getString("german"));
                record.put("russian", resultSet.getString("russian"));
                record.put("others", resultSet.getString("others"));
                record.put("iSINamayeCount", resultSet.getString("iSINamayeCount"));
                record.put("iSCNamayeCount", resultSet.getString("iSCNamayeCount"));
                record.put("scientificResearchesCount", resultSet.getString("scientificResearchesCount"));
                record.put("finishedResearchesCount", resultSet.getString("finishedResearchesCount"));
                record.put("writtenBooksCount", resultSet.getString("writtenBooksCount"));
                record.put("translatedBooksCount", resultSet.getString("translatedBooksCount"));
                record.put("registeredInventionsCount", resultSet.getString("registeredInventionsCount"));
                record.put("scientificMeetingsHeldCount", resultSet.getString("scientificMeetingsHeldCount"));
                record.put("internationMeetingsHeldCount", resultSet.getString("internationMeetingsHeldCount"));
                record.put("city", resultSet.getString("city"));
                record.put("teachingUniversity", resultSet.getString("teachingUniversity"));
                record.put("teachingCollege", resultSet.getString("teachingCollege"));
                record.put("scientificGroup", resultSet.getString("scientificGroup"));
                record.put("mainExpertiseField", resultSet.getString("mainExpertiseField"));
                record.put("scientificPosition", resultSet.getString("scientificPosition"));
                record.put("hiringDate", resultSet.getString("hiringDate"));
                record.put("cooperationType", resultSet.getString("cooperationType"));
                record.put("kargrouhMotaleati", resultSet.getString("kargrouhMotaleati"));
                record.put("halgheElmi", resultSet.getString("halgheElmi"));
                record.put("olomEnsani", resultSet.getString("olomEnsani"));
                record.put("sokhanrani", resultSet.getString("sokhanrani"));
                record.put("farhangi", resultSet.getString("farhangi"));
                record.put("tahghighati", resultSet.getString("tahghighati"));
                record.put("modiriati", resultSet.getString("modiriati"));
                record.put("moshavarei", resultSet.getString("moshavarei"));
                record.put("cyberi", resultSet.getString("cyberi"));
                record.put("siasi", resultSet.getString("siasi"));
                record.put("ejtemaei", resultSet.getString("ejtemaei"));
                record.put("tarbiati", resultSet.getString("tarbiati"));
                record.put("rahbordi", resultSet.getString("rahbordi"));
                record.put("ejraie", resultSet.getString("ejraie"));
                record.put("talif", resultSet.getString("talif"));
                record.put("tarjome", resultSet.getString("tarjome"));
                record.put("taskilMardomNahad", resultSet.getString("taskilMardomNahad"));
                record.put("internationConferenceAttendanceCount", resultSet.getString("internationConferenceAttendanceCount"));
                record.put("internationalPresentedResearchesCount", resultSet.getString("internationalPresentedResearchesCount"));
                record.put("researchesInternalAndSpecializedMagazinesCount", resultSet.getString("researchesInternalAndSpecializedMagazinesCount"));
                record.put("otherBasigOrganizationsIfExists", resultSet.getString("otherBasigOrganizationsIfExists"));
                record.put("iAgreeToTerm", resultSet.getBoolean("iAgreeToTerm"));
                record.put("ostan", resultSet.getString("ostan"));
                record.put("nahie", resultSet.getString("nahie"));
                record.put("shenasePaygah", resultSet.getString("shenasePaygah"));
                record.put("nameGheshr", resultSet.getString("nameGheshr"));
                record.put("namePedar", resultSet.getString("namePedar"));
                record.put("shomareMelli", resultSet.getString("shomareMelli"));
                record.put("shomareShenasname", resultSet.getString("shomareShenasname"));
                record.put("tarikhTavalod", resultSet.getString("tarikhTavalod"));
                record.put("mahalTavalod", resultSet.getString("mahalTavalod"));
                record.put("sharestan", resultSet.getString("sharestan"));
                record.put("shar", resultSet.getString("shar"));
                record.put("bakhsh", resultSet.getString("bakhsh"));
                record.put("gensiat", resultSet.getString("gensiat"));
                record.put("taahol", resultSet.getString("taahol"));
                record.put("goorohKhoon", resultSet.getString("goorohKhoon"));
                record.put("vaziatGesmani", resultSet.getString("vaziatGesmani"));
                record.put("faaliatVizhe", resultSet.getString("faaliatVizhe"));
                record.put("din", resultSet.getString("din"));
                record.put("mazhab", resultSet.getString("mazhab"));
                record.put("tebeiat", resultSet.getString("tebeiat"));
                record.put("tahsilatClassic", resultSet.getString("tahsilatClassic"));
                record.put("reshteTahsili", resultSet.getString("reshteTahsili"));
                record.put("tahsilatHozavi", resultSet.getString("tahsilatHozavi"));
                record.put("tarikhPishBiniEtmamTahsil", resultSet.getString("tarikhPishBiniEtmamTahsil"));
                record.put("khandanNeveshtan", resultSet.getString("khandanNeveshtan"));
                record.put("vaziatShoghli", resultSet.getString("vaziatShoghli"));
                record.put("onvanDaghighShoghli", resultSet.getString("onvanDaghighShoghli"));
                record.put("mohasel", resultSet.getString("mohasel"));
                record.put("nezami", resultSet.getString("nezami"));
                record.put("motekhases", resultSet.getString("motekhases"));
                record.put("khanedar", resultSet.getString("khanedar"));
                record.put("bazneshaste", resultSet.getString("bazneshaste"));
                record.put("gheydOnvan", resultSet.getString("gheydOnvan"));
                record.put("joyaeShoghl", resultSet.getString("joyaeShoghl"));
                record.put("sayer", resultSet.getString("sayer"));
                record.put("onvanShoghlRaNamBebarid", resultSet.getString("onvanShoghlRaNamBebarid"));
                record.put("vaziatKhedmatVazifeOmoomi", resultSet.getString("vaziatKhedmatVazifeOmoomi"));
                record.put("noeMafiat", resultSet.getString("noeMafiat"));
                record.put("ghomiat", resultSet.getString("ghomiat"));
                record.put("ghomiatRaNameBebarid", resultSet.getString("ghomiatRaNameBebarid"));
                record.put("noeIsargariDavtalab", resultSet.getString("noeIsargariDavtalab"));
                record.put("nesbatDavtalabBaIsargar", resultSet.getString("nesbatDavtalabBaIsargar"));
                record.put("sokoonatOstan", resultSet.getString("sokoonatOstan"));
                record.put("sokoonatShahrestan", resultSet.getString("sokoonatShahrestan"));
                record.put("sokoonatShar", resultSet.getString("sokoonatShar"));
                record.put("sokoonatMahale", resultSet.getString("sokoonatMahale"));
                record.put("sokoonatKhiaban", resultSet.getString("sokoonatKhiaban"));
                record.put("sokoonatKooche", resultSet.getString("sokoonatKooche"));
                record.put("sokoonatBoolook", resultSet.getString("sokoonatBoolook"));
                record.put("sokoonatPelak", resultSet.getString("sokoonatPelak"));
                record.put("sokoonatTabaghe", resultSet.getString("sokoonatTabaghe"));
                record.put("sokoonatVahed", resultSet.getString("sokoonatVahed"));
                record.put("sokoonatCodePosti", resultSet.getString("sokoonatCodePosti"));
                record.put("sokoonatTelephone", resultSet.getString("sokoonatTelephone"));
                record.put("sokoonatWorkPhone", resultSet.getString("sokoonatWorkPhone"));
                record.put("sokoonatMobile", resultSet.getString("sokoonatMobile"));
                record.put("sokoonatEmail", resultSet.getString("sokoonatEmail"));

                jsonArray.add(record);
            }
            jsonObject.put("usersData", jsonArray);
            connection.close();

        } catch (SQLException e) {
            System.out.println("There was an error!");
            e.printStackTrace();
        }
        return jsonObject;
    }

}