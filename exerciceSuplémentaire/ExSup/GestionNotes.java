import java.util.Scanner;

public class GestionNotes {
    public static final String[] BRANCHES = new String[] { "Maths", "Français", "Anglais" };

    public static void main(String[] args) {
       
    }

    public static String[] ajouterEleve(String[] eleves) {
        System.out.println("Veuillez saisir le nom du nouvel élève: ");
        Scanner demandeNom = new Scanner(System.in);
        String nom = demandeNom.nextLine();
        String[] nouveauxEleves = new String[eleves.length + 1];
        for (int i = 0; i < nouveauxEleves.length; i++) {
            if (i > eleves.length) {
                nouveauxEleves[i] = nom;
                break;
            }
            nouveauxEleves[i] = eleves[i];
        }
        demandeNom.close();
        return nouveauxEleves;
    }

    public static void afficherListeEleves(String[] eleves) {
        boolean estVide = true;
        System.out.println("Voici la liste des élèves: ");
        for (int i = 0; i < eleves.length; i++) {
            if (eleves[i] != "") {
                estVide = false;
                break;
            }
        }
        if (!estVide) {
            for (int i = 0; i < eleves.length; i++) {
                if (eleves[i] != "") {
                    System.out.println(eleves[i]);
                }
            }
        } else if (estVide) {
            System.out.println("La liste des élèves est actuellement vide");
        }
    }

    public static int trouverEleve(String[] eleves) {
        System.out.println("Veuillez saisir le nom d'un élève :");
        Scanner scanner = new Scanner(System.in);
        String nomRecherche = scanner.nextLine();
        int position = -1;
        for (int r = 0; r < eleves.length; r++) {
            if (eleves[r] == nomRecherche) {
                position = r;
                break;
            }
        }
        return position;
    }

    public static int[][] agrandirTableauNotes(String[] eleves, int[][] notes) {
        int[][] nouveauTableauNotes = new int[eleves.length][BRANCHES.length];
        for (int i = 0; i < nouveauTableauNotes.length; i++) {
            for (int j = 0; j < nouveauTableauNotes.length; j++) {
                nouveauTableauNotes[i][j] = notes[i][j];
            }
        }
        return nouveauTableauNotes;
    }

    public static int[][] saisirNotesEleves(int positionEleve, int[][] notes) {
      
        return notes;
    }
}
