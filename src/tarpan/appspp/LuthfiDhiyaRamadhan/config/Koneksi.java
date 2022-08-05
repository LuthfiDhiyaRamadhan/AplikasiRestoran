/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarpan.appspp.LuthfiDhiyaRamadhan.config;
import java.sql.*;
/**
 *
 * @author TARPAN
 */
public class Koneksi {
    private Connection con;
    public Connection konek(){
        try{
            String url = "jdbc:mysql://localhost/dbspp";
            String username = "root"; 
            String password ="";
        con = DriverManager.getConnection(url,username,password);
          //  System.out.println("Berhasil");
        }catch (Exception e){
  
        }
        return con;
    }
   // public static void main(String[] args) {
   // Koneksi kon = new Koneksi();
    //kon.konek();
}
//}