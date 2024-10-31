import java.util.Scanner;

public class IntroMethodes {
    public static void main(String[] args) {

        debut();
        int valeurDonnerUn = demandeNombre();
        int valeurDonnerDeux = demandeNombre();
        int valeurDonnerTrois = demandeNombre();
        int resultat = somme(valeurDonnerUn, valeurDonnerDeux, valeurDonnerTrois);
        System.out.println("La somme est : " + resultat);
        fin();
    }

    public static void debut() {
        System.out.println("Bonjour et bienvenu sur ce premier programme.");
        System.out.println("On va voir les méthodes dans ce cours.");
    }

    public static void fin() {
        System.out.println("Programme terminé");
    }

    public static int demandeNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre ");
        int valeur1 = scanner.nextInt();
        System.out.println("Merci, j'enregistre " + valeur1);
        return valeur1;
    }

    public static int somme(int chiffre1, int chiffre2, int chiffre3) {
        int resultat = chiffre1 + chiffre2 + chiffre3;
        return resultat;
    }

}
