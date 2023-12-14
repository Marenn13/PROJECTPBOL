
package Praktikum5;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRootPane;

public class ButtonHandler  implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent event) {
       JButton clickedButton = (JButton) event.getSource();
       
       JRootPane rootPane = clickedButton.getRootPane();
       Frame frame = (JFrame)rootPane.getParent();
       
       String buttonText = clickedButton.getText();
       frame.setTitle("Tombol" +buttonText + "ditekan");
    }

    
}
