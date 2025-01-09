package evalPrsesedante;

public class EUnAnneePasseeBlackJack {
    public static final int MIN = 2;
    public static final int MAX = 14;

    public static void main(String[] args) {
        String[] joueurs = new String[] { "Jacques", "Pierre", "Paul" };
        int[] scores = new int[joueurs.length];
        boolean jeuTermine = false;

        while (!jeuTermine) {
            for (int i = 0; i < joueurs.length; i++) {
                int carte = tirerUneCarte();
                if (carte > 10) {
                    scores[i] += 11;

                } else {
                    scores[i] += carte;
                }
                String nomCarte = donnerNomCarte(carte);
                System.out.println(joueurs[i] + " a tiré la carte " + nomCarte);
                System.out.println("   Nouveau score : " + scores[i]);
                if (scores[i] == 21) {
                    jeuTermine = true;
                    System.out.println(joueurs[i] + " a gagné !");
                    break;
                } else if (scores[i] > 21) {
                    jeuTermine = true;
                    System.out.println(joueurs[determinerIndexGagnant(scores)] + " a gagné");
                    break;
                }
            }
        }
    }

    public static int tirerUneCarte() {
        int carteTiree = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        return carteTiree;
    }

    public static int determinerIndexGagnant(int[] scores) {
        int point = 0;
        int position=0;
        for (int j = 0; j < scores.length; j++) {
            if (scores[j] > point && scores[j] < 22) {
                position = j;
                point=scores[j];
            }
        }
        return position;
    }

    public static String donnerNomCarte(int carte) {
        String valeurCarte = "indéterminé";
        if (carte >= 2 && carte <= 10) {
            valeurCarte = String.valueOf(carte);
        } else {
            switch (carte) {
                case 11:
                    valeurCarte = "valet";
                    break;
                case 12:
                    valeurCarte = "dame";
                    break;
                case 13:
                    valeurCarte = "roi";
                    break;
                case 14:
                    valeurCarte = "as";
                    break;
                default:
                    valeurCarte = "indéterminé";
                    break;
            }
        }
        return valeurCarte;

    }

}
