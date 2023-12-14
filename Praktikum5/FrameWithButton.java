package Praktikum5;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameWithButton extends JFrame {

    private JButton button;
   
    public FrameWithButton() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        setSize(300, 400);
        setResizable(false);
        setTitle("Frame with Button");
        
        button = new JButton("Click Me");
        contentPane.add(button);
        ButtonHandler handler = new ButtonHandler();
        button.addActionListener(handler);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }   
 public static void main(String[] args) {
        FrameWithButton frame = new FrameWithButton();
        frame.setVisible(true);
 }
}







        