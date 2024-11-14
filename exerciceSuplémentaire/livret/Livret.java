public class Livret {
    public static final int MIN = 5;
    public static final int MAX = 20;

    public static void main(String[] args) {
        int valeurUne = choisiUnNombre();
        int valeurDeux = choisiUnNombre();
        System.out.println("les chiffres sont : " + valeurUne + " " + valeurDeux);
        construireTableMultiplication(valeurUne, valeurDeux);

    }

    public static int choisiUnNombre() {
        int nombreChoisi = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        return nombreChoisi;
    }

    public static String[] construireTableMultiplication(int chiffreUn, int chiffreDeux) {
        String[] tableauValeurLitteral = new String[chiffreUn * chiffreDeux];
        int resultat;
        String resultetEnSting;
        int i = 0;
        for (int j = 1; j <= chiffreUn; j++) {
            for (int k = 1; k <= chiffreDeux; k++) {
                resultat = j * k;
                resultetEnSting = String.valueOf(resultat);
                tableauValeurLitteral[i] = resultetEnSting;
                i++;
                System.out.println(" " + j + " x " + k + " = " + resultat);
            }
        }
        return tableauValeurLitteral;
    }
}