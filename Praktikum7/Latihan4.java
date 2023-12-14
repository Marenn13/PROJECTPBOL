package Praktikum7;

import java.util.Scanner;

public class Latihan4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1 = 0, bil2 = 0;
        boolean corect = true;
        int jumlah = 0;

        do {
            try {
                System.out.print("Masukan bilangan 1 :");
                bil1 = sc.nextInt();
                corect = false;

            } catch (Exception e) {
                System.out.println("terjadi kesalahan input, Mohon diulangi! ");
                sc.next();

            }
        } while (corect);
        corect = true;
        do {
            try {
                System.out.print("Masukan bilangan 2 :");
                bil2 = sc.nextInt();
                corect = false;

            } catch (Exception e) {
                System.out.println("terjadi kesalahan input, Mohon diulangi! ");

                sc.next();
            }
        } while (corect);
        jumlah = bil1 + bil2;
        System.out.print("Hasil kedua bilangan Penjumlahan itu : " + jumlah + "");
        System.out.println();
    }

}
