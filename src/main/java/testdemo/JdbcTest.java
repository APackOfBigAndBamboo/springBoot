package testdemo;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @Derscription TODO
 * @author David
 * @date 2018/7/25 11:04
 * @version 1.o
 */


public class JdbcTest {
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
     static final String DBDRIVER = "com.mysql.jdbc.Driver";
     static final String DBURL = "jdbc:mysql://192.168.29.13:3306/oms?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
     static final String DBUSER = "oms";
     static final String PASSWORD = "oms";
     static Connection connection = null;
     static PreparedStatement preparedStatement = null;
    public static String getConnection() {
        try {
            Class.forName(DBDRIVER);
            DriverManager.setLoginTimeout(2);
            connection = DriverManager.getConnection(DBURL, DBUSER, PASSWORD);
            return "success";
        } catch (ClassNotFoundException e) {
            return "ClassNotFoundException";
        } catch (SQLException e) {
            return  e.toString();
        }
    }
    public static String getCount(String projectnum) {

        net.sf.json.JSONArray array=new net.sf.json.JSONArray();
        try {
            Class.forName(DBDRIVER);
            DriverManager.setLoginTimeout(2);
            connection = DriverManager.getConnection(DBURL, DBUSER, PASSWORD);
            preparedStatement = connection.prepareStatement("select  b.NAME  ,a.WORKDATE  ,convert((sum(c.COSTTIME)/8),decimal(15,2)) as ts from project_workloadinfo a left join fw_t_ems_user b on a.USERID=b.USER_ID left join  project_workitem c on a.WORKLOADID=c.WORKLOADID  where (a.WORKDATE  between '2018-09-17' and '2018-09-22') and  a.ISWORKTIME ='0' and c.WORKTYPE='0' and a.PROJECTID in (select PROJECTID from project_inplement where PROJECTNUM ='"+projectnum+"')  group by b.name");
            ResultSet re=preparedStatement.executeQuery();
            ResultSetMetaData md = re.getMetaData();
            int columnCount = md.getColumnCount();
            while (re.next()){
                Map<String,Object> rowData = new HashMap<String,Object>(20);
                net.sf.json.JSONObject cell=new net.sf.json.JSONObject();
                for (int i = 1; i <= columnCount; i++) {
                    cell.put(md.getColumnName(i),re.getString(i));
                }
                array.add(cell);
            }
        }catch (ClassNotFoundException e) {
            return "ClassNotFoundException";
        } catch (SQLException e) {
            return "SQLException";
        }
        return array.toString();
    }


}