/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Context;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Longvh
 */
public class DbContext {
    private Connection connection = null;

    public Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                String url
                        = System.getProperty("JDBC_URL", "jdbc:mysql://localhost:3306/swp?useSSL=false");
                String username = System.getProperty("JDBC_USERNAME", "root");
                String password = System.getProperty("JDBC_PASSWORD", "Phuonganh");
                connection = DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    
    public static void main(String[] args) {
        Connection con;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swp","root", "Phuonganh");
            System.out.println("Successa");
        } catch (Exception e) {
            System.out.println("Fail");
        }
    }
    
}
