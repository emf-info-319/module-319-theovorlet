package exercices.exercice09;

import java.util.Random;

public class tableauDeValeursAleatoire {
    public static void main(String[] args) {

        final int nbrMax = 6;
         int [] tableauAleatoire = new int[10] ;  

        Random chiffrePasPlusGrand6 = new Random();
        int leChiffre = chiffrePasPlusGrand6.nextInt(nbrMax);
        System.out.println(leChiffre);

        tableauAleatoire[0] = leChiffre ;
        

    }
    
}




 
        

