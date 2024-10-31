package exercices.exercice10;

public class ExcercisMethodesTableaux {
    public static void main(String[] args) {
        int[] tableau4 = new int[3];
        int[] tableau5 = new int[4];
        int[] tableau1 = creerTableau(2);
        int[] tableau2 = remplitTableau(tableau4, 23);
        int[] tableau3 = valeurDuTableauAleatoir(tableau5, 100, 1);

        for (int i = 0; i < tableau1.length; i++) {
            System.out.println(tableau1[i]);
        }
        for (int j = 0; j < tableau2.length; j++) {
            System.out.println(tableau2[j]);
        }
        for (int k = 0; k < tableau3.length; k++) {
            System.err.println(tableau3[k]);
        }

    }

    public static int[] creerTableau(int tailleDuTableau) {
        int[] monTableau = new int[tailleDuTableau];
        return monTableau;
    }

    public static int[] remplitTableau(int[] tableauARenplir, int valeurADonner) {
        for (int i = 0; i < tableauARenplir.length; i++) {
            tableauARenplir[i] = valeurADonner;
        }
        return tableauARenplir;
    }

    public static int[] valeurDuTableauAleatoir(int[] tableauARenplirAletoirement, int max, int min) {
        for (int j = 0; j < tableauARenplirAletoirement.length; j++) {
            tableauARenplirAletoirement[j] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return tableauARenplirAletoirement;
    }
    public static int determinerLaTailleDUnTableau(int[]tableauADeterminerLaTaille){

    }
}
