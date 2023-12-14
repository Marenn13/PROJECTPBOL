
package Praktikum5;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameWithButton4 extends JFrame implements ActionListener {
     private JButton button;
      private JButton button2;
      private JTextField text;
      
      public FrameWithButton4 (){
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        setSize(300, 100);
        setResizable(false);
        setTitle("Frame with Button");
        button = new JButton("Click Me");
        contentPane.add(button);
        button2 = new JButton("Thank You"); 
        contentPane.add(button2);
        
        text = new JTextField();
        text.setColumns(20);
        contentPane.add(text);
        
        ButtonHandler handler = new ButtonHandler();
        button.addActionListener(this);
        button2.addActionListener(this);
        
      }
    @Override
    public void actionPerformed(ActionEvent event) {
        String isiPesan = text.getText();
        
        JButton clickedButton = (JButton)event.getSource();
        String buttonText = clickedButton.getText();
        
        if (buttonText.equals("Click Me")){
            this.setTitle(isiPesan);
        }
    }  
    public static void main(String[] args) {
        FrameWithButton4 frame = new FrameWithButton4();
        frame.setVisible(true);
    }
}
