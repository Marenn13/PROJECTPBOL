package Praktikum4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Ch14JListSample extends JFrame {
    
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 350;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN =250;
    private JList list;
    
    public static void main(String[] args) {
        Ch14JListSample frame = new Ch14JListSample();
        frame.setVisible (true);
    }
        
     public Ch14JListSample (){
         Container contentPane;
         JPanel listPanel, okPanel;
        
        JButton okButton;
        
        String [] names = {"Ape", "Bat","Bee","Cat","Dog","Eel","Fox", 
                            "Gnu","Hen","Man","Sow","Yak"};
        
        setSize (FRAME_WIDTH, FRAME_HEIGHT);
        setTitle ("Program Ch14JListSample");
        setLocation (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        contentPane = getContentPane ();
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new BorderLayout ());
        
        listPanel = new JPanel (new GridLayout ());
        listPanel.setBorder(BorderFactory.createTitledBorder("Three-Lettern Animal"));
        
        list = new JList(names);
       listPanel.add(new JScrollPane(list));
        
        okPanel = new JPanel (new FlowLayout());
        okButton = new JButton ("Ok");
        okPanel.add(okButton);
        
        contentPane.add(listPanel,BorderLayout.CENTER);
        contentPane.add(okPanel, BorderLayout.SOUTH);
        
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        
    }
    
}
