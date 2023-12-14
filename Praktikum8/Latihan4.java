
package Praktikum8;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Latihan4 extends JFrame implements ActionListener {
    private JLabel lab1, lab2, lab3;
    private JTextField t1, t2;
    private JComboBox box;
    private JButton button;

    public Latihan4() {
        Container cp = getContentPane();
        cp.setBackground(Color.lightGray);
        setSize(300, 170);
        setTitle("Pendaftaran Seminar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        lab1 = new JLabel("No Induk");
        lab1.setBounds(10, 10, 100, 20);
        cp.add(lab1);
        t1 = new JTextField();
        t1.setBounds(100, 10, 100, 20);
        t1.setSize(150, 20);
        cp.add(t1);

        lab2 = new JLabel("Nama");
        lab2.setBounds(10, 40, 100, 20);
        cp.add(lab2);
        t2 = new JTextField();
        t2.setBounds(100, 40, 100, 20);
        t2.setSize(150, 20);
        cp.add(t2);

        lab3 = new JLabel("Status");
        lab3.setBounds(10, 70, 100, 20);
        cp.add(lab3);

        box = new JComboBox(new Object[]{
            "Mahasiswa", "Dosen"});
        box.setBounds(100, 70, 100, 20);
        box.setSize(150, 20);
        cp.add(box);

        button = new JButton("Simpan");
        button.setBounds(100, 100, 100, 20);
        cp.add(button);
        setVisible(true);
        button.addActionListener(this);
    }

    public static void main(String[] args) {
        new Latihan4();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            try {
                String nim = t1.getText();
                int angkatan = Integer.parseInt(nim.substring(0, 4));
                String nama = t2.getText();

                if (nim.length() != 9 || !nim.matches("^[0-9]*$")) {
                    throw new IllegalArgumentException("NIM harus terdiri dari 9 digit angka");
                } else if (angkatan > 2013 && !box.getSelectedItem().equals("Dosen")) {
                    throw new IllegalArgumentException("Hanya mahasiswa angkatan "
                            + "2013 dan sebelumnya yang boleh mendaftar.");
                } else if (!nama.matches("^[a-zA-Z]*$")) {
                    throw new IllegalArgumentException("Nama harus berupa huruf.");

                }
                JOptionPane.showMessageDialog(this, "Terima kasih, Anda sudah mendaftar seminar.");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan " + ex.getMessage());
            }
        }
    }
}

    
 