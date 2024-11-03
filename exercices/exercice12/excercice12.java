package exercices.exercice12;

public class excercice12 {
    public static void main(String[] args) {
        String maChaineDeCaractere = "Voici du contenu stocké dans un String";
        String nomPersonne = "Vorlet test";
        String valeuraTrouver= "test";
        System.out.println(
                "Nombre de caractère  contenu dans la variable maChaineDeCaractere" + maChaineDeCaractere.length());
        System.out.println("le \"mot contenu\"commence à la position :  " + maChaineDeCaractere.indexOf("contenu"));
        System.out.println("La position 17 contient la lettre :  " + maChaineDeCaractere.substring(17, 18));
        for (int i = 0; i < nomPersonne.length(); i++) {
            System.out.println("La lettre à la position " + i + " est : " + nomPersonne.substring(i, i+1));
        }
       if (nomPersonne.contains(valeuraTrouver)) {
        System.out.println("La chaine de caractère \""+nomPersonne+"\" contient la chaîne de caractères \""+valeuraTrouver+"\"");
       }else{
        System.out.println("La chaine de caractère \""+nomPersonne+"\" ne contient pas la chaîne de caractères \""+valeuraTrouver+"\"");
       }
    }
}
