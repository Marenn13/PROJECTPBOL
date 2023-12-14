package Praktikum3;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameKirimPesan extends JFrame {
    public FrameKirimPesan (){
        this.setSize (300, 100);
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        this.setTitle ("Kirim Pesan");
        
        JPanel panel = new JPanel ();
        JLabel label = new JLabel ("Masukkan Pesan :");
        JTextField text = new JTextField();
        text.setColumns (10);
        
         panel.add (label);
         panel. add (text);
         
         JCheckBox box  = new JCheckBox();
         JLabel lbl = new JLabel ( "Encript");
         panel.add(box);
         panel.add (lbl);
         this.add (panel);
         this.setVisible(true);   
     }
    public static void main(String[] args) {
        new FrameKirimPesan ();
    }
    
}
