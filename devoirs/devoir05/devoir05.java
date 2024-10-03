package devoirs.devoir05;

public class devoir05 {
    public final static int NOMBRE_MAX = 100;
    public final static int NOMBRE_MIN = 0;

    public static void main(String[] args) {
        int nombreADeviner = (int)( Math.random() * ( NOMBRE_MAX- NOMBRE_MIN + 1 )) + NOMBRE_MIN;
        
    }
}
