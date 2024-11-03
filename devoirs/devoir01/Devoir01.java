package devoirs.devoir01;

public class Devoir01 {
    public static void main(String[] args) {
        int monAge = 45;
        boolean estMajeur;

        if (monAge > 20) {
            estMajeur = true;
        } else {
            estMajeur = false;
        }

        System.out.println("je m'appelle Vorlet Théo");
        System.out.println("mon age est de " + monAge);

        if (estMajeur == true) {
            System.out.println("je suis majeur");
        } else {
            System.out.println("Je ne suis pas majeur");
        }

    }
}
