package lesTableaux;

public class RevisionTableauBoucles {
 public static void main(String[] args) {
    String[] sujets = new String[]{"Le chat ","Le chien ","Ta mère ","Ton père ","il "};
    String[] verbes = new String[]{"mange ","chante ","fait ","joue ","dort ","lit "};
    String[] choses = new String[]{"une pizza.","une chanson.","un poker","au carte","dans un lit","un livre"};
    for (int i = 0; i < 10; i++) {
        System.out.print(choisirMot(sujets));
        System.out.print(choisirMot(verbes));
        System.out.println(choisirMot(choses));
    }
 }  
 public static int  nbreAleatoire(int max, int min){
    int nombre = ( int ) ( Math.random() * ( max - min + 1 ) ) + min;
    return nombre;
 }
 public static String choisirMot (String[]tableauAvecMots){
    return tableauAvecMots[nbreAleatoire(tableauAvecMots.length-1, 0)];
 }
}
