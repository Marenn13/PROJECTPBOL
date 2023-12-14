package Praktikum4;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CobaAbsolutePositioning extends JFrame {
    private static final int FRAME_WIDTH  =300;
    private static final int FRAME_HEIGHT  =200;
    private static final int FRAME_X_ORIGIN   =100;
    private static final int FRAME_Y_ORIGIN  =200;
     private static final int BUTTON_WIDHT  =80;
    private static final int BUTTON_HEIGHT =30;
    private JButton cancelButton;
    private JButton okButton;
    
    public static void main(String[] args) {
        CobaAbsolutePositioning frame = new CobaAbsolutePositioning();
        frame.setVisible(true);
    }
    public CobaAbsolutePositioning(){
        Container contentPane = getContentPane();
        setSize (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (false);
        setTitle ("Program  CobaAbsolutePositioning");
        setLocation (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        contentPane.setLayout(null);
        contentPane.setBackground(Color.white);
        
        okButton  = new JButton ("Ok");
        okButton.setBounds (70,125,BUTTON_WIDHT,BUTTON_HEIGHT);
        contentPane.add(okButton);
        cancelButton = new JButton ("cancel");
        cancelButton.setBounds (160, 125,BUTTON_WIDHT,BUTTON_HEIGHT);
        contentPane.add(cancelButton);
        
        setDefaultCloseOperation (EXIT_ON_CLOSE);
    }
    
    
}
