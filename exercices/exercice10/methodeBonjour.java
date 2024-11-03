package exercices.exercice10;

public class methodeBonjour {

    public static void bonjour() {
        System.out.println("Bonjour");
        direBonjour();
        dire("Non");
        System.out.println(Math.min(2, 30));// va retourner la plus petit valeur
        System.out.println(Math.max(2, 30));// va retourner la plus grand valeur
        System.out.println(Math.pow(2, 3));// va élever le premier nombre à la puissance du premier
        System.out.println(Math.sqrt(16));// va calculer la racine carré d'un nombre
        System.out.println(Math.abs(-23));// va retourner la valeur absolu (distance en le nombre et 0)

    }

    public static void direBonjour() {
        System.out.println("Bonjour");
    }

    public static void dire(String leMot) {
        System.out.println(leMot);

    }
}
