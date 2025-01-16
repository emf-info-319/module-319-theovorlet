import java.util.Scanner;

public class Vorlet {
    public static final int TAILLE_PLATEAU = 20;
    public static final char CASE_VIDE = ' ';
    public static final char CASE_REJOUER = 'R';
    public static final char CASE_RECULER = 'B';
    public static final char CASE_AVANCER = 'A';
    public static final char CASE_DEPART = 'D';
    public static final char CASE_FIN = 'F';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] plateau = initialiserPlateau();
        int positionJoueur = 0;
        boolean jeuTermine = false;
        int nombreDeLance = 0;
        System.out.println("Bienvenue au jeu de l'oie !");
        afficherPlateau(plateau, positionJoueur);
        while (!jeuTermine) {
            System.out.println("Appuyez sur Entrée pour lancer le dé...");
            scanner.nextLine();
            int de = lancerDe();
            nombreDeLance++;
            System.out.println("Vous avez obtenu : " + de);
            positionJoueur = deplacerJoueur(positionJoueur, de, plateau);
            positionJoueur = appliqueEffetCase(positionJoueur, plateau);
            afficherPlateau(plateau, positionJoueur);
            if (positionJoueur >= plateau.length - 1) {
                System.out.println("Félicitations, vous avez atteint la case finale et gagné le jeu en " + nombreDeLance
                        + " coups !");
                jeuTermine = true;
            }
        }
    }

    public static char[] initialiserPlateau() {
        char[] plateau = new char[TAILLE_PLATEAU];
        plateau[0] = CASE_DEPART;
        plateau[TAILLE_PLATEAU - 1] = CASE_FIN;

        for (int i = 1; i < plateau.length - 1; i++) {
            int nombre = (int) (Math.random() * (4 - 1 + 1)) + 1;
            switch (nombre) {
                case 1:
                    plateau[i] = CASE_VIDE;
                    break;
                case 2:
                    plateau[i] = CASE_REJOUER;
                    break;
                case 3:
                    plateau[i] = CASE_RECULER;
                    break;
                case 4:
                    plateau[i] = CASE_AVANCER;
                    break;
                default:
                    break;
            }
        }
        return plateau;
    }

    public static void afficherPlateau(char[] plateau, int positionJoueur) {
        System.out.print("|");
        for (int i = 0; i < plateau.length; i++) {
            if (i == positionJoueur) {
                System.out.print("P");
            } else {
                System.out.print(plateau[i]);
            }
            System.out.print("|");
        }
        System.out.println(" ");
    }

    public static int lancerDe() {
        int lancerDuDe = (int) (Math.random() * (6 - 1 + 1)) + 1;
        return lancerDuDe;
    }

    public static int deplacerJoueur(int positionActuelle, int nombreDe, char[] plateau) {
        int nouvellePosition = positionActuelle + nombreDe;
        if (nouvellePosition >= plateau.length) {
            nouvellePosition = plateau.length - 1;
        }
        return nouvellePosition;
    }

    public static int appliqueEffetCase(int positionJoueur, char[] plateau) {
        switch (plateau[positionJoueur]) {
            case 'R':
                System.out.println("Case rejouer : Vous relancez le dé immédiatement !");
                positionJoueur = deplacerJoueur(positionJoueur, lancerDe(), plateau);
                if (positionJoueur > plateau.length - 1) {
                    positionJoueur = plateau.length - 1;
                }
                System.out.println("Vous avancez à la position " + positionJoueur);

                break;
            case 'B':
                if (positionJoueur > 2) {
                    positionJoueur -= 3;
                } else if (positionJoueur == 2) {
                    positionJoueur -= 2;
                } else if (positionJoueur == 1) {
                    positionJoueur -= 1;
                }
                System.out.println("Case reculer : Vous reculez de 3 cases. Nouvelle position : " + positionJoueur);
                break;
            case 'A':
                if (positionJoueur == plateau.length - 1) {
                    positionJoueur += 1;
                } else {
                    positionJoueur += 2;
                }
                if (positionJoueur > plateau.length - 1) {
                    positionJoueur = plateau.length - 1;
                }
                System.out.println("Case avancer : Vous avancez de 2 cases. Nouvelle position : " + positionJoueur);
                break;
            case ' ':
                System.out.println("Case normale");
                if (positionJoueur > plateau.length - 1) {
                    positionJoueur = plateau.length - 1;
                }
                break;
            default:
                break;

        }
        return positionJoueur;
    }
}
