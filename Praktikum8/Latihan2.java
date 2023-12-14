package Praktikum8;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        int s =0, v=0, t=0;
        
       
        try{
           Latihan2 lat = new Latihan2();
           s=lat.getJarak ();
           v=lat.getKecepatan();
           t=lat.getHitungwaktu(s,v);
        }catch (InputMismatchException e){
            System.out.println("Maaf terjadi kesalahan input"); 
        }catch (ArithmeticException e){
            System.out.println("Maaf terjadi kesalahan proses perhitungan");
        }finally{
            System.out.println("waktu yang anda butuhkan adalah: "+t+ " jam");
           
        }System.out.println("Terima Kasih.....");
    }
        public int getJarak ()throws InputMismatchException {
            Scanner sc = new Scanner (System.in);
            System.out.print("Masukkan jalan perjalanan Anda (km) :");
            int jarak = sc.nextInt();
            return jarak;
        }
        public int getKecepatan () throws InputMismatchException  {
            Scanner sc = new Scanner (System.in);
            System.out.print("Masukkan kecepatan kendaraan anda (km/jam :");
            int kecepatan = sc.nextInt();
            return kecepatan ;
        }
        public int getHitungwaktu(int jarak, int kecepatan)throws ArithmeticException {
            int waktu =0;
            waktu = jarak /kecepatan;
            return waktu;
        }
    }
    

