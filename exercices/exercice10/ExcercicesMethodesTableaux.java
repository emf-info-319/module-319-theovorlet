package exercices.exercice10;

public class ExcercicesMethodesTableaux {
    public static int MAX = 10;
    public static int MIN = 1;
    public static int TAILLEDUTABLEAU = 5;
    public static int VALEURVOULU = 2;
    public static int VALEURATROUVER = 2;
    public static int VALEURACHERCHER = 5;
    public static int VALEURQUIREMPLACE = 4;
    public static int VALEURATROUVERPREMIEREMPLACEMENT = 3;
    public static int VALEURATROUVERDERNIEREMPLACEMENT = 2;

    public static void main(String[] args) {

        int[] monTableau = creationTableaux(TAILLEDUTABLEAU);
        int[] monTableauRemplieFixe = remplissageFixeDuTableau(monTableau, VALEURVOULU);
        int[] monTableauRemplieAleatoir = remplissageAleatoirDuTableau(monTableau);
        int maTailleDuTableauTrouver = DeterminationDeLaTailleTableau(monTableau);
        afficherContenuTableau(monTableau);
        int valeurMinDuTableau = valeurMinTableau(monTableauRemplieAleatoir);
        int valeurMaxDuTableau = valeurMaxTableau(monTableauRemplieAleatoir);
        int nombreDAppartionDUneValeur = nbrDApparitionDUneValeur(monTableauRemplieAleatoir, VALEURATROUVER);
       
        int[] remplacementDeValeur = remplacementValeurTableau(monTableau, VALEURACHERCHER, VALEURQUIREMPLACE);
        System.out.println("Après remplacement de la valeur " + VALEURACHERCHER + " par la valeur " + VALEURQUIREMPLACE + " voici le contenu du tableau : ");
        afficherContenuTableau(monTableau);
        int sommeValeurDuTableau = sommeValeurTableau(monTableau);
        double moyenneTableau = moyenneValeurTableau(monTableau);
        int emplacementValeurDansTableau = premierEmplacementValeur(monTableau, VALEURATROUVERPREMIEREMPLACEMENT);
        int dernierEmplacementDuneValeur = dernierEmplacementValeur(monTableau, VALEURATROUVERDERNIEREMPLACEMENT);
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
        System.out.println("le tableau a une taille de " + tailleTableauTrouver);
        return tailleTableauTrouver;
    }

    public static void afficherContenuTableau(int[] tableauAAfficher) {
        System.out.println("Contenu du tableau aléatoir : ");
        for (int k = 0; k < tableauAAfficher.length; k++) {
            System.out.println("tab[" + k + "]" + tableauAAfficher[k]);
        }
    }

    public static int valeurMinTableau(int[] minTableau) {
        int minimumTrouver = 100000000;
        for (int l = 1; l < minTableau.length; l++) {
            if (minTableau[l] < minimumTrouver) {
                minimumTrouver = minTableau[l];
            }
        }
        System.out.println("la valeur min trouvée = " + minimumTrouver);
        return minimumTrouver;
    }

    public static int valeurMaxTableau(int[] maxTableau) {
        int maximumTrouver = 0;
        for (int m = 1; m < maxTableau.length; m++) {
            if (maxTableau[m] > maximumTrouver) {
                maximumTrouver = maxTableau[m];
            }
        }
        System.out.println("la valeur max trouvée = " + maximumTrouver);
        return maximumTrouver;
    }

    public static int nbrDApparitionDUneValeur(int[] tableauAInspecter, int valeurATrouver) {
        int nbrDeFois = 0;
        for (int n = 0; n < tableauAInspecter.length; n++) {
            if (tableauAInspecter[n] == valeurATrouver) {
                nbrDeFois++;
            }
        }
        return nbrDeFois;
    }

    public static int sommeValeurTableau(int[] tableauAAditionner) {
        int somme = 0;
        for (int o = 0; o < tableauAAditionner.length; o++) {
            somme += tableauAAditionner[o];
        }
        System.out.println("La somme des cellules du tableau = "+somme);
        return somme;
    }

    public static double moyenneValeurTableau(int[] tableauAFaireMoyen) {
        double moyenne = 0;
        for (int p = 0; p < tableauAFaireMoyen.length; p++) {
            moyenne += tableauAFaireMoyen[p];
        }
        moyenne /= tableauAFaireMoyen.length;
        System.out.println("La moyenne des cellules du tableau = "+moyenne);
        return moyenne;
    }

    public static int[] remplacementValeurTableau(int[] tableauAModifier, int valeurAChercher, int valeurQuiRemplace) {
        for (int q = 0; q < tableauAModifier.length; q++) {
            if (tableauAModifier[q] == valeurAChercher) {
                tableauAModifier[q] = valeurQuiRemplace;
            }
        }

        return tableauAModifier;
    }

    public static int premierEmplacementValeur(int[] tableauEmplacementValeur, int valeurEmplacement) {
        for (int r = 0; r < tableauEmplacementValeur.length; r++) {
            if (tableauEmplacementValeur[r] == valeurEmplacement) {
                System.out.println("La valeur  " + valeurEmplacement +  " a été trouvée à la 1ère position N" +r);
                return r;
            }

        }
        System.out.println("La valeur  " + valeurEmplacement +  " a été trouvée à la 1ère position N-1");
        return -1;
    }

    public static int dernierEmplacementValeur(int[] tableauDerniereValeur, int derniereValeur) {
        for (int s = tableauDerniereValeur.length - 1; s >= 0; s--) {
            if (tableauDerniereValeur[s] == derniereValeur) {
                System.out.println("La valeur  " + derniereValeur +  " a été trouvée à la dernière position N"+ s);
                return s;
            }
        }
        System.out.println("La valeur  " + derniereValeur +  " a été trouvée à la dernière position N-1");
        return -1;

    }

}
