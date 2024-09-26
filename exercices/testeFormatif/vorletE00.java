package exercices.testeFormatif;

public class vorletE00 {
    static final int NOMBRE_PTS_VICTOIRE =3;
    
    public static void main(String[] args) {
        String nomEquipe1="Barcelone ";
        String nomEquipe2 ="Madrid ";
        int nombrePointEquipe1 = 0;
        int nombrePointEquipe2 = 0;
        
        for(int i = 0; i<10; i++){
            nombrePointEquipe1 = (int)(Math.random()*(10-1+1))+1;
            nombrePointEquipe2 = (int)(Math.random()*(10-1+1))+1;

            System.out.println(nomEquipe1 + "joue contre "+ nomEquipe2 + "et le résultat est "+ nombrePointEquipe1 + " à " + nombrePointEquipe2 );

            if (nombrePointEquipe1>nombrePointEquipe2) {
                System.out.println(nomEquipe1+"a gagné");
                nombrePointEquipe1 += NOMBRE_PTS_VICTOIRE;
            }
            else if (nombrePointEquipe2>nombrePointEquipe1) {
                System.out.println(nomEquipe2+"a gagné");
                nombrePointEquipe2 += NOMBRE_PTS_VICTOIRE;
            }
            else if (nombrePointEquipe1==nombrePointEquipe2) {
                System.out.println("Match nul");
                nombrePointEquipe1+=1;
                nombrePointEquipe2+=1;
            }
        }

        System.out.println(nomEquipe1+"a "+nombrePointEquipe1+" points");
        System.out.println(nomEquipe2+"a "+nombrePointEquipe2+" points");

    }
}
