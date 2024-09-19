package projetPersonnel;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.swing.JLabel;

public class projetPerso{
    public static void main(String[] args) {

        JFrame frame = new JFrame("Windows");
        //créer la fenêtre + le nom
        frame.setSize(800, 700);
        //la taille de la fenêtre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //le moyen de la fermer
        JTextArea textArea = new JTextArea("teste sur fenêtre");
        //du texte
        frame.add(textArea);
        //ajoute la zone de texte
        frame.setVisible(true); 
        //rend la fenêtre  visible
        
        
        

      

    }
}



