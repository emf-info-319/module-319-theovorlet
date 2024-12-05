import java.util.Scanner;

public class binaire {

    public static final int nombreDeDigit = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombreDecimal;
        double nombrePossibilite = Math.pow(2, nombreDeDigit);
        do {
            System.out.println("Entrez un nombre décimal plus petit que " + nombrePossibilite);
            nombreDecimal = scanner.nextInt();
            if (nombreDecimal >= nombrePossibilite) {
                System.out.println("J'ai dit plus petit que " + nombrePossibilite + " chacal");
            }
            scanner.nextLine();

        } while (nombreDecimal >= nombrePossibilite);
        int[] nombreBinaire = changementDecimalBinaire(nombreDecimal);
        System.out.println("voici le chiffre en binaire :");
        for (int i = 0; i < nombreBinaire.length; i++) {
            System.out.print(nombreBinaire[i]);
        }

        scanner.close();
    }

    public static int[] changementDecimalBinaire(int nombreEnDecimal) {
        int[] nombreEnBianire = new int[nombreDeDigit];
        int[] nbrPuissance = new int[nombreEnBianire.length];
        for (int j = 0; j < nbrPuissance.length; j++) {
            nbrPuissance[j] = nombreEnBianire.length - j;
        }
        for (int i = 0; i < nombreEnBianire.length; i++) {
            if (nombreEnDecimal - Math.pow(2, nbrPuissance[i]) >= 0) {
                nombreEnBianire[i - 1] = 1;
                nombreEnDecimal -= Math.pow(2, nbrPuissance[i]);
            } else {
                continue;
            }
            if (nombreEnDecimal % 2 == 1) {
                nombreEnBianire[nombreEnBianire.length - 1] = 1;
            }
        }
        return nombreEnBianire;
    }

    public static String[] changementDecimalHexa(int[] nombreAPasseEnHexa) {
        String[] nombreEnHexa = new String[nombreAPasseEnHexa.length / 4];
        char[] lettreEnHexa = new char[]{'A','B','C','D','E','F'};
        for (int i = 0; i <nombreEnHexa.length; i++) {
            
        }


        return nombreEnHexa;
    }

}
