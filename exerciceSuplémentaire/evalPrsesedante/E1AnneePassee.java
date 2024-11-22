package evalPrsesedante;

public class E1AnneePassee {
  public static final String[] EQUIPES = { "FC Richemont", "FC Central", "FC Schoenberg", "FC Beauregard", "Team AFF",
      "Etoile Sport" };
  public static final int MAX_Goal = 10;
  public static int[] pointsEquipe;

  public static void main(String[] args) {
    pointsEquipe = new int[EQUIPES.length];
    for (int i = 0; i < EQUIPES.length; i++) {
      if (i == EQUIPES.length - 1) {
        simuleMatch(i, 0);
      } else {
        simuleMatch(i, i++);
      }
    }
    System.out.println("-----------------------------");
    for (int j = 0; j < EQUIPES.length; j++) {
      System.out.println("L'équipe " + EQUIPES[j] + " a " + pointsEquipe[j] + " points");
    }
    System.out.println("-----------------------------");
    int[] gagnants = trouveGagnants();

    for (int i = 0; i < gagnants.length; i++) {

    }
  }

  public static void simuleMatch(int index1, int index2) {
    int scoreEquipe1 = (int) (Math.random() * (MAX_Goal - 0 + 1)) + 0;
    int scoreEquipe2 = (int) (Math.random() * (MAX_Goal - 0 + 1)) + 0;
    if (scoreEquipe1 > scoreEquipe2) {
      pointsEquipe[index1] += 3;
      System.out.println("L'équipe " + EQUIPES[index1] + " a gagné contre l'équipe " + EQUIPES[index2]);
    } else if (scoreEquipe1 < scoreEquipe2) {
      pointsEquipe[index2] += 3;
      System.out.println("L'équipe " + EQUIPES[index2] + " a gagné contre l'équipe " + EQUIPES[index1]);
    } else {
      pointsEquipe[1] += 1;
      pointsEquipe[2] += 1;
      System.out.println("Match nul entre " + EQUIPES[index1] + " et " + EQUIPES[index2]);
    }
  }
  public static int rechercheMaxPts(){
    int maximumTrouver = pointsEquipe[0];
    for (int m = 1; m < maxTableau.length; m++) {
        if (maxTableau[m] > maximumTrouver) {
            maximumTrouver = maxTableau[m];
        }
    }
    System.out.println("la valeur max trouvée = " + maximumTrouver);
    return maximumTrouver;

  }
}
