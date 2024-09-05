package devoirs.devoir02;

import java.util.Random;
import java.util.random.RandomGenerator;

public class devoir02 {
    public static void main(String[] args) {
        
       final int Capacite_Resevoir_A = 3;
       final int Capacite_Resevoir_B = 5;
       Random random = new Random();

       
        int reservoirA;
        int reservoirB;
       
       
        int remplissage = random.nextInt(Capacite_Resevoir_B + Capacite_Resevoir_A) + 0;

        System.out.println(remplissage);



    }
    
}
