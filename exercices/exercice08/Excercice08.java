package exercices.exercice08;

public class Excercice08 { public static void main(String[] args) {
    

    for (int nombre1 = 1; nombre1 <= 5; nombre1++){
    System.out.println("Boucle for, itération " + nombre1);
    }
    int nombre2 = 0;

    while (nombre2 <5 ) {
        nombre2++; 
        System.out.println("Boucle while, itération " + nombre2);
    }
    int nombre3 = 0;
    do {
        nombre3++;
        System.out.println("Boucle do-while, itération " + nombre3);
    } while (nombre3 <5);
}
    
}
