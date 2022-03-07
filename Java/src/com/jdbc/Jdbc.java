package com.jdbc;
import java.sql.*;
public class Jdbc {

// JDBC - Java Database Connectivity


        public static void main(String[] args) throws ClassNotFoundException, SQLException {

            System.out.println("Start");

            String className = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/sys";
            String sql = "SELECT * FROM dep_table";
            String user = "root";
            String password = "root";

            Class.forName(className);
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2));
            }

            System.out.println("End");
        }
    }
