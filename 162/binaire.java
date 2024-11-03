import java.util.Scanner;

public class binaire {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre décimal : ");
        int nombreDecimal = scanner.nextInt();
        scanner.nextLine();
        if (nombreDecimal==0) {
            System.out.println(0);
        }
        int nombreBinaire;
        while (nombreDecimal>0) {
            
        }
        System.out.println(nombreDecimal);
        scanner.close();
    }
}
