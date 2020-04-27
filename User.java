package appLayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User {

    public boolean isValidCredential(String userNameServlet, String passwordServlet) {

        DbConnection databaseObject = new DbConnection();
        Connection conn = databaseObject.connectionMethod();
        Statement stmt = null;
        ResultSet resultSet = null;
        String userName = null;
        String password = null;
        String sql;
        boolean boll=false;
        // conn=databaseObject.conn;
        try {
            stmt = conn.createStatement();

        sql = "select username,password from login where username='" + userNameServlet + "' and password='" + passwordServlet + "'";

            resultSet = stmt.executeQuery(sql);
            boll=resultSet.next();

            //userName = resultSet.getString("username");
            //password=resultSet.getString("password");
        } catch (SQLException e) {
            System.out.println("Hi error is here2" + e.getMessage());
        }

        System.out.println("This is the bollean value"+boll);
       // boolean boll = true;
        if (boll) {
            return true;
        } else {
            return false;
        }

    }
    }
