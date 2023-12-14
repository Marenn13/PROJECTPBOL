
package Praktikum11;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
public class Latihan3b {

    public static void main(String[] args) {
        // TODO code application logic here
        JFileChooser chooser =new JFileChooser();
       int pilih =  chooser.showSaveDialog(null);
       
       if (pilih == JFileChooser.APPROVE_OPTION){
            FileInputStream inStream = null; 
            
            File inFile =chooser.getSelectedFile();
            
            try {
                inStream = new FileInputStream(inFile);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
             int fileSize = (int) inFile.length();
        byte[] byteArray = new byte[fileSize];
        try {
            inStream.read(byteArray);
            for (int i = 0; i < fileSize; i++) {
                System.out.print((char) byteArray[i]);
            }
            inStream.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            
        }
        } else{
           System.out.println("Pemilihan dibatalkan");
       }
        System.out.println();
    }
    
}
