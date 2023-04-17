package com.example.userregisteration.controller;

import com.example.userregisteration.model.RegistrationFormFirstModel;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Erfan Akhavan Rad
 * @created 04/17/2023
 */
@RestController
@RequestMapping("/users")
public class RegistrationFormFirstController {
//    @Value("{spring.datasource.url}")
//    String url;
//
//    @Value("{spring.datasource.password}")
//    String password;
//
//    @Value("{spring.datasource.username}")
//    String user;

    String url = "jdbc:sqlserver://localhost;databaseName=Test_DB" + ";encrypt=true;trustServerCertificate=true";
    String user = "tiny";
    String password = "ResidentEvil6";


    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public JSONObject getAllUsers() throws Exception {
//        String url, user, password, sql,
        String selectAllQuery;
//        int number = 42;


        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        try {
            Connection connection = DriverManager.getConnection(url
                    , user, password);
            System.out.println("Connected");

            // First method
//            Statement statement = connection.createStatement();
//            sql = "INSERT INTO users (userName, number) VALUES ('" + user + "'," + number + ")";
//            int rows = statement.executeUpdate(sql);

            // Second method
//            sql = "INSERT INTO users (userName, number) VALUES (?,?)";
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, "Idiot");
//            preparedStatement.setInt(2, 66);
//            int rows = preparedStatement.executeUpdate();

//            if (rows > 0) System.out.println("1 Row effected.");


            selectAllQuery = "SELECT * FROM RegistrationFormFirst";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectAllQuery);

            while (resultSet.next()) {
                JSONObject record = new JSONObject();

                record.put("id", resultSet.getInt("id"));
                record.put("name", resultSet.getString("name"));
                record.put("lastName", resultSet.getString("lastName"));
                record.put("fatherName", resultSet.getString("fatherName"));
                record.put("idCode", resultSet.getString("idCode"));
                record.put("passportNumber", resultSet.getString("passportNumber"));
                record.put("birthday", resultSet.getString("birthday"));
                record.put("birthPlace", resultSet.getString("birthPlace"));
                record.put("exportPlace", resultSet.getString("exportPlace"));
                record.put("gender", resultSet.getString("gender"));
                record.put("religion", resultSet.getString("religion"));
                record.put("bloodyType", resultSet.getString("bloodyType"));
                record.put("marriageStatus", resultSet.getString("marriageStatus"));
                record.put("kidsNumber", resultSet.getString("kidsNumber"));
                record.put("mobileNumber", resultSet.getString("mobileNumber"));
                record.put("email", resultSet.getString("email"));
                record.put("address", resultSet.getString("address"));
                record.put("postalCode", resultSet.getString("postalCode"));
                record.put("telephone", resultSet.getString("telephone"));
                record.put("workPlaceAddress", resultSet.getString("workPlaceAddress"));
                record.put("workPlaceTelephone", resultSet.getString("workPlaceTelephone"));
                record.put("fax", resultSet.getString("fax"));
                record.put("timeInFrontAsMonth", resultSet.getString("timeInFrontAsMonth"));
                record.put("handicapPercentage", resultSet.getString("handicapPercentage"));
                record.put("captivityAsMonth", resultSet.getString("captivityAsMonth"));
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
                record.put("state", resultSet.getString("state"));
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
                jsonArray.add(record);
            }
            jsonObject.put("usrsData", jsonArray);
            connection.close();

        } catch (SQLException e) {
            System.out.println("There was an error!");
            e.printStackTrace();
        }
        return jsonObject;
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public JSONObject saveSingUser(@RequestBody RegistrationFormFirstModel registrationFormFirstModelSingle) throws Exception {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        String url, user, password, sql, selectAllQuery, SelectLastIDQuery;
//        int number = 42;
//        url = "jdbc:sqlserver://localhost;databaseName=Test_DB" + ";encrypt=true;trustServerCertificate=true";
//        user = "tiny";
//        password = "ResidentEvil6";
        List<RegistrationFormFirstModel> list = new ArrayList<>();
//        RegistrationFormFirstModel registrationFormFirstModelSingle = new RegistrationFormFirstModel();

//        registrationFormFirstModelSingle.setId(BigDecimal.valueOf(3));
//        registrationFormFirstModelSingle.setName("Erfan");
        list.add(registrationFormFirstModelSingle);

        String SQL = "INSERT INTO RegistrationFormFirst(id\n" +
                "      ,name\n" +
                "      ,lastName\n" +
                "      ,fatherName\n" +
                "      ,idCode\n" +
                "      ,passportNumber\n" +
                "      ,birthday\n" +
                "      ,birthPlace\n" +
                "      ,exportPlace\n" +
                "      ,gender\n" +
                "      ,religion\n" +
                "      ,bloodyType\n" +
                "      ,marriageStatus\n" +
                "      ,kidsNumber\n" +
                "      ,mobileNumber\n" +
                "      ,email\n" +
                "      ,address\n" +
                "      ,postalCode\n" +
                "      ,telephone\n" +
                "      ,workPlaceAddress\n" +
                "      ,workPlaceTelephone\n" +
                "      ,fax\n" +
                "      ,timeInFrontAsMonth\n" +
                "      ,handicapPercentage\n" +
                "      ,captivityAsMonth\n" +
                "      ,martyrFamily\n" +
                "      ,captivityFamily\n" +
                "      ,hozoaviLevel\n" +
                "      ,studyHoze\n" +
                "      ,lastDegree\n" +
                "      ,graduationYear\n" +
                "      ,university\n" +
                "      ,graduationCity\n" +
                "      ,field\n" +
                "      ,fieldOrientation\n" +
                "      ,dissertationTitle\n" +
                "      ,english\n" +
                "      ,arabic\n" +
                "      ,french\n" +
                "      ,spanish\n" +
                "      ,german\n" +
                "      ,russian\n" +
                "      ,others\n" +
                "      ,iSINamayeCount\n" +
                "      ,iSCNamayeCount\n" +
                "      ,scientificResearchesCount\n" +
                "      ,internationalPresentedResearchesCount\n" +
                "      ,researchesInternalAndSpecializedMagazinesCount\n" +
                "      ,finishedResearchesCount\n" +
                "      ,writtenBooksCount\n" +
                "      ,translatedBooksCount\n" +
                "      ,registeredInventionsCount\n" +
                "      ,internationConferenceAttendanceCount\n" +
                "      ,scientificMeetingsHeldCount\n" +
                "      ,internationMeetingsHeldCount\n" +
                "      ,state\n" +
                "      ,city\n" +
                "      ,teachingUniversity\n" +
                "      ,teachingCollege\n" +
                "      ,scientificGroup\n" +
                "      ,mainExpertiseField\n" +
                "      ,scientificPosition\n" +
                "      ,hiringDate\n" +
                "      ,cooperationType\n" +
                "      ,otherBasigOrganizationsIfExists\n" +
                "      ,kargrouhMotaleati\n" +
                "      ,halgheElmi\n" +
                "      ,olomEnsani\n" +
                "      ,sokhanrani\n" +
                "      ,farhangi\n" +
                "      ,tahghighati\n" +
                "      ,modiriati\n" +
                "      ,moshavarei\n" +
                "      ,cyberi\n" +
                "      ,siasi\n" +
                "      ,ejtemaei\n" +
                "      ,tarbiati\n" +
                "      ,rahbordi\n" +
                "      ,ejraie\n" +
                "      ,talif\n" +
                "      ,tarjome\n" +
                "      ,taskilMardomNahad\n" +
                "      ,iAgreeToTerm\n)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (
                Connection conn = connect();
                PreparedStatement statement = conn.prepareStatement(SQL);) {
            int count = 0;


//            ResultSet resultSet3 = statement.executeQuery(selectAllQuery);
//            BigDecimal lastId = resultSet3.getBigDecimal("id");

            SelectLastIDQuery = "SELECT TOP 1 * FROM RegistrationFormFirst\n" +
                    "ORDER BY id DESC";
            Statement statement4 = conn.createStatement();
            ResultSet resultSet4 = statement4.executeQuery(SelectLastIDQuery);
            BigDecimal lastId = BigDecimal.valueOf(0);
            while (resultSet4.next()) {
                lastId = resultSet4.getBigDecimal("id");
            }
            lastId = lastId.add(BigDecimal.valueOf(1));

            for (RegistrationFormFirstModel registrationFormFirstModel : list) {
                statement.setBigDecimal(1, lastId);
                statement.setString(2, registrationFormFirstModel.getName());
                statement.setString(3, registrationFormFirstModel.getLastName());
                statement.setString(4, registrationFormFirstModel.getFatherName());
                statement.setString(5, registrationFormFirstModel.getIdCode());
                statement.setString(6, registrationFormFirstModel.getPassportNumber());
                statement.setString(7, registrationFormFirstModel.getBirthday());
                statement.setString(8, registrationFormFirstModel.getBirthPlace());
                statement.setString(9, registrationFormFirstModel.getExportPlace());
                statement.setString(10, registrationFormFirstModel.getGender());
                statement.setString(11, registrationFormFirstModel.getReligion());
                statement.setString(12, registrationFormFirstModel.getBloodyType());
                statement.setString(13, registrationFormFirstModel.getMarriageStatus());
                statement.setString(14, registrationFormFirstModel.getKidsNumber());
                statement.setString(15, registrationFormFirstModel.getMobileNumber());
                statement.setString(16, registrationFormFirstModel.getEmail());
                statement.setString(17, registrationFormFirstModel.getAddress());
                statement.setString(18, registrationFormFirstModel.getPostalCode());
                statement.setString(19, registrationFormFirstModel.getTelephone());
                statement.setString(20, registrationFormFirstModel.getWorkPlaceAddress());
                statement.setString(21, registrationFormFirstModel.getWorkPlaceTelephone());
                statement.setString(22, registrationFormFirstModel.getFax());
                statement.setString(23, registrationFormFirstModel.getTimeInFrontAsMonth());
                statement.setString(24, registrationFormFirstModel.getHandicapPercentage());
                statement.setString(25, registrationFormFirstModel.getCaptivityAsMonth());
                statement.setString(26, registrationFormFirstModel.getMartyrFamily());
                statement.setString(27, registrationFormFirstModel.getCaptivityFamily());
                statement.setString(28, registrationFormFirstModel.getHozoaviLevel());
                statement.setString(29, registrationFormFirstModel.getStudyHoze());
                statement.setString(30, registrationFormFirstModel.getLastDegree());
                statement.setString(31, registrationFormFirstModel.getGraduationYear());
                statement.setString(32, registrationFormFirstModel.getUniversity());
                statement.setString(33, registrationFormFirstModel.getGraduationCity());
                statement.setString(34, registrationFormFirstModel.getField());
                statement.setString(35, registrationFormFirstModel.getFieldOrientation());
                statement.setString(36, registrationFormFirstModel.getDissertationTitle());
                statement.setString(37, registrationFormFirstModel.getEnglish());
                statement.setString(38, registrationFormFirstModel.getArabic());
                statement.setString(39, registrationFormFirstModel.getFrench());
                statement.setString(40, registrationFormFirstModel.getSpanish());
                statement.setString(41, registrationFormFirstModel.getGerman());
                statement.setString(42, registrationFormFirstModel.getRussian());
                statement.setString(43, registrationFormFirstModel.getOthers());
                statement.setString(44, registrationFormFirstModel.getiSINamayeCount());
                statement.setString(45, registrationFormFirstModel.getiSCNamayeCount());
                statement.setString(46, registrationFormFirstModel.getScientificResearchesCount());
                statement.setString(47, registrationFormFirstModel.getInternationalPresentedResearchesCount());
                statement.setString(48, registrationFormFirstModel.getResearchesInternalAndSpecializedMagazinesCount());
                statement.setString(49, registrationFormFirstModel.getFinishedResearchesCount());
                statement.setString(50, registrationFormFirstModel.getWrittenBooksCount());
                statement.setString(51, registrationFormFirstModel.getTranslatedBooksCount());
                statement.setString(52, registrationFormFirstModel.getRegisteredInventionsCount());
                statement.setString(53, registrationFormFirstModel.getInternationConferenceAttendanceCount());
                statement.setString(54, registrationFormFirstModel.getScientificMeetingsHeldCount());
                statement.setString(55, registrationFormFirstModel.getInternationMeetingsHeldCount());
                statement.setString(56, registrationFormFirstModel.getState());
                statement.setString(57, registrationFormFirstModel.getCity());
                statement.setString(58, registrationFormFirstModel.getTeachingUniversity());
                statement.setString(59, registrationFormFirstModel.getTeachingCollege());
                statement.setString(60, registrationFormFirstModel.getScientificGroup());
                statement.setString(61, registrationFormFirstModel.getMainExpertiseField());
                statement.setString(62, registrationFormFirstModel.getScientificPosition());
                statement.setString(63, registrationFormFirstModel.getHiringDate());
                statement.setString(64, registrationFormFirstModel.getCooperationType());
                statement.setString(65, registrationFormFirstModel.getOtherBasigOrganizationsIfExists());
                statement.setString(66, registrationFormFirstModel.getKargrouhMotaleati());
                statement.setString(67, registrationFormFirstModel.getHalgheElmi());
                statement.setString(68, registrationFormFirstModel.getOlomEnsani());
                statement.setString(69, registrationFormFirstModel.getSokhanrani());
                statement.setString(70, registrationFormFirstModel.getFarhangi());
                statement.setString(71, registrationFormFirstModel.getTahghighati());
                statement.setString(72, registrationFormFirstModel.getModiriati());
                statement.setString(73, registrationFormFirstModel.getMoshavarei());
                statement.setString(74, registrationFormFirstModel.getCyberi());
                statement.setString(75, registrationFormFirstModel.getSiasi());
                statement.setString(76, registrationFormFirstModel.getEjtemaei());
                statement.setString(77, registrationFormFirstModel.getTarbiati());
                statement.setString(78, registrationFormFirstModel.getRahbordi());
                statement.setString(79, registrationFormFirstModel.getEjraie());
                statement.setString(80, registrationFormFirstModel.getTalif());
                statement.setString(81, registrationFormFirstModel.getTarjome());
                statement.setString(82, registrationFormFirstModel.getTaskilMardomNahad());
                statement.setBoolean(83, registrationFormFirstModel.getiAgreeToTerm());


                statement.addBatch();
                count++;
                // execute every 100 rows or less
                if (count % 100 == 0 || count == list.size()) {
                    statement.executeBatch();
                }
            }

//            selectAllQuery = "SELECT * FROM RegistrationFormFirst WHERE id = " + registrationFormFirstModelSingle.getId();
            selectAllQuery = "SELECT * FROM RegistrationFormFirst WHERE id = " + "1";
            Statement statement2 = conn.createStatement();
            ResultSet resultSet = statement2.executeQuery(selectAllQuery);

            while (resultSet.next()) {
                JSONObject record = new JSONObject();

                record.put("id", resultSet.getInt("id"));
                record.put("name", resultSet.getString("name"));
                record.put("lastName", resultSet.getString("lastName"));
                record.put("fatherName", resultSet.getString("fatherName"));
                record.put("idCode", resultSet.getString("idCode"));
                record.put("passportNumber", resultSet.getString("passportNumber"));
                record.put("birthday", resultSet.getString("birthday"));
                record.put("birthPlace", resultSet.getString("birthPlace"));
                record.put("exportPlace", resultSet.getString("exportPlace"));
                record.put("gender", resultSet.getString("gender"));
                record.put("religion", resultSet.getString("religion"));
                record.put("bloodyType", resultSet.getString("bloodyType"));
                record.put("marriageStatus", resultSet.getString("marriageStatus"));
                record.put("kidsNumber", resultSet.getString("kidsNumber"));
                record.put("mobileNumber", resultSet.getString("mobileNumber"));
                record.put("email", resultSet.getString("email"));
                record.put("address", resultSet.getString("address"));
                record.put("postalCode", resultSet.getString("postalCode"));
                record.put("telephone", resultSet.getString("telephone"));
                record.put("workPlaceAddress", resultSet.getString("workPlaceAddress"));
                record.put("workPlaceTelephone", resultSet.getString("workPlaceTelephone"));
                record.put("fax", resultSet.getString("fax"));
                record.put("timeInFrontAsMonth", resultSet.getString("timeInFrontAsMonth"));
                record.put("handicapPercentage", resultSet.getString("handicapPercentage"));
                record.put("captivityAsMonth", resultSet.getString("captivityAsMonth"));
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
                record.put("state", resultSet.getString("state"));
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

                jsonArray.add(record);
            }
            jsonObject.put("usrsData", jsonArray);
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
