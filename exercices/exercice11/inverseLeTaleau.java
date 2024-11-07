package exercices.exercice11;

public class inverseLeTaleau {
    public static int MIN =1;
    public static int MAX =100;
    public static void main(String[] args) {
        int[] tableauInitial = new int[4];
        System.out.println("Contenu du tableau initial :");
        for (int l = 0; l < tableauInitial.length; l++) {
          tableauInitial[l]= ( int ) ( Math.random() * ( MAX - MIN + 1 ) ) + MIN; 
          System.out.println("Tableau initial ["+l+"] = "+tableauInitial[l]); 
        }
        int[] tableauFinal = inversionDuTableau(tableauInitial);
        System.out.println("Contenu du tableau final :");
        for (int m = 0; m < tableauFinal.length; m++) {
            System.out.println("Tableau final ["+m+"] = "+tableauFinal[m]);
        }
    }

    public static int[] inversionDuTableau(int[] tableauAInverser) {
        int[] tableauDeTransition = new int[tableauAInverser.length];
        for (int i = 0; i < tableauDeTransition.length; i++) {
            tableauDeTransition[i] = tableauAInverser[i];
        }
        for (int j = tableauDeTransition.length - 1; j <= 0; j--) {
            int k = 0;
            tableauAInverser[k] = tableauDeTransition[j];
            j++;
        }
        return tableauAInverser;
    }

}
