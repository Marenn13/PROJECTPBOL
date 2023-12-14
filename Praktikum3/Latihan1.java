package Praktikum3;

import javax.swing.JFrame;

public class Latihan1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Ini frame Pertamaku");
//        // 1a
//     int tinggi = 400;
//     int lebar = 400;
  //1b
       int tinggi = 200;
       int lebar = 300;
        
       frame.setBounds (0,0,lebar,tinggi);
//        // 1c
//        frame.setBounds (100,100,lebar,tinggi);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
