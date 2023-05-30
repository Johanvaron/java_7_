package com.example.formulario_johan_varon.connectonTest;

import java.sql.*;
public class BasicConnectionSingleton {

    private static String url = "jdbc:mysql://localhost:3306/db_boards?serverTimezone=America/Bogota";
    private static String user = "root";
    private static String pass = "admin";
    private static Connection conn;
    public static Connection getInstance()
            throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(url, user, pass);
        }
        return conn;
    }
} // BasicConnectionSingleton

