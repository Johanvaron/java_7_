package com.example.formulario_johan_varon.connectonTest;

import java.sql.*;

public class UseBasicConnectionSingleton {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = BasicConnectionSingleton.getInstance();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM db_boards.users_tbl")) {
            while (rs.next()) {

                System.out.print(rs.getString("user_firstname"));
                System.out.print(" | ");

                System.out.println(rs.getString("user_lastname"));
            }
        } // end try
    }
}
