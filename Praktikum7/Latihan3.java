package Praktikum7;

import javax.swing.JOptionPane;

public class Latihan3 {

    public static void main(String[] args) {
        String inputStr = JOptionPane.showInputDialog(null, "Masukkan umur anda !");
        int age = 0;

        try {
            age = Integer.parseInt(inputStr);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "" + inputStr +  " is Invalid"
                    + " Please enter digit only");

        }
        System.out.println("Umur anda : " + age + "tahun");
    }

}
