package devoirs.devoir05;

import java.util.Scanner;

public class devoir05 {
    public final static int NOMBRE_MAX = 100;
    public final static int NOMBRE_MIN = 0;

    public static void main(String[] args) {
        int nombreADeviner = (int) (Math.random() * (NOMBRE_MAX - NOMBRE_MIN + 1)) + NOMBRE_MIN;
        Scanner demandeChiffre = new Scanner(System.in);
        boolean chiffreTrouver = false;
        while (chiffreTrouver == false) {
            System.out.println("Entrez une valeur svp : ");
            int valeurDonner = demandeChiffre.nextInt();
            demandeChiffre.nextLine();
            if (valeurDonner == nombreADeviner) {
                System.out.println("Bravo vous avez trouver");
                chiffreTrouver = true;
            } else if (valeurDonner < nombreADeviner) {
                System.out.println("Trop petit");
            } else if (valeurDonner > nombreADeviner) {
                System.out.println("Trop grand");
            }

        }
        demandeChiffre.close();
    }
}
