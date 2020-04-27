package appLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public Connection connectionMethod() {
        Connection conn=null;
        String URL="jdbc:oracle:thin:@localhost:1521:orcl";
        String user="ANONYMOUS";
        String pass="mkuila123";
        try {
            conn = DriverManager.getConnection(URL, user, pass);
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return conn;
    }
//below code is test purpose
  /* public static void main(String[] args) throws Exception {
        DbConnection databaseObject = new DbConnection();
        System.out.println(databaseObject.connectionMethod());
        Connection conn=databaseObject.connectionMethod();
        String userNameServlet="Manas";
        String passwordServlet="1234";
       String sql = "select username,password from login where username='"+userNameServlet+"' and password='"+passwordServlet+"'";
       Statement stmt = conn.createStatement();
       ResultSet resultSet = stmt.executeQuery(sql);

       resultSet.next();
       System.out.println(resultSet.getString("password"));

    }*/
}
