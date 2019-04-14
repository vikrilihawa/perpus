/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.sql.*;
import javax.swing.*;
public class Koneksi {
    private static Connection conn;
    public static Connection koneksiDB() throws SQLException{
        if(conn == null){
            try {
                String database ="jdbc:mysql://localhost:3306/perpustakaan1";
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn = (Connection) DriverManager.getConnection(database,username,password);
                System.out.println("Koneksi Berhasil");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return conn;
    }
            
}
