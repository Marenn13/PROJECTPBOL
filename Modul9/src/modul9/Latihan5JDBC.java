package modul9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Latihan5JDBC {
   public static void main(String[] args) {
        System.out.println("=====================");

        System.out.println("Mencoba membuat koneksi ke database....");
        Latihan5JDBC p = new Latihan5JDBC();
        Connection conn = p.getConnection();
       try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Menu:");
        System.out.println("1. Lihat Isi Tabel");
        System.out.println("2. Input Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Update Data");
        System.out.println("5. Keluar");

        int input = 0;
        while (input != 5) {
            System.out.println("Pilih Menu?");
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();

            switch (input) {
                case 1:
                    p.showData();
                    break;
                case 2:
                    p.inputData();
                    break;
                case 3:
                    p.hapusData();
                    break;
                case 4:
                    p.updateData();
                    break;
                default:
                    break;
            }
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
            conn = DriverManager.getConnection("jdbc:oracle:thin:@" + host + 
                    ":" + port + ":" + db, usr, pwd);
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

    public void showData() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        conn = this.getConnection();
        try {

            st = conn.createStatement();
            rs = st.executeQuery("select * from mahasiswa");

            System.out.println("Nim\t\tNama\t\tIPk");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getString(2)
                        + " \t" + rs.getString(3));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void inputData() {
        Connection conn = null;
        PreparedStatement ps = null;

        conn = this.getConnection();

        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT DATA");
        System.out.print("Masukkan NIM  :");
        String nim = sc.next();
        System.out.print("Masukkan NAMA :");
        String nama = sc.next();
        System.out.print("Masukkan IPK  :");
        double ipk = sc.nextDouble();

        try {
            ps = conn.prepareStatement("insert into mahasiswa values(?, ?, ?)");
            ps.setString(1, nim);
            ps.setString(2, nama);
            ps.setDouble(3, ipk);
            ps.executeUpdate();

            conn.commit();
            System.out.println("Data sudah ditambahkan!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());;
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
//    

    public void hapusData() {
        Connection conn = null;
        PreparedStatement ps = null;

        conn = this.getConnection();

        Scanner sc = new Scanner(System.in);
        System.out.println("Delete Data");
        System.out.print("Masukkan NIM yang akan dihapus :");
        String nim = sc.next();

        try {
            ps = conn.prepareStatement("delete from mahasiswa where nim =?");
            ps.setString(1, nim);
            ps.executeUpdate();
            conn.commit();
            System.out.println("Data sudah dihapus!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void updateData() {
        Connection conn = null;
        PreparedStatement ps = null;

        conn = this.getConnection();

        Scanner sc = new Scanner(System.in);
        System.out.println("UPDATE DATA");
        System.out.print("Masukkan NIM yang akan di UPDATE:");
        String nim = sc.next();
        System.out.print("Masukkan koreksi NAMA            :");
        String nama = sc.next();
        System.out.print("Masukkan koreksi IPK             :");
        double ipk = sc.nextDouble();

        try {
            ps = conn.prepareStatement("update mahasiswa set nama= ?, "
                    + "ipk = ? where nim =?");
            ps.setString(1, nama);
            ps.setDouble(2, ipk);
            ps.setString(3, nim);
            ps.executeUpdate();
            conn.commit();
            System.out.println("Data sudah diperbaiki!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conn.close();

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
