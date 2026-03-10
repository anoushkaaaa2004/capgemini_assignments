package com.assignment.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

    private static final String URL = "jdbc:postgresql://localhost:5432/assigndb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "prachi@123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

   
    public static void createTable() {

    	String query = "CREATE TABLE IF NOT EXISTS student (id SERIAL PRIMARY KEY, name VARCHAR(20), email VARCHAR(30), marks INT)";


        try (Connection con = getConnection();
             Statement stmt = con.createStatement()) {

            stmt.executeUpdate(query);
            System.out.println("Student table created successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}