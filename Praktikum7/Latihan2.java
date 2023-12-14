
package Praktikum7;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan Jarak Perjalanan Anda (Km) :");
         int jarak=sc.nextInt();
         System.out.print("masukkan banyaknya bensin yang dihabiskan (liter) :");
         int liter =sc.nextInt();
        
        int konsumsi = 0;
        
        try {
            konsumsi = jarak/liter;
        }
        catch (Exception e){
            konsumsi =0;
        }
        System.out.println("Konsumsi BBM anda adalah = "+konsumsi+ "km/liter");
    }
    
}
