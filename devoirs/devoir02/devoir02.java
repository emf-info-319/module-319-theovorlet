package devoirs.devoir02;

public class devoir02 {

    public final static int RESERVOIRE_RESERVOIRE_A = 3;
    public final static int RESERVOIRE_RESERVOIRE_B = 5;

    public static void main(String[] args) {

        int reservoireA = 0;
        int reservoireB = 0;
        int remplissage;
        remplissage = (int) (Math.random() * (RESERVOIRE_RESERVOIRE_B + RESERVOIRE_RESERVOIRE_A - 0 + 1)) + 0;
        System.out.println("il y a " + remplissage + " litre à remplir. ");

        boolean reservoireAVide = true;
        Boolean reservoireAPlein = true;
        if (remplissage == 0) {
            reservoireAPlein = false;
        }

        while (reservoireAPlein == true) {
            System.out.println("Remplissage du réservoir A...");
            remplissage = remplissage - 1;
            reservoireA = reservoireA + 1;

            if (reservoireA == RESERVOIRE_RESERVOIRE_A) {
                reservoireAVide = false;
            }
            System.out.println("Le reservoir A : " + reservoireA + " le réservoir B : " + reservoireB);

            if (remplissage == 0) {
                reservoireAPlein = false;
            }

            if (reservoireAVide == false & remplissage != 0) {
                do {

                    System.out.println("Remplissage du réservoir B...");
                    remplissage = remplissage - 1;
                    reservoireB = reservoireB + 1;
                    System.out.println("Le reservoir A : " + reservoireA + " le réservoir B : " + reservoireB);
                    if (remplissage == 0) {
                        reservoireAPlein = false;
                    }
                } while (reservoireAPlein == true);

            }

        }
    }

}
