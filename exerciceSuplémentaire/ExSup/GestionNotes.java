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

    public static void afficherListeEleves(String[] eleves){
        boolean estVide=true;
        System.out.println("Voici la liste des élèves: ");
        for (int i = 0; i < eleves.length; i++) {
            if (eleves[i] != ) {
                
            }
        }
        for (int i = 0; i < eleves.length; i++) {
            System.out.println(eleves[i]);
        }
    }
}
