package devoirs.devoir06;

public class Devoir06 {
    public static int TAILLE_TABLEAU = 20;
    public static int VALEUR_MIN = 0;
    public static int VALEUR_MAX = 50;
    public static int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args) {
        int[] monTableau = genereTableau(TAILLE_TABLEAU, VALEUR_MAX, VALEUR_MIN);
        for (int i = 0; i < monTableau.length; i++) {
            System.out.println("Tableau [" + i + "] = " + monTableau[i]);
        }
        int min = rechercheMin(monTableau);
        int max = rechercheMax(monTableau);

        System.out.println("la plus petite valeur trouvée est : " + min);
        System.out.println("la plus grande valeur trouver est : " + max);
        System.out.println("le nombre [" + VALEUR_RECHERCHEE + "] figure à la position["
                + rechercheValeur(monTableau, VALEUR_RECHERCHEE) + "] du tableau");
    }

    public static int[] genereTableau(int tailleDuTableau, int max, int min) {
        int[] tableauCreer = new int[tailleDuTableau];
        for (int j = 0; j < tableauCreer.length; j++) {
            tableauCreer[j] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return tableauCreer;

    }

    public static int rechercheMin(int[] tableauPourMIn) {
        int minimumTrouver = tableauPourMIn[0];
        for (int l = 1; l < tableauPourMIn.length; l++) {
            if (tableauPourMIn[l] < minimumTrouver) {
                minimumTrouver = tableauPourMIn[l];
            }
        }
        return minimumTrouver;

    }

    public static int rechercheMax(int[] tableauPourMax) {
        int maximumTrouver = tableauPourMax[0];
        for (int m = 1; m < tableauPourMax.length; m++) {
            if (tableauPourMax[m] > maximumTrouver) {
                maximumTrouver = tableauPourMax[m];
            }
        }
        return maximumTrouver;
    }

    public static int rechercheValeur(int[] tableauAFouiller, int valeurChercher) {
        int position = -1;
        for (int i = 0; i < tableauAFouiller.length; i++) {
            if (tableauAFouiller[i] == valeurChercher) {
                position = i;
                break;
            }
        }
        return position;

    }

}
