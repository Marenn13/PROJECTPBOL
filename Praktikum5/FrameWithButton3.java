package Praktikum5;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FrameWithButton3 extends JFrame implements ActionListener {
     private JButton button;
      private JButton button2;
      
      public FrameWithButton3(){
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        setSize(300, 100);
        setResizable(false);
        setTitle("Frame with Button");
        button = new JButton("Click Me");
        contentPane.add(button);
        button2 = new JButton("Thank You"); 
        contentPane.add(button2);
        ButtonHandler handler = new ButtonHandler();
        button2.addActionListener(this);
       
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    } 

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();
          String buttonText = clickedButton.getText();
          this.setTitle("Tombol" +buttonText + "ditekan");
    }
     public static void main(String[] args) {
        FrameWithButton3 frame = new FrameWithButton3();
        frame.setVisible(true);
    }
    }
      

   