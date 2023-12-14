package Praktikum11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lat6 {

    public static void main(String[] args) {
        String key = "TFTFTFTFTTTFFFT"; // Untuk menyimpan kunci jawaban

        try (BufferedReader reader = new BufferedReader(new FileReader("jawaban.txt"))) {
            // Membaca kunci jawaban dari baris pertama
            key = reader.readLine();

            String line;
            while ((line = reader.readLine()) != null) {
                // Memproses data setiap murid
                String name = line; // Baca nama siswa
                String answer = reader.readLine(); // Baca jawaban siswa

                int correctAnswers = countCorrectAnswers(key, answer);

                // Menampilkan hasil
                System.out.println(name + " : " + correctAnswers);

                // Menyimpan hasil ke dalam file
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("hasil.txt", true))) {
                    writer.write(name + " : " + correctAnswers + "\n");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Fungsi untuk menghitung jumlah jawaban yang benar
    private static int countCorrectAnswers(String key, String answer) {
        int count = 0;

        // Memeriksa setiap karakter jawaban dan membandingkannya dengan kunci jawaban
        for (int i = 0; i < key.length() && i < answer.length(); i++) {
            if (key.charAt(i) == answer.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
