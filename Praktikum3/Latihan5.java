package Praktikum3;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Latihan5 extends JFrame {
    public Latihan5(){
        this.setSize (300, 500);
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        this.setTitle ("Find");
        
        JPanel panel = new JPanel ();
        JLabel label = new JLabel ("Keyword :");
        JTextField text = new JTextField();
        text.setColumns (10);
        JButton tombol = new JButton ("Find");
     
         panel.add (label);
         panel. add (text);
         panel.add(tombol);
         this.add (panel);
         this.setVisible(true);   
    }
    public static void main(String[] args) {
        new Latihan5();
    }
    
}
