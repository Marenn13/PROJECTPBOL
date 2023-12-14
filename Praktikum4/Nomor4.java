
package Praktikum4;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Nomor4 extends JFrame {

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 500;
    private static final int FRAME_X_ORIGIN = 200;
    private static final int FRAME_Y_ORIGIN = 100;
    private static final int BUTTON_WIDHT = 150;
    private static final int BUTTON_HEIGHT = 30;
    private JButton cancelButton;
    private JButton okButton;

    public static void main(String[] args) {
        Nomor4 frame = new Nomor4();
        frame.setVisible(true);
    }

    public Nomor4() {
        Container contentPane = getContentPane();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        contentPane.setLayout(null);
        contentPane.setBackground(Color.cyan);
        
        // membuat judul ditengah
          JLabel judul = new JLabel (" Input Data ");
          judul.setFont (new Font ("Arial", Font.BOLD, 18));// Ganti jenis font dan ukuran sesuai keinginan
          judul.setBounds(0,10, FRAME_WIDTH, BUTTON_HEIGHT);
          judul.setHorizontalAlignment(JLabel.CENTER); //Teks berada di tengah
       
        JLabel nama = new JLabel("Nama :");
        nama.setBounds(20, 30, BUTTON_WIDHT, BUTTON_HEIGHT);
        JTextField text = new JTextField();
        text.setBounds(160, 40, 400,BUTTON_HEIGHT);

        JLabel jk = new JLabel("Jenis Kelamin :");
        jk.setBounds(20, 100,2* BUTTON_WIDHT , BUTTON_HEIGHT);
        JRadioButton L = new JRadioButton("Laki -laki");
        L.setBounds(150, 100, BUTTON_WIDHT , BUTTON_HEIGHT);
        JRadioButton p = new JRadioButton("Perempuan");
        p.setBounds(320, 100, BUTTON_WIDHT , BUTTON_HEIGHT);
        
        jk.setOpaque(false);
        L.setOpaque(false);
        p.setOpaque(false);

        ButtonGroup gender = new ButtonGroup();
        gender.add(L);
        gender.add(p);

        JLabel hobi = new JLabel("Hobi :");
        hobi.setBounds(20, 150, BUTTON_WIDHT, BUTTON_HEIGHT);
        JCheckBox olahraga = new JCheckBox("Olahraga");
        olahraga.setBounds(160, 150, BUTTON_WIDHT, BUTTON_HEIGHT);
        JCheckBox shoping = new JCheckBox("Shopping");
        shoping.setBounds(160, 200, BUTTON_WIDHT , BUTTON_HEIGHT);
        JCheckBox game = new JCheckBox("computer games");
        game.setBounds(160, 250, BUTTON_WIDHT , BUTTON_HEIGHT);
        JCheckBox nonton = new JCheckBox("Nonton Bioskop");
        nonton.setBounds(160, 300, BUTTON_WIDHT , BUTTON_HEIGHT);
        
        hobi.setOpaque(false);
        olahraga.setOpaque(false);
        shoping.setOpaque(false);
        game.setOpaque(false);
        nonton.setOpaque(false);

        okButton = new JButton("Ok");
        okButton.setBounds(150,400, BUTTON_WIDHT, BUTTON_HEIGHT);
        
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(350, 400, BUTTON_WIDHT, BUTTON_HEIGHT);
       
        contentPane.add(judul);
        contentPane.add(nama);
        contentPane.add(text);
        contentPane.add(jk);
        contentPane.add(L);
        contentPane.add(p);
        contentPane.add(hobi);
        contentPane.add(olahraga);
        contentPane.add(shoping);
        contentPane.add(game);
        contentPane.add(nonton);
        contentPane.add(okButton);
        contentPane.add(cancelButton);

        
        setDefaultCloseOperation (EXIT_ON_CLOSE);

    }
    

}

    

