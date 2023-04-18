package com.example.userregisteration.controller;

import com.example.userregisteration.model.FourthFormModel;
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
@RequestMapping("/fourth")
public class FourthFormController {
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

            selectAllQuery = "SELECT * FROM FourthForm";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectAllQuery);

            while (resultSet.next()) {
                JSONObject record = new JSONObject();

                record.put("id", resultSet.getInt("id"));
                record.put("ostan", resultSet.getString("ostan"));
                record.put("nahie", resultSet.getString("nahie"));
                record.put("hoze", resultSet.getString("hoze"));
                record.put("paygah", resultSet.getString("paygah"));
                record.put("shenasePaygah", resultSet.getString("shenasePaygah"));
                record.put("nameGheshr", resultSet.getString("nameGheshr"));
                record.put("name", resultSet.getString("name"));
                record.put("nameKhanevadegi", resultSet.getString("nameKhanevadegi"));
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

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public JSONObject saveSingleUser(@RequestBody FourthFormModel fourthFormModelSingle) throws Exception {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        String url, user, password, sql, selectAllQuery, SelectLastIDQuery;

        List<FourthFormModel> list = new ArrayList<>();

        list.add(fourthFormModelSingle);

        String SQL = "INSERT INTO FourthForm(id\n" +
                ",ostan\n" +
                ",nahie\n" +
                ",hoze\n" +
                ",paygah\n" +
                ",shenasePaygah\n" +
                ",nameGheshr\n" +
                ",name\n" +
                ",nameKhanevadegi\n" +
                ",namePedar\n" +
                ",shomareMelli\n" +
                ",shomareShenasname\n" +
                ",tarikhTavalod\n" +
                ",mahalTavalod\n" +
                ",sharestan\n" +
                ",shar\n" +
                ",bakhsh\n" +
                ",gensiat\n" +
                ",taahol\n" +
                ",goorohKhoon\n" +
                ",vaziatGesmani\n" +
                ",faaliatVizhe\n" +
                ",din\n" +
                ",mazhab\n" +
                ",tebeiat\n" +
                ",tahsilatClassic\n" +
                ",reshteTahsili\n" +
                ",tahsilatHozavi\n" +
                ",tarikhPishBiniEtmamTahsil\n" +
                ",khandanNeveshtan\n" +
                ",vaziatShoghli\n" +
                ",onvanDaghighShoghli\n" +
                ",mohasel\n" +
                ",nezami\n" +
                ",motekhases\n" +
                ",khanedar\n" +
                ",bazneshaste\n" +
                ",gheydOnvan\n" +
                ",joyaeShoghl\n" +
                ",sayer\n" +
                ",onvanShoghlRaNamBebarid\n" +
                ",vaziatKhedmatVazifeOmoomi\n" +
                ",noeMafiat\n" +
                ",ghomiat\n" +
                ",ghomiatRaNameBebarid\n" +
                ",noeIsargariDavtalab\n" +
                ",nesbatDavtalabBaIsargar\n" +
                ",sokoonatOstan\n" +
                ",sokoonatShahrestan\n" +
                ",sokoonatShar\n" +
                ",sokoonatMahale\n" +
                ",sokoonatKhiaban\n" +
                ",sokoonatKooche\n" +
                ",sokoonatBoolook\n" +
                ",sokoonatPelak\n" +
                ",sokoonatTabaghe\n" +
                ",sokoonatVahed\n" +
                ",sokoonatCodePosti\n" +
                ",sokoonatTelephone\n" +
                ",sokoonatWorkPhone\n" +
                ",sokoonatMobile\n" +
                ",sokoonatEmail)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (
                Connection conn = connect();
                PreparedStatement statement = conn.prepareStatement(SQL);) {
            int count = 0;


//            ResultSet resultSet3 = statement.executeQuery(selectAllQuery);
//            BigDecimal lastId = resultSet3.getBigDecimal("id");

            SelectLastIDQuery = "SELECT TOP 1 * FROM FourthForm\n" +
                    "ORDER BY id DESC";
            Statement statement4 = conn.createStatement();
            ResultSet resultSet4 = statement4.executeQuery(SelectLastIDQuery);
            BigDecimal lastId = BigDecimal.valueOf(0);
            while (resultSet4.next()) {
                lastId = resultSet4.getBigDecimal("id");
            }
            lastId = lastId.add(BigDecimal.valueOf(1));

            for (FourthFormModel fourthFormModel : list) {
                statement.setBigDecimal(1, lastId);
                statement.setString(2, fourthFormModel.getOstan());
                statement.setString(3, fourthFormModel.getNahie());
                statement.setString(4, fourthFormModel.getHoze());
                statement.setString(5, fourthFormModel.getPaygah());
                statement.setString(6, fourthFormModel.getShenasePaygah());
                statement.setString(7, fourthFormModel.getNameGheshr());
                statement.setString(8, fourthFormModel.getName());
                statement.setString(9, fourthFormModel.getNameKhanevadegi());
                statement.setString(10, fourthFormModel.getNamePedar());
                statement.setString(11, fourthFormModel.getShomareMelli());
                statement.setString(12, fourthFormModel.getShomareShenasname());
                statement.setString(13, fourthFormModel.getTarikhTavalod());
                statement.setString(14, fourthFormModel.getMahalTavalod());
                statement.setString(15, fourthFormModel.getSharestan());
                statement.setString(16, fourthFormModel.getShar());
                statement.setString(17, fourthFormModel.getBakhsh());
                statement.setString(18, fourthFormModel.getGensiat());
                statement.setString(19, fourthFormModel.getTaahol());
                statement.setString(20, fourthFormModel.getGoorohKhoon());
                statement.setString(21, fourthFormModel.getVaziatGesmani());
                statement.setString(22, fourthFormModel.getFaaliatVizhe());
                statement.setString(23, fourthFormModel.getDin());
                statement.setString(24, fourthFormModel.getMazhab());
                statement.setString(25, fourthFormModel.getTebeiat());
                statement.setString(26, fourthFormModel.getTahsilatClassic());
                statement.setString(27, fourthFormModel.getReshteTahsili());
                statement.setString(28, fourthFormModel.getTahsilatHozavi());
                statement.setString(29, fourthFormModel.getTarikhPishBiniEtmamTahsil());
                statement.setString(30, fourthFormModel.getKhandanNeveshtan());
                statement.setString(31, fourthFormModel.getVaziatShoghli());
                statement.setString(32, fourthFormModel.getOnvanDaghighShoghli());
                statement.setString(33, fourthFormModel.getMohasel());
                statement.setString(34, fourthFormModel.getNezami());
                statement.setString(35, fourthFormModel.getMotekhases());
                statement.setString(36, fourthFormModel.getKhanedar());
                statement.setString(37, fourthFormModel.getBazneshaste());
                statement.setString(38, fourthFormModel.getGheydOnvan());
                statement.setString(39, fourthFormModel.getJoyaeShoghl());
                statement.setString(40, fourthFormModel.getSayer());
                statement.setString(41, fourthFormModel.getOnvanShoghlRaNamBebarid());
                statement.setString(42, fourthFormModel.getVaziatKhedmatVazifeOmoomi());
                statement.setString(43, fourthFormModel.getNoeMafiat());
                statement.setString(44, fourthFormModel.getGhomiat());
                statement.setString(45, fourthFormModel.getGhomiatRaNameBebarid());
                statement.setString(46, fourthFormModel.getNoeIsargariDavtalab());
                statement.setString(47, fourthFormModel.getNesbatDavtalabBaIsargar());
                statement.setString(48, fourthFormModel.getSokoonatOstan());
                statement.setString(49, fourthFormModel.getSokoonatShahrestan());
                statement.setString(50, fourthFormModel.getSokoonatShar());
                statement.setString(51, fourthFormModel.getSokoonatMahale());
                statement.setString(52, fourthFormModel.getSokoonatKhiaban());
                statement.setString(53, fourthFormModel.getSokoonatKooche());
                statement.setString(54, fourthFormModel.getSokoonatBoolook());
                statement.setString(55, fourthFormModel.getSokoonatPelak());
                statement.setString(56, fourthFormModel.getSokoonatTabaghe());
                statement.setString(57, fourthFormModel.getSokoonatVahed());
                statement.setString(58, fourthFormModel.getSokoonatCodePosti());
                statement.setString(59, fourthFormModel.getSokoonatTelephone());
                statement.setString(60, fourthFormModel.getSokoonatWorkPhone());
                statement.setString(61, fourthFormModel.getSokoonatMobile());
                statement.setString(62, fourthFormModel.getSokoonatEmail());



                statement.addBatch();
                count++;
                // execute every 100 rows or less
                if (count % 100 == 0 || count == list.size()) {
                    statement.executeBatch();
                }
            }

            selectAllQuery = "SELECT * FROM FourthForm WHERE id = " + lastId.toString();
//            selectAllQuery = "SELECT * FROM ThirdForm WHERE id = " + "1";
            Statement statement2 = conn.createStatement();
            ResultSet resultSet = statement2.executeQuery(selectAllQuery);

            while (resultSet.next()) {
                JSONObject record = new JSONObject();


                record.put("id", resultSet.getInt("id"));
                record.put("ostan", resultSet.getString("ostan"));
                record.put("nahie", resultSet.getString("nahie"));
                record.put("hoze", resultSet.getString("hoze"));
                record.put("paygah", resultSet.getString("paygah"));
                record.put("shenasePaygah", resultSet.getString("shenasePaygah"));
                record.put("nameGheshr", resultSet.getString("nameGheshr"));
                record.put("name", resultSet.getString("name"));
                record.put("nameKhanevadegi", resultSet.getString("nameKhanevadegi"));
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
