package exerciceSuplémentaire.lesBoucles;

public class laTableDeMultiplication {
    final static int chiffreAMultiplier = 7;
    public static void main(String[] args) {
        
        int resultatCalcul=chiffreAMultiplier;
        for(int i = 1; i <= 10; i++){
            resultatCalcul= chiffreAMultiplier*i;
            System.out.println(chiffreAMultiplier + " X " + i + " = " + resultatCalcul);
        }
      

    }
}
