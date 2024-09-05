package exercices.exercice04;

public class Excercice04 {



    public static void  main(String []args){
        int variable1 = 9;
        int variable2 = 7;

        System.out.println("Le contenu de la variable est : " + variable1 );
        System.out.println("Le contenu de la variable est : " + variable2 );
        System.out.println(".....Traitement...");
        
        int variable3 = variable1;
        variable1 = variable2;
        variable2 = variable3;
        System.out.println("Le contenu de la variable est : " + variable1 );
        System.out.println("Le contenu de la variable est : " + variable2 );


    }

}
