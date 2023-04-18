package com.example.userregisteration.controller;

import com.example.userregisteration.model.SecondFormModel;
import com.example.userregisteration.model.ThirdFormModel;
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
@RequestMapping("/third")
public class ThirdFormController {
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

            selectAllQuery = "SELECT * FROM ThirdForm";
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
    public JSONObject saveSingleUser(@RequestBody ThirdFormModel thirdFormModelSingle) throws Exception {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        String url, user, password, sql, selectAllQuery, SelectLastIDQuery;
//        int number = 42;
//        url = "jdbc:sqlserver://localhost;databaseName=Test_DB" + ";encrypt=true;trustServerCertificate=true";
//        user = "tiny";
//        password = "ResidentEvil6";
        List<ThirdFormModel> list = new ArrayList<>();
//        RegistrationFormFirstModel registrationFormFirstModelSingle = new RegistrationFormFirstModel();

//        registrationFormFirstModelSingle.setId(BigDecimal.valueOf(3));
//        registrationFormFirstModelSingle.setName("Erfan");
        list.add(thirdFormModelSingle);

        String SQL = "INSERT INTO ThirdForm(id\n" +
                ",nameKhanevadegi\n" +
                ",nesbat\n" +
                ",noeFaaliatSiasi\n" +
                ",nameTashakol\n" +
                ",mahalFaaliat\n" +
                ",nooFaaliat\n" +
                ",nooFaaliatShomaBaBastegan\n" +
                ",angizeHamkari\n" +
                ",modatHamkariAs\n" +
                ",modatHamkariTa\n" +
                ",elatGhatHamkari\n" +
                ",kadrNamoNameKhanevadegi\n" +
                ",kadrNamePedar\n" +
                ",kadrNesbat\n" +
                ",kadrNoEtteham\n" +
                ",kadrTerikhEdamZendani\n" +
                ",kadrVaziatFeli\n" +
                ",kadrMizanErtebat\n" +
                ",mahalKeshvar\n" +
                ",mahalOstan\n" +
                ",kadrSeNamoNameKhanevadegi\n" +
                ",kadrSeNamePedar\n" +
                ",kadrSeNesbat\n" +
                ",kadrSeShoghl\n" +
                ",kadrSeNameKeshvar\n" +
                ",kadrSeModatEghamat\n" +
                ",kadrSeTabeiat\n" +
                ",kadrSePanahandegi\n" +
                ",kadrSeMosaferat\n" +
                ",kadrSeTahmil\n" +
                ",kadrSeGheire\n" +
                ",kadrChaharNameKhanevadegi\n" +
                ",kadrChaharNamePedar\n" +
                ",kadrChaharSen\n" +
                ",kadrChaharShoghlFeli\n" +
                ",kadrChaharShoghlGhabli\n" +
                ",kadrChaharModatAshnaei\n" +
                ",kadrChaharNeshani\n" +
                ",kadrChaharTelephone\n" +
                ",kadrPanjNameKhanevadegi\n" +
                ",kadrPanjNamePedar\n" +
                ",kadrPanjNesbat\n" +
                ",kadrPanjSen\n" +
                ",kadrPanjTahsilat\n" +
                ",kadrPanjShoghl\n" +
                ",kadrPanjTabeiat\n" +
                ",kadrPanjDin\n" +
                ",kadrPanjMazhab\n" +
                ",kadrPanjDarGheyd\n" +
                ",iAgree\n)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (
                Connection conn = connect();
                PreparedStatement statement = conn.prepareStatement(SQL);) {
            int count = 0;


//            ResultSet resultSet3 = statement.executeQuery(selectAllQuery);
//            BigDecimal lastId = resultSet3.getBigDecimal("id");

            SelectLastIDQuery = "SELECT TOP 1 * FROM ThirdForm\n" +
                    "ORDER BY id DESC";
            Statement statement4 = conn.createStatement();
            ResultSet resultSet4 = statement4.executeQuery(SelectLastIDQuery);
            BigDecimal lastId = BigDecimal.valueOf(0);
            while (resultSet4.next()) {
                lastId = resultSet4.getBigDecimal("id");
            }
            lastId = lastId.add(BigDecimal.valueOf(1));

            for (ThirdFormModel thirdFormModel : list) {
                statement.setBigDecimal(1, lastId);
                statement.setString(2, thirdFormModel.getNameKhanevadegi());
                statement.setString(3, thirdFormModel.getNesbat());
                statement.setString(4, thirdFormModel.getNoeFaaliatSiasi());
                statement.setString(5, thirdFormModel.getNameTashakol());
                statement.setString(6, thirdFormModel.getMahalFaaliat());
                statement.setString(7, thirdFormModel.getNooFaaliat());
                statement.setString(8, thirdFormModel.getNooFaaliatShomaBaBastegan());
                statement.setString(9, thirdFormModel.getAngizeHamkari());
                statement.setString(10, thirdFormModel.getModatHamkariAs());
                statement.setString(11, thirdFormModel.getModatHamkariTa());
                statement.setString(12, thirdFormModel.getElatGhatHamkari());
                statement.setString(13, thirdFormModel.getKadrNamoNameKhanevadegi());
                statement.setString(14, thirdFormModel.getKadrNamePedar());
                statement.setString(15, thirdFormModel.getKadrNesbat());
                statement.setString(16, thirdFormModel.getKadrNoEtteham());
                statement.setString(17, thirdFormModel.getKadrTerikhEdamZendani());
                statement.setString(18, thirdFormModel.getKadrVaziatFeli());
                statement.setString(19, thirdFormModel.getKadrMizanErtebat());
                statement.setString(20, thirdFormModel.getMahalKeshvar());
                statement.setString(21, thirdFormModel.getMahalOstan());
                statement.setString(22, thirdFormModel.getKadrSeNamoNameKhanevadegi());
                statement.setString(23, thirdFormModel.getKadrSeNamePedar());
                statement.setString(24, thirdFormModel.getKadrSeNesbat());
                statement.setString(25, thirdFormModel.getKadrSeShoghl());
                statement.setString(26, thirdFormModel.getKadrSeNameKeshvar());
                statement.setString(27, thirdFormModel.getKadrSeModatEghamat());
                statement.setString(28, thirdFormModel.getKadrSeTabeiat());
                statement.setString(29, thirdFormModel.getKadrSePanahandegi());
                statement.setString(30, thirdFormModel.getKadrSeMosaferat());
                statement.setString(31, thirdFormModel.getKadrSeTahmil());
                statement.setString(32, thirdFormModel.getKadrSeGheire());
                statement.setString(33, thirdFormModel.getKadrChaharNameKhanevadegi());
                statement.setString(34, thirdFormModel.getKadrChaharNamePedar());
                statement.setString(35, thirdFormModel.getKadrChaharSen());
                statement.setString(36, thirdFormModel.getKadrChaharShoghlFeli());
                statement.setString(37, thirdFormModel.getKadrChaharShoghlGhabli());
                statement.setString(38, thirdFormModel.getKadrChaharModatAshnaei());
                statement.setString(39, thirdFormModel.getKadrChaharNeshani());
                statement.setString(40, thirdFormModel.getKadrChaharTelephone());
                statement.setString(41, thirdFormModel.getKadrPanjNameKhanevadegi());
                statement.setString(42, thirdFormModel.getKadrPanjNamePedar());
                statement.setString(43, thirdFormModel.getKadrPanjNesbat());
                statement.setString(44, thirdFormModel.getKadrPanjSen());
                statement.setString(45, thirdFormModel.getKadrPanjTahsilat());
                statement.setString(46, thirdFormModel.getKadrPanjShoghl());
                statement.setString(47, thirdFormModel.getKadrPanjTabeiat());
                statement.setString(48, thirdFormModel.getKadrPanjDin());
                statement.setString(49, thirdFormModel.getKadrPanjMazhab());
                statement.setString(50, thirdFormModel.getKadrPanjDarGheyd());
                statement.setBoolean(51, thirdFormModel.getiAgree());


                statement.addBatch();
                count++;
                // execute every 100 rows or less
                if (count % 100 == 0 || count == list.size()) {
                    statement.executeBatch();
                }
            }

            selectAllQuery = "SELECT * FROM ThirdForm WHERE id = " + lastId.toString();
//            selectAllQuery = "SELECT * FROM ThirdForm WHERE id = " + "1";
            Statement statement2 = conn.createStatement();
            ResultSet resultSet = statement2.executeQuery(selectAllQuery);

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
