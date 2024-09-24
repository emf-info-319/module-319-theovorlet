package exercices.exercice09;

public class nombresDeSurvivants {
    public static void main(String[] args) {
        int [] nombreSuivant = new int[5];
        int nombreDeBase = 27;
        int caseDuTableau=0;
        while (caseDuTableau!=5) {
            nombreDeBase++;
            nombreSuivant[caseDuTableau]=nombreDeBase;
            System.out.println(nombreSuivant[caseDuTableau]);
            caseDuTableau++;
        }

    }
    
}
