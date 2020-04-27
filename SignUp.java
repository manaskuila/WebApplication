package appLayer;

import java.sql.*;

public class SignUp {
    public boolean signUpRegister(String servletUserName, String servletPassword,String servletEmail,long servletMobile) {

        System.out.println("the user name: " + servletUserName + "Password: " + servletPassword);

        DbConnection databaseObject = new DbConnection();
        Connection conn = databaseObject.connectionMethod();
        Statement stmt = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        String userName = null;
        String password = null;
        String sql;
        boolean boll = false;
        int count=0;
        sql = "INSERT INTO login(userName,password,email,mobile) VALUES(?,?,?,?)";
        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, servletUserName);
            preparedStatement.setString(2, servletPassword);
            preparedStatement.setString(3,servletEmail);
            preparedStatement.setLong(4,servletMobile);
            boll = preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(boll);
        if (boll) {
            return false;
        } else {
            return true;
        }
    }
}
