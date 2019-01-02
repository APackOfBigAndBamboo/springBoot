package testdemo;

/**
 * @Derscription TODO
 * @auther David
 * @date 2018-11-27 15:50
 * @Version 1.o
 */
import java.sql.*;
import java.util.HashMap;
import java.util.Map;


public class GZL {

    public static final String DBDRIVER = "com.mysql.jdbc.Driver";
    //jdbc:mysql://106.37.227.30:3306/oms
    public static final String DBURL = "jdbc:mysql://106.37.227.30:3306/omslocal?useSSL=false&autoReconnect=true&testOnBorrow=true&testWhileIdle=true&validationQuery=select 1";
    public static final String DBUSER = "myuse";
    public static final String PASSWORD = "mypassword";

    public static java.sql.Connection connection = null;
    public static java.sql.PreparedStatement preparedStatement = null;
    public static java.sql.ResultSet resultSet = null;

    public static String getConnection() {
        try {
            Class.forName(DBDRIVER);
            DriverManager.setLoginTimeout(5);
            connection = DriverManager.getConnection(DBURL, DBUSER, PASSWORD);
            return "success";
        } catch (ClassNotFoundException e) {
            return "ClassNotFoundException";
        } catch (SQLException e) {
            return  e.toString();
        }
    }


    public static String getCount(String sql) {

        net.sf.json.JSONArray array=new net.sf.json.JSONArray();
        try {
            Class.forName(DBDRIVER);
            DriverManager.setLoginTimeout(2);
            connection = DriverManager.getConnection(DBURL, DBUSER, PASSWORD);
            preparedStatement = connection.prepareStatement(sql);
            ResultSet re=preparedStatement.executeQuery();
            //获得结果集结构信息,元数据
            ResultSetMetaData md = re.getMetaData();
            //获得列数
            int columnCount = md.getColumnCount();
            while (re.next()){
                net.sf.json.JSONObject cell=new net.sf.json.JSONObject();
                for (int i = 1; i <= columnCount; i++) {
                    cell.put(md.getColumnName(i),re.getString(i));
                }
                array.add(cell);
            }
        }catch (ClassNotFoundException e) {
            return "ClassNotFoundException";
        } catch (SQLException e) {
            return e.getMessage();
        }
        return array.toString();
    }

    public static void closeConnection() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}