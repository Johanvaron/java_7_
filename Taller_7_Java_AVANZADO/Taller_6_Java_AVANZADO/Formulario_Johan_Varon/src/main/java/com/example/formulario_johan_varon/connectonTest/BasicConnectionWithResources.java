package com.example.formulario_johan_varon.connectonTest;

import java.sql.*;

public class BasicConnectionWithResources {
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/db_boards?serverTimezone=America/Bogota";
        String username = "root";
        String password = "admin";
        String sql = "SELECT * FROM db_boards.users_tbl";
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getString("user_firstname"));
                System.out.println(rs.getString("user_lastname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } // end try-catch
    } //

}
