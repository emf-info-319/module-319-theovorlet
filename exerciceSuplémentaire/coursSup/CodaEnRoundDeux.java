package exerciceSuplémentaire.coursSup;

public class CodaEnRoundDeux {
    public static final String[] ELEVES = new String[] { "Jean", "Paul", "Mattieu", "Jacques", "Louis", "Emile", "Eric",
            "Julien", "Yvan", "Philippe" };

    public static void main(String[] args) {
        String[] groupe = creerGroupe(4);
        for (int i = 0; i < groupe.length; i++) {
            System.out.println(groupe[i]);
        }
    }

    public static String choisirEleve() {
        int indexDuTablau = (int) (Math.random() * (ELEVES.length-1-0+1))+0;
        return ELEVES[indexDuTablau];
    }

    public static boolean controlerDoublon(String nomAChercher, String[] lieuDeRecherche) {
        boolean estPresent = false;
        for (int i = 0; i < lieuDeRecherche.length; i++) {
            if (lieuDeRecherche[i] != null && lieuDeRecherche[i].equals(nomAChercher)) {
                estPresent = true;
                break;
            }
        }
        return estPresent;
    }

    public static String[] creerGroupe(int nombreDEleve) {
        String[] groupe = new String[nombreDEleve];
        groupe[0]=choisirEleve();


        for (int i = 1; i < groupe.length; i++) {
            String eleve = choisirEleve();
            boolean estDedans = controlerDoublon(eleve, groupe);
            if (!estDedans) {
                groupe[i] = eleve;
            } else {
                while (estDedans) {
                    eleve = choisirEleve();
                    estDedans = controlerDoublon(eleve, groupe);
                    if (!estDedans) {
                        groupe[i] = eleve;
                    }
                }
            }

        }

        return groupe;
    }
}
