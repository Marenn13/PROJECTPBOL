package modul9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Programjdbc1 {
     public static void main(String[] args) {
        System.out.println("PROGRAM LATIHAN JDBC");
        System.out.println("=====================");

        System.out.println("Mencoba membuat koneksi ke database....");
        Programjdbc1 p = new Programjdbc1();
        Connection conn = p.getConnection();

        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection() {
        String host = "172.23.9.181";
        String port = "1521";
        String db = "orcl";
        String usr = "MHS225314182";
        String pwd = "MHS225314182";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Maaf, driver class tidak ditemukan");
            System.out.println(ex.getMessage());
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@" + 
                    host + ":" + port + ":" + db, usr, pwd);
        } catch (SQLException ex) {
            System.out.println("Maaf, koneksi tidak berhasil.");

            System.out.println(ex.getMessage());
        }

        if (conn != null) {
            System.out.println("Koneksi ke database berhasil terbentuk");
        } else {
            System.out.println("Maaf, koneksi ke dalam database gagal    terbentuk");
        }
        return conn;
    }

   
}