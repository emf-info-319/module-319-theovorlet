package exerciceSuplémentaire.lesBoucles;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class tablePythagore {
    public static void main(String[] args) {

        int resultat = 0;
        System.out.println("     1   2   3   4   5   6   7   8   9  10");
        for (int i = 1; i <= 10; i++) {
            if (i==10) {
                System.out.print(i);
            }else{
                System.out.print(" "+i);
            }
            for (int j = 1; j <= 10; j++) {
                resultat=i*j;
                if (resultat>=10) {
                    System.out.print("  "+resultat);
                }else{
                    System.out.print("   "+resultat);
                }
               
            }
            System.out.println("");
        }
    }
}
