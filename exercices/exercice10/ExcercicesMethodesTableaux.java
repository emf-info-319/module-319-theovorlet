package exercices.exercice10;

public class ExcercicesMethodesTableaux {
    public static int MAX = 10;
    public static int MIN = 1;

    public static void main(String[] args) {
        int[] monTableau = creationTableaux(5);
        int[] monTableauRemplieFixe = remplissageFixeDuTableau(monTableau, 2);
        int[] monTableauRemplieAleatoir = remplissageAleatoirDuTableau(monTableau);
        int maTailleDuTableauTrouver = DeterminationDeLaTailleTableau(monTableau);
        afficherContenuTableau(monTableau);
        int valeurMinDuTableau = valeurMinTableau(monTableauRemplieAleatoir);
        int valeurMaxDuTableau = valeurMaxTableau(monTableauRemplieAleatoir);
        int nombreDAppartionDUneValeur = nbrDApparitionDUneValeur(monTableauRemplieAleatoir, 2);
    }

    public static int[] creationTableaux(int tailleDuTableau) {
        int[] tableau = new int[tailleDuTableau];
        return tableau;
    }

    public static int[] remplissageFixeDuTableau(int[] tableauARemplir, int valeurVoulu) {
        for (int i = 0; i < tableauARemplir.length; i++) {
            tableauARemplir[i] = valeurVoulu;
        }
        return tableauARemplir;
    }

    public static int[] remplissageAleatoirDuTableau(int[] tableauARemplirAleatoir) {
        for (int j = 0; j < tableauARemplirAleatoir.length; j++) {
            tableauARemplirAleatoir[j] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        }
        return tableauARemplirAleatoir;
    }

    public static int DeterminationDeLaTailleTableau(int[] tableauTailleADefinir) {
        int tailleTableauTrouver = tableauTailleADefinir.length;
        return tailleTableauTrouver;
    }

    public static void afficherContenuTableau(int[] tableauAAfficher) {
        for (int k = 0; k < tableauAAfficher.length; k++) {
            System.out.println(tableauAAfficher[k]);
        }
    }

    public static int valeurMinTableau(int[] minTableau) {
        int minimumTrouver = 100000000;
        for (int l = 1; l < minTableau.length; l++) {
            if (minTableau[l] < minimumTrouver) {
                minimumTrouver = minTableau[l];
            }
        }
        return minimumTrouver;
    }

    public static int valeurMaxTableau(int[] maxTableau) {
        int maximumTrouver = 0;
        for (int m = 1; m < maxTableau.length; m++) {
            if (maxTableau[m] > maximumTrouver) {
                maximumTrouver = maxTableau[m];
            }
        }
        return maximumTrouver;
    }

    public static int nbrDApparitionDUneValeur(int[] tableauAInspecter, int valeurATrouver) {
        int nbrDeFois = 0;
        for (int n= 0; n < tableauAInspecter.length; n++) {
            if (tableauAInspecter[n] == valeurATrouver) {
                nbrDeFois++;
            }
        }
        return nbrDeFois;
    }

}
