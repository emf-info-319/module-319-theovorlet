package exerciceSuplémentaire.lesTableaux;

import java.nio.channels.Pipe.SourceChannel;

public class deuxTableauSerencontre {
    public static void main(String[] args) {

        int []tableauValeur1= new int [8];
        int[] tableauValeur2= new int [8];
        int[] tableauResultat= new int [8];
        int i = 0;
        int j = 0;
        int k = 0;

        
        System.out.print("tableau 1: ");
        while (i<8) {
            tableauValeur1 [i] = (int) (Math.random() * (10 - 0 + 1)) + 0;
            if (i==7) {
                if (tableauValeur1[i] >= 10) {
                    System.out.println( " " +tableauValeur1[i] );
                }
                else{
                System.out.println("  "+tableauValeur1[i]);
                }
               
            }
            else{
                if (tableauValeur1[i] >= 10) {
                    System.out.print( " " +tableauValeur1[i] );
                }
                else{
                System.out.print("  "+tableauValeur1[i]);
                }
           
            }
            i++;

        }



        System.out.print("tableau 2: ");
        while (j<8) {
            tableauValeur2 [j] = (int) (Math.random() * (10 - 0 + 1)) + 0;

            if (j==7) {
                if (tableauResultat[k] >= 10) {
                    System.out.println( " " +tableauValeur1[j] );
                }
                else{
                System.out.println("  "+tableauValeur2[j]);
                }
                
            }
            else{
                if (tableauResultat[k] >= 10) {
                    System.out.print( " " +tableauValeur2[j] );
                }
                else{
                System.out.print("  "+tableauValeur2[j]);
                }
               
            }
            j++;
        }       
        i=0;
        j=0;


        System.out.print("résultat : ");
        while (k<8) {
            tableauResultat[k] = tableauValeur1[i] + tableauValeur2[j];
            if (tableauResultat[k] >= 10) {
                System.out.print( " " +tableauResultat[k] );
            }
            else{
            System.out.print("  "+tableauResultat[k]);
            }
            i++;
            j++;
            k++;
        }       
    }
}
