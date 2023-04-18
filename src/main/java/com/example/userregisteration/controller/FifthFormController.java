package com.example.userregisteration.controller;

import com.example.userregisteration.model.FifthFormModel;
import com.example.userregisteration.model.FourthFormModel;
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
@RequestMapping("/fifth")
public class FifthFormController {
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

            selectAllQuery = "SELECT * FROM FifthForm";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectAllQuery);

            while (resultSet.next()) {
                JSONObject record = new JSONObject();

                record.put("id", resultSet.getInt("id"));
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
    public JSONObject saveSingleUser(@RequestBody FifthFormModel fifthFormModelSingle) throws Exception {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        String url, user, password, sql, selectAllQuery, SelectLastIDQuery;

        List<FifthFormModel> list = new ArrayList<>();

        list.add(fifthFormModelSingle);

        String SQL = "INSERT INTO FifthForm(id\n" +
                ",title\n" +
                ",takhasosi\n" +
                ",vizhegi\n" +
                ",onvanDoreh\n" +
                ",zamanEjraShoro\n" +
                ",zamanEjraPayan\n" +
                ",zamanAmoozeshRooz\n" +
                ",zamanAmoozeshSaat\n" +
                ",mahalAmoozesh\n" +
                ",mahalTaeedVaMohr\n" +
                ",onvanOzviatAdi\n" +
                ",onvanOzviatVizhe\n" +
                ",normalKartNumber\n" +
                ",normalKartGereftam\n" +
                ",vipCardNumber\n" +
                ",vipCardGereftam)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (
                Connection conn = connect();
                PreparedStatement statement = conn.prepareStatement(SQL);) {
            int count = 0;


            SelectLastIDQuery = "SELECT TOP 1 * FROM FifthForm\n" +
                    "ORDER BY id DESC";
            Statement statement4 = conn.createStatement();
            ResultSet resultSet4 = statement4.executeQuery(SelectLastIDQuery);
            BigDecimal lastId = BigDecimal.valueOf(0);
            while (resultSet4.next()) {
                lastId = resultSet4.getBigDecimal("id");
            }
            lastId = lastId.add(BigDecimal.valueOf(1));

            for (FifthFormModel fifthFormModel : list) {
                statement.setBigDecimal(1, lastId);
                statement.setString(2, fifthFormModel.getTitle());
                statement.setString(3, fifthFormModel.getTakhasosi());
                statement.setString(4, fifthFormModel.getVizhegi());
                statement.setString(5, fifthFormModel.getOnvanDoreh());
                statement.setString(6, fifthFormModel.getZamanEjraShoro());
                statement.setString(7, fifthFormModel.getZamanEjraPayan());
                statement.setString(8, fifthFormModel.getZamanAmoozeshRooz());
                statement.setString(9, fifthFormModel.getZamanAmoozeshSaat());
                statement.setString(10, fifthFormModel.getMahalAmoozesh());
                statement.setString(11, fifthFormModel.getMahalTaeedVaMohr());
                statement.setString(12, fifthFormModel.getOnvanOzviatAdi());
                statement.setString(13, fifthFormModel.getOnvanOzviatVizhe());
                statement.setString(14, fifthFormModel.getNormalKartNumber());
                statement.setBoolean(15, fifthFormModel.getNormalKartGereftam());
                statement.setString(16, fifthFormModel.getVipCardNumber());
                statement.setBoolean(17, fifthFormModel.getVipCardGereftam());


                statement.addBatch();
                count++;
                // execute every 100 rows or less
                if (count % 100 == 0 || count == list.size()) {
                    statement.executeBatch();
                }
            }

            selectAllQuery = "SELECT * FROM FifthForm WHERE id = " + lastId.toString();
//            selectAllQuery = "SELECT * FROM ThirdForm WHERE id = " + "1";
            Statement statement2 = conn.createStatement();
            ResultSet resultSet = statement2.executeQuery(selectAllQuery);

            while (resultSet.next()) {
                JSONObject record = new JSONObject();

                record.put("id", resultSet.getInt("id"));
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
