/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jasa;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author USER
 */
public class dbCRUD {
    String jdbcUrl = "jdbc:mysql://localhost:3306/2210010468_pbo2";
    String username = "root";
    String password = "";

    public dbCRUD() {
        try (Connection Koneksi = DriverManager.getConnection(jdbcUrl, username, password)) {
            Driver mysqlDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(mysqlDriver);

            System.out.println("Berhasil!");
        } catch (SQLException error) {
            System.err.println(error.toString());
        }
    }
    
}
