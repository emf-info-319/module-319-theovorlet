package exercices.exercice11;

public class inverseLeTaleau {
    public static int MIN = 1;
    public static int MAX = 100;

    public static void main(String[] args) {
        int[] tableauInitial = new int[4];
        System.out.println("Contenu du tableau initial :");
        for (int l = 0; l < tableauInitial.length; l++) {
            tableauInitial[l] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.println("Tableau initial [" + l + "] = " + tableauInitial[l]);
        }
        int[] tableauFinal = inversionDuTableau(tableauInitial);
        System.out.println("Contenu du tableau final :");
        for (int m = 0; m < tableauFinal.length; m++) {
            System.out.println("Tableau final [" + m + "] = " + tableauFinal[m]);
        }
    }

    public static int[] inversionDuTableau(int[] tableauAInverser) {
        int[] tableaufinal = new int[tableauAInverser.length];
        int j = tableauAInverser.length - 1;
        for (int i = 0; i < tableaufinal.length; i++) {
            tableaufinal[i] = tableauAInverser[j];
            j--;
        }
        return tableaufinal;
    }

}
