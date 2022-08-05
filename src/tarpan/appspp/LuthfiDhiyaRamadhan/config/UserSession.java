/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarpan.appspp.LuthfiDhiyaRamadhan.config;

/**
 *
 * @author TARPAN
 */
public class UserSession {
    private static String id;
    private static String username;
    private static String nama_petugas;
    private static String level;
    private static String nisn;
    private static String nama;

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        UserSession.id = id;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        UserSession.username = username;
    }

    public static String getNama_petugas() {
        return nama_petugas;
    }

    public static void setNama_petugas(String nama_petugas) {
        UserSession.nama_petugas = nama_petugas;
    }

    public static String getLevel() {
        return level;
    }

    public static void setLevel(String level) {
        UserSession.level = level;
    }

    public static String getNisn() {
        return nisn;
    }

    public static void setNisn(String nisn) {
        UserSession.nisn = nisn;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        UserSession.nama = nama;
    }

    public static void setname(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
