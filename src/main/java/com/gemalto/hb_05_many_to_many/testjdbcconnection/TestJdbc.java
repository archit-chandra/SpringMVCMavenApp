package com.gemalto.hb_05_many_to_many.testjdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/hb-03-one-to-many?useSSL=false";
        String user = "hbstudent";
        String pass = "hbstudent";

        try {
            System.out.println("Connecting to testjdbcconnection URL: " + jdbcUrl);
            Connection connection = DriverManager.getConnection(jdbcUrl, user, pass);
            System.out.println("Connection successful.!!!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}