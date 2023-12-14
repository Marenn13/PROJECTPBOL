package Praktikum5;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Latihan5 extends JFrame implements ActionListener {

    private JTextField textField1; // Deklarasikan sebagai variabel instance
    private JTextField textField2;
    private JTextField hasilField;
    private JButton addButton;

    public Latihan5() {
        setTitle("Input  Data");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
//        panel.setLayout(new FlowLayout());

        panel.setLayout(new GridLayout(4, 2));

        JLabel label1 = new JLabel("Bilangan 1 :");
        textField1 = new JTextField(); // Inisialisasi variabel instance
        JLabel label2 = new JLabel("Bilangan 2 :");
        textField2 = new JTextField();

        JLabel label3 = new JLabel("Hasil:");
        hasilField = new JTextField();
        hasilField.setEditable(false);

        addButton = new JButton("Jumlah");
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            double b1 = Double.parseDouble(textField1.getText());
            double b2 = Double.parseDouble(textField2.getText());
            double hasil = b1 + b2;
            hasilField.setText(String.valueOf(hasil));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Latihan5();
            }
        });
    }
}
