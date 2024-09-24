package exercices.exercice09;
import java.util.Random;
import java.util.random.RandomGenerator;

 public class tableauDeValeursAleatoire {

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
    }
    
}




 
        

