package EUnVorlet;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class E1Vorlet {
    public static final int DES_MIN = 1;
    public static final int DES_MAX = 6;
    public static final int NOMBRE_TUILES = 12;
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] tuiles = new int[NOMBRE_TUILES];
        boolean enJeu = true;
        System.out.println("**********************************");
        System.out.println("*         'Shut The Box'         *");
        System.out.println("**********************************");
        for (int i = 0; i < tuiles.length; i++) {
            tuiles[i] = (i+1);
        }
        while (enJeu) {
            afficheTuiles(tuiles);
            int totalDes = tireLesDes();
            System.out.println("Donnez le(s) nombre(s) à enlever :");
            tuiles = enleveTuiles(tuiles, totalDes);
            boolean encore = contientEncoreDesTuilesABaisser(tuiles);
            if (!encore) {
                System.out.println(" Jeu terminé ");
                SCANNER.close();
                enJeu = false;
            }
        }
    }

    public static void afficheTuiles(int[] tableauAAfficher) {
        System.out.print("|");
        for (int j = 0; j < tableauAAfficher.length; j++) {
            if (tableauAAfficher[j] == 0) {
                System.out.print("__|");
                continue;
            }
            tableauAAfficher[j] = j;
            if (tableauAAfficher[j]==tableauAAfficher.length-1) {
               System.out.println(tableauAAfficher.length+"|");
            } else if (tableauAAfficher[j] < 10) {
                System.out.print("0" + (tableauAAfficher[j]+1)+"|");
            }   
            else{
                System.out.print((tableauAAfficher[j]+1) + "|");
            }

        }
    }

    public static int tireLesDes() {
        int nombreTireUn = (int) (Math.random() * (DES_MAX - DES_MIN + 1)) + DES_MIN;
        int nombreTireDeux = (int) (Math.random() * (DES_MAX - DES_MIN + 1)) + DES_MIN;
        int total = nombreTireUn + nombreTireDeux;
        System.out.println("\nLes nombres tirés sont : " + nombreTireUn + " et " + nombreTireDeux
                + " qui font un total de " + total);
        return total;
    }

    public static int[] enleveTuiles(int[] tuiles, int totalDes) {
        int[] tuilesTemp = copieTableau(tuiles);
        int totalEnleve = 0;
        boolean demandeEncore = true;

        do {
            int valeur = SCANNER.nextInt();
            totalEnleve += valeur;
            if (valeur == 0) {
                System.out.println("Abandon...");
                for (int l = 0; l < tuilesTemp.length; l++) {
                    tuilesTemp[l] = 0;
                }
                tuiles = copieTableau(tuilesTemp);
                demandeEncore = false;
            } else if (valeur < 1 || valeur > tuilesTemp.length) {
                System.out.println("Hors limites !");
                totalEnleve = 0;
            } else if (tuilesTemp[valeur - 1] == 0) {
                System.out.println("Vous avez déjà baissé la tuile à la position " + valeur);
                totalEnleve -= valeur;
            } else {
                if (totalEnleve < totalDes) {
                    tuilesTemp[valeur - 1] = 0;
                    System.out.println(" Ce n'est pas suffisant, merci d'enlever encore");
                } else if (totalEnleve > totalDes) {
                    System.out.println("Le total est dépassez, choisissez d'autres nombres ");
                    tuilesTemp = copieTableau(tuiles);
                    totalEnleve = 0;
                    afficheTuiles(tuiles);
                } else {
                    tuilesTemp[valeur - 1] = 0;
                    System.out.println("Parfait !");
                    tuiles = copieTableau(tuilesTemp);
                    demandeEncore = false;
                }
            }
        } while (demandeEncore);
        return tuiles;
    }

    public static int[] copieTableau(int[] tableauACopier) {
        int[] copie = new int[tableauACopier.length];
        for (int k = 0; k < tableauACopier.length; k++) {
            copie[k] = tableauACopier[k];
        }
        return copie;
    }

    public static boolean contientEncoreDesTuilesABaisser(int[] tableauAVerifier) {
        boolean contientUnChiffre = false;
        //va traverser le tableau et si une valeur est différente de 0 va revoyé vrai 
        for (int o = 0; o < tableauAVerifier.length; o++) {
            if (tableauAVerifier[o] != 0) {
                contientUnChiffre = true;
                break;
            }

        }
        return contientUnChiffre;
    }
}
