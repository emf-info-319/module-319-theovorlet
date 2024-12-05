package projetPersonnel;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Scanner;

public class projetPerso {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Windows");
        // créer la fenêtre + le nom
        frame.setSize(800, 700);
        // la taille de la fenêtre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // le moyen de la fermer
        JTextArea textArea = new JTextArea("teste sur fenêtre");
        // du texte
        frame.setLayout(null); // utilise un layout null pour positionner les composants manuellement
        // obtient la taille de l'écran
        Dimension tailleEcran = Toolkit.getDefaultToolkit().getScreenSize();
        // calculer les coordonnées pour centrer la fenêtre
        int x = (tailleEcran.width - frame.getSize().width) / 2;
        int y = (tailleEcran.height - frame.getSize().height) / 2;

        frame.setLocation(x, y);
        
        // définir la position et la taille du JTextArea
        textArea.setLocation(300, 300); // Position en pixels depuis le coin supérieur gauche de la fenêtre
        textArea.setSize(100, 20); // Définir la taille du JTextArea  
        
       
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Entrez une valeur svp : " );
        int valeur = scanner.nextInt();
        scanner.nextLine(); 
        
        frame.add(textArea);
        // ajoute la zone de texte
        frame.setVisible(true);
        // rend la fenêtre visible
        scanner.close();

    }
}
