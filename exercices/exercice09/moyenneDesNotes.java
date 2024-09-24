package exercices.exercice09;
import java.util.Random;
import java.util.random.RandomGenerator;

 public class moyenneDesNotes {

    public final static int NOMBREMAX = 6;
    public final static int NOMBREMIN = 1;
    public static void main(String[] args) {

        int [] tableau = new int [10];
        int numeroDuTableau=0;
        int numeroDeCellule=0;
     
        while (numeroDuTableau!=10) {
            int valeursRdm = ( int ) ( Math.random() * ( NOMBREMAX - NOMBREMIN + 1 ) ) + NOMBREMIN;
            tableau [numeroDuTableau] = valeursRdm;
        

            System.out.println("Cellule " + numeroDeCellule + ": " + tableau[numeroDuTableau]);
            numeroDeCellule++;
            numeroDuTableau++;

        }
        numeroDuTableau=0;
        int resultatCalcul;
        int valeurUne;
        int valeurDeux;

        valeurUne = tableau[numeroDuTableau];
        numeroDuTableau++;
        while (numeroDuTableau!=10) {
            valeurDeux=tableau[numeroDuTableau];
            numeroDuTableau++;
            valeurUne = valeurUne + valeurDeux;
             
        }
        resultatCalcul = valeurUne/numeroDuTableau;
        System.out.println("la moyenne de la classe est de " + resultatCalcul);
    }
    
}




 
        

