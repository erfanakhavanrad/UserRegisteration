package com.example.userregisteration.controller;

import com.example.userregisteration.model.RegistrationFormFirstModel;
import com.example.userregisteration.model.SecondFormModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Erfan Akhavan Rad
 * @created 04/18/2023
 */
@RestController
@RequestMapping("/second")
public class SecondFormController {

    String url = "jdbc:sqlserver://localhost;databaseName=Test_DB" + ";encrypt=true;trustServerCertificate=true";
    String user = "tiny";
    String password = "ResidentEvil6";


    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public JSONObject getAllUsers() throws Exception {
        String selectAllQuery;


        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        try {
            Connection connection = DriverManager.getConnection(url
                    , user, password);
            System.out.println("Connected");

            selectAllQuery = "SELECT * FROM SecondForm";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectAllQuery);

            while (resultSet.next()) {
                JSONObject record = new JSONObject();

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

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public JSONObject saveSingleUser(@RequestBody SecondFormModel secondFormModelSingle) throws Exception {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        String url, user, password, sql, selectAllQuery, SelectLastIDQuery;
//        int number = 42;
//        url = "jdbc:sqlserver://localhost;databaseName=Test_DB" + ";encrypt=true;trustServerCertificate=true";
//        user = "tiny";
//        password = "ResidentEvil6";
        List<SecondFormModel> list = new ArrayList<>();
//        RegistrationFormFirstModel registrationFormFirstModelSingle = new RegistrationFormFirstModel();

//        registrationFormFirstModelSingle.setId(BigDecimal.valueOf(3));
//        registrationFormFirstModelSingle.setName("Erfan");
        list.add(secondFormModelSingle);

        String SQL = "INSERT INTO SecondForm(firstFormID\n" +
                ",idCode\n" +
                ",postalCode\n" +
                ",fiftheendigitsBasigi\n" +
                ",name\n" +
                ",lastName\n" +
                ",fatherName\n" +
                ",passportNumber\n" +
                ",exportPlace\n" +
                ",birthPlace\n" +
                ",birthday\n" +
                ",previousNameAndLastName\n" +
                ",nameAndLastNameChangeDate\n" +
                ",gender\n" +
                ",nationality\n" +
                ",marriageStatus\n" +
                ",nickName\n" +
                ",previousTabeiat\n" +
                ",currentTabeiat\n" +
                ",previousRelegion\n" +
                ",currentRelegion\n" +
                ",previousMazhab\n" +
                ",currentMazhab\n" +
                ",margaTaghlid\n" +
                ",normalRegistrationDate\n" +
                ",state\n" +
                ",zone\n" +
                ",hoze\n" +
                ",kanoon\n" +
                ",gheshr\n" +
                ",paygah\n" +
                ",address\n" +
                ",email\n" +
                ",mobileNumber\n" +
                ",telephone\n" +
                ",personalBlog\n" +
                ",workPlaceTelephone\n" +
                ",education\n" +
                ",maghtaTahsili\n" +
                ",dabirestanReshte\n" +
                ",dabirestanNameMarkaz\n" +
                ",dabirestanKeshvar\n" +
                ",dabirestanOstan\n" +
                ",dabirestanShahr\n" +
                ",dabirestanBakhsh\n" +
                ",dabirestanSalShooro\n" +
                ",dabirestanSaleKhateme\n" +
                ",dabirestanDesc\n" +
                ",kardaniReshte\n" +
                ",kardaniNameMarkaz\n" +
                ",kardaniKeshvar\n" +
                ",kardaniOstan\n" +
                ",kardaniShahr\n" +
                ",kardaniBakhsh\n" +
                ",kardaniSaleShooro\n" +
                ",kardaniSaleKhateme\n" +
                ",kardaniDesc\n" +
                ",karshenasiReshte\n" +
                ",karshenasiNameMarkaz\n" +
                ",karshenasiKeshvar\n" +
                ",karshenasiOstan\n" +
                ",karshenasiBakhsh\n" +
                ",karshenasiSaleShooro\n" +
                ",karshenasiSaleKhateme\n" +
                ",karshenasiDesc\n" +
                ",arshadReshte\n" +
                ",arshadNameMarkaz\n" +
                ",arshadKeshvar\n" +
                ",arshadOstan\n" +
                ",arshadBakhsh\n" +
                ",arshadSaleShooro\n" +
                ",arshadSaleKhateme\n" +
                ",arshadDesc\n" +
                ",drReshte\n" +
                ",drNameMarkaz\n" +
                ",drKeshvar\n" +
                ",drOstan\n" +
                ",drBakhsh\n" +
                ",drSaleShooro\n" +
                ",drSaleKhateme\n" +
                ",drDesc\n" +
                ",currentShogl\n" +
                ",currentNooFaaliat\n" +
                ",currentMoassese\n" +
                ",currentMalekiat\n" +
                ",currentTabeiatMossese\n" +
                ",currentMosseseKeshvar\n" +
                ",currentMosseseState\n" +
                ",currentMosseseCity\n" +
                ",currentMosseseFrom\n" +
                ",currentMosseseTo\n" +
                ",currentReasonOfResigning\n" +
                ",previousShogl\n" +
                ",previousNooFaaliat\n" +
                ",previousMoassese\n" +
                ",previousMalekiat\n" +
                ",previousTabeiatMossese\n" +
                ",previousMosseseKeshvar\n" +
                ",previousMosseseState\n" +
                ",previousMosseseCity\n" +
                ",previousMosseseFrom\n" +
                ",previousMosseseTo\n" +
                ",previousReasonOfResigning\n" +
                ",timeInFrontAsMonth\n" +
                ",handicapOrInjuryPercentage\n" +
                ",captivityAsMonth\n" +
                ",freedomRate\n" +
                ",sabegheHamkariBanahad\n" +
                ",nooHamkari\n" +
                ",hamkariFrom\n" +
                ",hamkariTo\n" +
                ",elatghatHamkari\n" +
                ",vabastegiBeKhanevadeIsarGaran\n" +
                ",fullNameIsargar\n" +
                ",nesbatIsargarBaShoma\n" +
                ",firstState\n" +
                ",firstZone\n" +
                ",firstMarkazMoghavemat\n" +
                ",firstHozeMoghavemat\n" +
                ",firstPaygahMoghavemat\n" +
                ",firstModatFrom\n" +
                ",firstModatTo\n" +
                ",firstNoe\n" +
                ",firstZekrMasooliat\n" +
                ",secondState\n" +
                ",secondZone\n" +
                ",secondMarkazMoghavemat\n" +
                ",secondHozeMoghavemat\n" +
                ",secondPaygahMoghavemat\n" +
                ",secondModatFrom\n" +
                ",secondModatTo\n" +
                ",secondNoe\n" +
                ",secondZekrMasooliat\n" +
                ",fiveYearsFirstState\n" +
                ",fiveYearsFirstShahr\n" +
                ",fiveYearsFirstAddress\n" +
                ",fiveYearsFirstFrom\n" +
                ",fiveYearsFirstTo\n" +
                ",fiveYearsFirstTelephone\n" +
                ",fiveYearsSecondState\n" +
                ",fiveYearsSecondShahr\n" +
                ",fiveYearsSecondAddress\n" +
                ",fiveYearsSecondFrom\n" +
                ",fiveYearsSecondTo\n" +
                ",fiveYearsSecondTelephone)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (
                Connection conn = connect();
                PreparedStatement statement = conn.prepareStatement(SQL);) {
            int count = 0;


//            ResultSet resultSet3 = statement.executeQuery(selectAllQuery);
//            BigDecimal lastId = resultSet3.getBigDecimal("id");

            SelectLastIDQuery = "SELECT TOP 1 * FROM SecondForm\n" +
                    "ORDER BY firstFormID DESC";
            Statement statement4 = conn.createStatement();
            ResultSet resultSet4 = statement4.executeQuery(SelectLastIDQuery);
            BigDecimal lastId = BigDecimal.valueOf(0);
            while (resultSet4.next()) {
                lastId = resultSet4.getBigDecimal("firstFormID");
            }
            lastId = lastId.add(BigDecimal.valueOf(1));

            for (SecondFormModel secondFormModel : list) {
                statement.setBigDecimal(1, lastId);
                statement.setString(2, secondFormModel.getIdCode());
                statement.setString(3, secondFormModel.getPostalCode());
                statement.setString(4, secondFormModel.getFiftheendigitsBasigi());
                statement.setString(5, secondFormModel.getName());
                statement.setString(6, secondFormModel.getLastName());
                statement.setString(7, secondFormModel.getFatherName());
                statement.setString(8, secondFormModel.getPassportNumber());
                statement.setString(9, secondFormModel.getExportPlace());
                statement.setString(10, secondFormModel.getBirthPlace());
                statement.setString(11, secondFormModel.getBirthday());
                statement.setString(12, secondFormModel.getPreviousNameAndLastName());
                statement.setString(13, secondFormModel.getNameAndLastNameChangeDate());
                statement.setString(14, secondFormModel.getGender());
                statement.setString(15, secondFormModel.getNationality());
                statement.setString(16, secondFormModel.getMarriageStatus());
                statement.setString(17, secondFormModel.getNickName());
                statement.setString(18, secondFormModel.getPreviousTabeiat());
                statement.setString(19, secondFormModel.getCurrentTabeiat());
                statement.setString(20, secondFormModel.getPreviousRelegion());
                statement.setString(21, secondFormModel.getCurrentRelegion());
                statement.setString(22, secondFormModel.getPreviousMazhab());
                statement.setString(23, secondFormModel.getCurrentMazhab());
                statement.setString(24, secondFormModel.getMargaTaghlid());
                statement.setString(25, secondFormModel.getNormalRegistrationDate());
                statement.setString(26, secondFormModel.getState());
                statement.setString(27, secondFormModel.getZone());
                statement.setString(28, secondFormModel.getHoze());
                statement.setString(29, secondFormModel.getKanoon());
                statement.setString(30, secondFormModel.getGheshr());
                statement.setString(31, secondFormModel.getPaygah());
                statement.setString(32, secondFormModel.getAddress());
                statement.setString(33, secondFormModel.getEmail());
                statement.setString(34, secondFormModel.getMobileNumber());
                statement.setString(35, secondFormModel.getTelephone());
                statement.setString(36, secondFormModel.getPersonalBlog());
                statement.setString(37, secondFormModel.getWorkPlaceTelephone());
                statement.setString(38, secondFormModel.getEducation());
                statement.setString(39, secondFormModel.getMaghtaTahsili());
                statement.setString(40, secondFormModel.getDabirestanReshte());
                statement.setString(41, secondFormModel.getDabirestanNameMarkaz());
                statement.setString(42, secondFormModel.getDabirestanKeshvar());
                statement.setString(43, secondFormModel.getDabirestanOstan());
                statement.setString(44, secondFormModel.getDabirestanShahr());
                statement.setString(45, secondFormModel.getDabirestanBakhsh());
                statement.setString(46, secondFormModel.getDabirestanSalShooro());
                statement.setString(47, secondFormModel.getDabirestanSaleKhateme());
                statement.setString(48, secondFormModel.getDabirestanDesc());
                statement.setString(49, secondFormModel.getKardaniReshte());
                statement.setString(50, secondFormModel.getKardaniNameMarkaz());
                statement.setString(51, secondFormModel.getKardaniKeshvar());
                statement.setString(52, secondFormModel.getKardaniOstan());
                statement.setString(53, secondFormModel.getKardaniShahr());
                statement.setString(54, secondFormModel.getKardaniBakhsh());
                statement.setString(55, secondFormModel.getKardaniSaleShooro());
                statement.setString(56, secondFormModel.getKardaniSaleKhateme());
                statement.setString(57, secondFormModel.getKardaniDesc());
                statement.setString(58, secondFormModel.getKarshenasiReshte());
                statement.setString(59, secondFormModel.getKarshenasiNameMarkaz());
                statement.setString(60, secondFormModel.getKarshenasiKeshvar());
                statement.setString(61, secondFormModel.getKarshenasiOstan());
                statement.setString(62, secondFormModel.getKarshenasiBakhsh());
                statement.setString(63, secondFormModel.getKarshenasiSaleShooro());
                statement.setString(64, secondFormModel.getKarshenasiSaleKhateme());
                statement.setString(65, secondFormModel.getKarshenasiDesc());
                statement.setString(66, secondFormModel.getArshadReshte());
                statement.setString(67, secondFormModel.getArshadNameMarkaz());
                statement.setString(68, secondFormModel.getArshadKeshvar());
                statement.setString(69, secondFormModel.getArshadOstan());
                statement.setString(70, secondFormModel.getArshadBakhsh());
                statement.setString(71, secondFormModel.getArshadSaleShooro());
                statement.setString(72, secondFormModel.getArshadSaleKhateme());
                statement.setString(73, secondFormModel.getArshadDesc());
                statement.setString(74, secondFormModel.getDrReshte());
                statement.setString(75, secondFormModel.getDrNameMarkaz());
                statement.setString(76, secondFormModel.getDrKeshvar());
                statement.setString(77, secondFormModel.getDrOstan());
                statement.setString(78, secondFormModel.getDrBakhsh());
                statement.setString(79, secondFormModel.getDrSaleShooro());
                statement.setString(80, secondFormModel.getDrSaleKhateme());
                statement.setString(81, secondFormModel.getDrDesc());
                statement.setString(82, secondFormModel.getCurrentShogl());
                statement.setString(83, secondFormModel.getCurrentNooFaaliat());
                statement.setString(84, secondFormModel.getCurrentMoassese());
                statement.setString(85, secondFormModel.getCurrentMalekiat());
                statement.setString(86, secondFormModel.getCurrentTabeiatMossese());
                statement.setString(87, secondFormModel.getCurrentMosseseKeshvar());
                statement.setString(88, secondFormModel.getCurrentMosseseState());
                statement.setString(89, secondFormModel.getCurrentMosseseCity());
                statement.setString(90, secondFormModel.getCurrentMosseseFrom());
                statement.setString(91, secondFormModel.getCurrentMosseseTo());
                statement.setString(92, secondFormModel.getCurrentReasonOfResigning());
                statement.setString(93, secondFormModel.getPreviousShogl());
                statement.setString(94, secondFormModel.getPreviousNooFaaliat());
                statement.setString(95, secondFormModel.getPreviousMoassese());
                statement.setString(96, secondFormModel.getPreviousMalekiat());
                statement.setString(97, secondFormModel.getPreviousTabeiatMossese());
                statement.setString(98, secondFormModel.getPreviousMosseseKeshvar());
                statement.setString(99, secondFormModel.getPreviousMosseseState());
                statement.setString(100, secondFormModel.getPreviousMosseseCity());
                statement.setString(101, secondFormModel.getPreviousMosseseFrom());
                statement.setString(102, secondFormModel.getPreviousMosseseTo());
                statement.setString(103, secondFormModel.getPreviousReasonOfResigning());
                statement.setString(104, secondFormModel.getTimeInFrontAsMonth());
                statement.setString(105, secondFormModel.getHandicapOrInjuryPercentage());
                statement.setString(106, secondFormModel.getCaptivityAsMonth());
                statement.setString(107, secondFormModel.getFreedomRate());
                statement.setString(108, secondFormModel.getSabegheHamkariBanahad());
                statement.setString(109, secondFormModel.getNooHamkari());
                statement.setString(110, secondFormModel.getHamkariFrom());
                statement.setString(111, secondFormModel.getHamkariTo());
                statement.setString(112, secondFormModel.getElatghatHamkari());
                statement.setString(113, secondFormModel.getVabastegiBeKhanevadeIsarGaran());
                statement.setString(114, secondFormModel.getFullNameIsargar());
                statement.setString(115, secondFormModel.getNesbatIsargarBaShoma());
                statement.setString(116, secondFormModel.getFirstState());
                statement.setString(117, secondFormModel.getFirstZone());
                statement.setString(118, secondFormModel.getFirstMarkazMoghavemat());
                statement.setString(119, secondFormModel.getFirstHozeMoghavemat());
                statement.setString(120, secondFormModel.getFirstPaygahMoghavemat());
                statement.setString(121, secondFormModel.getFirstModatFrom());
                statement.setString(122, secondFormModel.getFirstModatTo());
                statement.setString(123, secondFormModel.getFirstNoe());
                statement.setString(124, secondFormModel.getFirstZekrMasooliat());
                statement.setString(125, secondFormModel.getSecondState());
                statement.setString(126, secondFormModel.getSecondZone());
                statement.setString(127, secondFormModel.getSecondMarkazMoghavemat());
                statement.setString(128, secondFormModel.getSecondHozeMoghavemat());
                statement.setString(129, secondFormModel.getSecondPaygahMoghavemat());
                statement.setString(130, secondFormModel.getSecondModatFrom());
                statement.setString(131, secondFormModel.getSecondModatTo());
                statement.setString(132, secondFormModel.getSecondNoe());
                statement.setString(133, secondFormModel.getSecondZekrMasooliat());
                statement.setString(134, secondFormModel.getFiveYearsFirstState());
                statement.setString(135, secondFormModel.getFiveYearsFirstShahr());
                statement.setString(136, secondFormModel.getFiveYearsFirstAddress());
                statement.setString(137, secondFormModel.getFiveYearsFirstFrom());
                statement.setString(138, secondFormModel.getFiveYearsFirstTo());
                statement.setString(139, secondFormModel.getFiveYearsFirstTelephone());
                statement.setString(140, secondFormModel.getFiveYearsSecondState());
                statement.setString(141, secondFormModel.getFiveYearsSecondShahr());
                statement.setString(142, secondFormModel.getFiveYearsSecondAddress());
                statement.setString(143, secondFormModel.getFiveYearsSecondFrom());
                statement.setString(144, secondFormModel.getFiveYearsSecondTo());
                statement.setString(145, secondFormModel.getFiveYearsSecondTelephone());

                statement.addBatch();
                count++;
                // execute every 100 rows or less
                if (count % 100 == 0 || count == list.size()) {
                    statement.executeBatch();
                }
            }

//            selectAllQuery = "SELECT * FROM RegistrationFormFirst WHERE id = " + registrationFormFirstModelSingle.getId();
            selectAllQuery = "SELECT * FROM SecondForm WHERE FirstFormID = " + "1";
            Statement statement2 = conn.createStatement();
            ResultSet resultSet = statement2.executeQuery(selectAllQuery);

            while (resultSet.next()) {
                JSONObject record = new JSONObject();

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


                jsonArray.add(record);
            }
            jsonObject.put("usersData", jsonArray);
            conn.close();


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("I Got Called");
        return jsonObject;
    }

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }


}

