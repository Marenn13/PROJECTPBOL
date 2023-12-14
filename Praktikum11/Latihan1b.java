
package Praktikum11;

import java.io.File;

public class Latihan1b {
    public static void main(String[] args) {
        File file = new File 
        ("C:/Users/L E N O V O/OneDrive/Dokumen/NetBeansProjects/sample.txt");
        String absolut =file.getAbsolutePath();
        String name=file.getName();
        if (!file.exists()) {
            System.out.println("Maaf file tidak ditemukan");
        }else{
            System.out.println("File  ditemukan");
        }
      file.getName();
        System.out.println("Nama File :"+name);
        file.getPath();
        System.out.println("Full Path :"+absolut);
    }
    }
   

