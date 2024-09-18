package projetPersonnel;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.swing.JLabel;

public class projetPerso{
    public static void main(String[] args) {

        JFrame frame = new JFrame("Windows");
        frame.setSize(800, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea textArea = new JTextArea("teste sur fenêtre");
        textArea.setLocale(100,200);
        textArea.setBounds(200, 500, 100, 100);
        frame.add(textArea);
        frame.setVisible(true); 
        
        

      

    }
}



