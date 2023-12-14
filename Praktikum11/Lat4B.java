package Praktikum11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class Lat4B {

    public static void main(String[] args) throws IOException {
        FileOutputStream outStream = null;
        Scanner scanner = new Scanner(System.in);

        // Membuat objek JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("C:\\Users\\L E N O V O\\OneDrive\\Dokumen\\NetBeansProjects\\PBOL\\src");

        // Menampilkan dialog untuk memilih file
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // Mendapatkan file yang dipilih oleh pengguna
            File fileToSave = fileChooser.getSelectedFile();

            try {
                outStream = new FileOutputStream(fileToSave);

                // Minta pengguna untuk memasukkan pesan
                System.out.print("Masukkan pesan : ");
                String info = scanner.nextLine();

                // Menulis pesan ke dalam file
                outStream.write(info.getBytes());
                outStream.close();
                System.out.println("File berhasil disimpan di: " + fileToSave.getAbsolutePath());
            } catch (FileNotFoundException ex) {
                System.out.println("File tidak ditemukan: " + ex.getMessage());
            } catch (IOException ex) {
                System.out.println("Terjadi kesalahan saat menulis file: " + ex.getMessage());
            }
        } else {
            System.out.println("Pembatalan memilih lokasi penyimpanan file.");
        }
    }

}
