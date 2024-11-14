package symphonie;

public class Symphonie {
    public static final String[] NOTES = new String[] { "DO", "RE", "MI", "FA", "SOL", "LA", "SI" };
    public static final int NBRE_NOTES = 5;
    public static final int NBRE_PARTITIONS = 3;
    public static final int NBRE_MIN = 1;
    public static final int NBRE_MAX = 10;

    public static void main(String[] args) {

    }

    public static int choisirUnNombre(int nbreMin, int nbreMax) {
        int nombrechoisi = (int) (Math.random() * (nbreMax - nbreMin + 1)) + nbreMin;
        return nombrechoisi;
    }

    public static boolean estDiese() {
        boolean seraDiese = false;
        if (choisirUnNombre(NBRE_MIN, NBRE_MAX) % 2 == 0) {
            seraDiese = true;
        }
        return seraDiese;
    }

    public static final String creerLaPartition(int nombreDeNotePartition) {
        System.out.println("La partition est : ");
        for (int i = 0; i < NBRE_NOTES; i++) {
            if (estDiese() == true) {
                System.out.println(NOTES[choisirUnNombre(1, 7)] + "# ");
            } else {
            }
            System.out.println(NOTES[choisirUnNombre(1, 7)] + " ");
        }
        return p;
    }

}
