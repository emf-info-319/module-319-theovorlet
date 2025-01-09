public class EDeuxLesFlechettes {
    public static final int NOMBRE_DE_JOUEURS = 3;
    public static final int NOMBRE_DE_FLECHETTES = 3;
    public static final int POINTS_TOTAUX = 301;
    public static final int MIN = 0;
    public static final int[] POINTS_POSSIBLES = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
            18, 19, 20, 25 };

    public static void main(String[] args) {
        int[] joueurs = new int[NOMBRE_DE_JOUEURS];
        boolean partieTerminee = false;
        while (!partieTerminee) {
            for (int i = 0; i < joueurs.length; i++) {
                System.out.println("C'est au tour du joueur " + (i + 1));
                int resultat = joue(joueurs[i]);
                joueurs[i] = resultat;
                if (resultat == POINTS_TOTAUX) {
                    System.out.println("Le joueur " + (i + 1) + " a gagné ! Partie terminée !");
                    partieTerminee = true;
                    break;
                }
            }
        }
    }

    public static int lanceFlechette() {
        int maxPoints = POINTS_POSSIBLES.length - 1;
        int indexFlechette = (int) (Math.random() * (maxPoints - MIN + 1)) + MIN;
        int pointsFlechette = POINTS_POSSIBLES[indexFlechette];
        System.out.println("La fléchette est tombée dans la zone qui donne " + pointsFlechette + " points");
        return pointsFlechette;
    }

    public static int joue(int pointsActuels) {
        int resultat = 0;
        int pointsDuTour = 0;
        int pointsFlechette = 0;
        for (int i = 0; i < NOMBRE_DE_FLECHETTES; i++) {
            pointsFlechette = lanceFlechette();
            pointsDuTour += pointsFlechette;
            System.out.println("Le joueur a fait : " + pointsFlechette + " points");
            resultat = pointsActuels + pointsDuTour;
            if (resultat > POINTS_TOTAUX) {
                System.out.println("Le Total de " + POINTS_TOTAUX
                        + " est dépassé. il retourne à ses points précédents (" + pointsActuels + ")");
                resultat = pointsActuels;
                break;
            } else if (resultat == POINTS_TOTAUX) {
                System.out.println("Il a atteint le nombre de points requis.");
                break;
            } else {
                System.out.println("Il a actuellement " + resultat + " points");
            }
        }
        return resultat;

    }
}
