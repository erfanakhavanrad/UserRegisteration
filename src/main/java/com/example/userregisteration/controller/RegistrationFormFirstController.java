package com.example.userregisteration.controller;

import com.example.userregisteration.model.RegistrationFormFirstModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

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


    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public JSONObject getAllUsers() throws Exception {
        String url, user, password, sql, selectAllQuery;
//        int number = 42;
        url = "jdbc:sqlserver://localhost;databaseName=Test_DB" + ";encrypt=true;trustServerCertificate=true";
        user = "tiny";
        password = "ResidentEvil6";

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
//RegistrationFormFirstModel registrationFormFirstModel = jsonObject;
//            int count = 0;
//            while (resultSet.next()) {
//                count++;
//                String name = resultSet.getString("userName");
//                int number2 = resultSet.getInt("number");
//                System.out.printf("user %d: %s - %d\n", count, name, number2);
//
//            }


            connection.close();

        } catch (SQLException e) {
            System.out.println("There was an error!");
            e.printStackTrace();
        }
        return jsonObject;
    }


}
