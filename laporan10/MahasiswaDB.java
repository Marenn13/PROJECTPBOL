package laporan10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MahasiswaDB {

    Koneksi m = new Koneksi();
    Mahasiswa mhs = new Mahasiswa();

    public void inputData(Mahasiswa mhs) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {

            conn = m.getConnection();
            String nim = mhs.getNim();
            String nama = mhs.getNama();
            double ipk = mhs.getIpk();

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

    public void hapusData(Mahasiswa mhs) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {

            conn = m.getConnection();
            String nim = mhs.getNim();

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

    public void updateData(Mahasiswa mhs) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = m.getConnection();
            String nim = mhs.getNim();
            String nama = mhs.getNama();
            double ipk = mhs.getIpk();

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
