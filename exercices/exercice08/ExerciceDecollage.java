package exercices.exercice08;

public class ExerciceDecollage {
    public static void main(String[] args) {
    
        System.out.println("Bouclepour :"); 
        for(int chiffre1 = 5; chiffre1 >=1;chiffre1--){
            System.out.println(chiffre1);
        }
        System.out.println("Décollage !! ");

        System.out.println("Boucle while ");
        int chiffre2 = 6;
        int chiffre3 = 6;
        while (chiffre2 > 1) {
            chiffre2--;
            System.out.println(chiffre2);
        }
        System.out.println("Décollage !! ");

        System.out.println("Boucle do-while :");

        do {
            chiffre3--;
            System.out.println(chiffre3);
        } while(chiffre3 > 1);
        System.out.println("Décollage !! ");

}
    
}
