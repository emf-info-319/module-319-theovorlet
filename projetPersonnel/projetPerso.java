package projetPersonnel;
import javax.swing.JFrame;
import javax.swing.JTextArea;
 
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
        frame.setLayout(null); //renommer "frame" car ce n'est pas "Windows"
        //découpe la fenêtre en plusieurs parti
        int x = (tailleEcran.width - frame.getSize().width) / 2;
        int y = (tailleEcran.height - frame.getSize().height) / 2;

        textArea.setLocation(x,y);
        textArea.setSize(100, 10); // Définir la taille du JTextArea       

        frame.add(textArea);
        //ajoute la zone de texte
        frame.setVisible(true);
        //rend la fenêtre  visible
       
 
    }
}
 
 



