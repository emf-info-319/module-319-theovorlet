package evalPrsesedante;

public class E1AnneePassee {
  public static final String[] EQUIPES = { "FC Richemont", "FC Central", "FC Schoenberg", "FC Beauregard", "Team AFF",
      "Etoile Sport" };
  public static final int MAX_Goal = 10;
  public static int[] pointsEquipe;

  public static void main(String[] args) {
    pointsEquipe = new int[EQUIPES.length];
    for (int i = 0; i < EQUIPES.length; i++) {
      for (int j = i + 1; j < EQUIPES.length; j++) {
        simuleMatch(i, j);
      }
    }

    System.out.println("-----------------------------");

    for (int j = 0; j < EQUIPES.length; j++) {
      System.out.println("L'équipe " + EQUIPES[j] + " a " + pointsEquipe[j] + " points");

    }

    System.out.println("-----------------------------");
    int[] gagnants = trouveGagnants();

    for (int i = 0; i < gagnants.length; i++) {
      System.out.println("L'équipe " + EQUIPES[gagnants[i]] + " a gagné.");
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
      pointsEquipe[index1] += 1;
      pointsEquipe[index2] += 1;
      System.out.println("Match nul entre " + EQUIPES[index1] + " et " + EQUIPES[index2]);
    }
  }

  public static int rechercheMaxPts() {
    int maxPts = 0;
    for (int i = 0; i < EQUIPES.length; i++) {
      if (pointsEquipe[i] > maxPts) {
        maxPts = pointsEquipe[i];
      }
    }

    return maxPts;

  }

  public static int[] trouveGagnants() {
    int[] equipeGagnante;
    int maxPts = rechercheMaxPts();
    int compteurDesGagnants = 0;
    for (int i = 0; i < EQUIPES.length; i++) {
      if (pointsEquipe[i] == maxPts) {
        compteurDesGagnants++;
      }
    }
    int compteur = 0;
    equipeGagnante = new int[compteurDesGagnants];
    for (int i = 0; i < EQUIPES.length; i++) {
      if (pointsEquipe[i] == maxPts) {
        equipeGagnante[compteur++] = i;
      }
    }
    return equipeGagnante;
  }
}
