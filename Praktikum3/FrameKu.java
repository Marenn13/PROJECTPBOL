
package Praktikum3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameKu extends JFrame {
    public FrameKu (){
        this.setSize (300,500);
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ini Class Turunan Dari JFrame");
        this.setVisible(true);  
        
//          no 3     
        JPanel panel = new JPanel ();
        JButton tombol = new JButton ();
        tombol.setText ("Ini Tombol");
        panel.add (tombol); 
        this.add(panel);
      
          }
    public static void main(String[] args) {
        new FrameKu();
    }
    
    
}

        
//        // Latihan 3
//        JPanel panel = new JPanel ();
//        JButton tombol = new JButton ();
//        tombol.setText ("Ini Tombol");
//        panel.add (tombol); 
//        this.add(panel);
//      
   