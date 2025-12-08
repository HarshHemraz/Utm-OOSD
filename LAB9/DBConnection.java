/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB9;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SPACE4
 */


public class DBConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/stockdb?useSSL=false&allowPublicKeyRetrieval=true";
        String user = "root";  
        String password = "harsh";   

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("SUCCESS: Connected to MySQL database!");
            } else {
                System.out.println("FAILED: Could not connect.");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Connection error:");
            e.printStackTrace();
        }
    }
}
