package Praktikum7;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Latihan5 extends JFrame implements ActionListener { 
    private JTextField textField1; // Deklarasikan sebagai variabel instance
    private JTextField textField2;
    private JTextField hasilField;
    private JButton addButton;

    public Latihan5() {
        setTitle("Luas Tanah");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel label1 = new JLabel("Panjang (m) :");
        textField1 = new JTextField(); // Inisialisasi variabel instance
        JLabel label2 = new JLabel("Lebar (m) :");
        textField2 = new JTextField();

        JLabel label3 = new JLabel("Luas:");
        hasilField = new JTextField();
        hasilField.setEditable(false);

        addButton = new JButton("Hitung");
        addButton.addActionListener(this);

        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(label3);
        panel.add(hasilField);
        panel.add(addButton);

        getContentPane().add(panel);
        setVisible(true);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      double panjang = 0, lebar =0, luas=0;
      
      try{
          panjang = Double.parseDouble(textField1.getText());
          lebar =Double.parseDouble(textField2.getText());
          luas =panjang*lebar;
          hasilField.setText(String.valueOf(luas));
      }
        catch ( NumberFormatException x){
            JOptionPane.showMessageDialog(null, "Maaf, hanya Integer yang diperbolehkan!");           
        }       
    }
    public static void main(String[] args) {
        Latihan5 frame = new Latihan5();
        frame.setVisible(true);
    }
    
}
