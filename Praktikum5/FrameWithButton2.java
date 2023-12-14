package Praktikum5;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameWithButton2 extends JFrame implements ActionListener {
     private JButton button;
         
     public FrameWithButton2(){
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        setSize(300, 100);
        setResizable(false);
        setTitle("Frame with Button");
        button = new JButton("Click Me");
        contentPane.add(button);
         ButtonHandler handler = new ButtonHandler();
        button.addActionListener(this);       

        setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
    @Override
    public void actionPerformed(ActionEvent event) {
         JButton clickedButton = (JButton) event.getSource();
          String buttonText = clickedButton.getText();
          this.setTitle("Tombol" +buttonText + "ditekan");
    }
    public static void main(String[] args) {
         FrameWithButton2 frame = new FrameWithButton2();
        frame.setVisible(true);
    }
    
    
}
