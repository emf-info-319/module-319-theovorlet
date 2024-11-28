package evalPrsesedante;

import java.util.Scanner;

public class E2AnneePassee {
    public static final int NOMBRE_BATONNETS = 21;
    public static final int MIN = 1;
    public static final int MAX = 3;

    public static void main(String[] args) {
        int[] batonnets = new int[NOMBRE_BATONNETS];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < batonnets.length; i++) {
            batonnets[i]++;
        }
        System.out.println(" Bienvenue dans le jeu de Nim ! »");
        System.out.println("Règles : Vous et l'IA retirez tour à tour entre 1 et 3 bâtonnets.");
        System.out.println("Le joueur qui retire le dernier bâtonnet perd.");
        boolean tourJoueur = true;
        while (nbBatonnetRestants(batonnets) > 0) {
            afficherBatonnets(batonnets);
            tourJoueur = !tourJoueur;
            if (tourJoueur) {
                int nbEnleve = demanderNombre(scanner);
                batonnets = enleverBatonnets(batonnets, nbEnleve);
            } else {
                int nbEnleveIA = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
                System.out.println("\nL'IA a enlevé " + nbEnleveIA);
                batonnets = enleverBatonnets(batonnets, nbEnleveIA);
            }
        }
        if (tourJoueur) {
            System.out.println("Vous avez retiré le dernier bâtonnet. L'IA gagne ! ");
        } else {
            System.out.println("«L'IA a retiré le dernier bâtonnet. Vous gagnez !");
        }
        scanner.close();
    }

    public static void afficherBatonnets(int[] batonnets) {
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == batonnets[batonnets.length - 1] && batonnets[i] == 1) {
                System.out.print("|");
            } else if (batonnets[i] == batonnets[batonnets.length - 1] && batonnets[i] == 0) {
                System.out.print("-");
            } else if (batonnets[i] == 1) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }
        }
    }

    public static int nbBatonnetRestants(int[] batonnets) {
        int nbrBatonnet = 0;
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                nbrBatonnet++;
            }
        }
        return nbrBatonnet;
    }

    public static int[] enleverBatonnets(int[] batonnets, int nbEnleve) {
        int nbRestants = nbBatonnetRestants(batonnets);
        int nbEnleveMax = Math.min(nbEnleve, nbRestants);
        for (int i = batonnets.length - 1; i >= 0 && nbEnleveMax > 0; i--) {
            if (batonnets[i] == 1) {
                batonnets[i] = 0;
                nbEnleveMax--;
            }
        }
        return batonnets;
    }

    public static int demanderNombre(Scanner scanner) {

        System.out.print("\nEntrez un nombre compris entre 1 et 3 svp: ");
        int valeurDonner = scanner.nextInt();
        scanner.nextLine();
        while (valeurDonner < 1 || valeurDonner > 3) {
            System.out.println("Il faut entrez un nombre compris entre 1 et 3 svp");
            valeurDonner = scanner.nextInt();
            scanner.nextLine();
        }

        return valeurDonner;
    }

    public static int[] enleverBatonnetsIA(int[] batonnets, int nbEnleve) {
        int nbRestants = nbBatonnetRestants(batonnets);

        for (int i = batonnets.length = 0; i >= 0; i--) {

            if (nbBatonnetRestants(batonnets) == 2 || nbBatonnetRestants(batonnets) == 1) {
                batonnets--;
            } else if (nbBatonnetRestants(batonnets) == 3) {
                nbBatonnetRestantsApresIA(batonnets, 2);
            }
             else {
                int nbEnleveMax = Math.min(nbEnleve, nbRestants);
                for (int j = batonnets.length - 1; j >= 0 && nbEnleveMax > 0; j--) {
                    if (batonnets[i] == 1) {
                        batonnets[i] = 0;
                        nbEnleveMax--;
                    }
                }
            }
            return batonnets;
        }
        
    }
    public static int nbBatonnetRestantsApresIA(int[] batonnets,int batonnetsEnleves) {
        int nbrBatonnet = 0;
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                nbrBatonnet++;
            }
        }
        return nbrBatonnet;
    }
}
