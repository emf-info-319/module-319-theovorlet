package eval;

public class Vorlet {
    public final static int NOTE_MIN = 1;
    public final static int NOTE_MAX = 6;
    public final static int NBRE_NOTES = 5;
        public static void main(String[] args) {
        float totalNote=0;
        float moyenne;
        int[] notesObtenues = new int[NBRE_NOTES];
        for(int i = 0; i<NBRE_NOTES;i++){
            notesObtenues[i] = ( int ) ( Math.random() * ( NOTE_MAX - NOTE_MIN + 1 ) ) + NOTE_MIN;
        }
        for(int j = 0; j<NBRE_NOTES;j++){
            System.out.print("La note obtenue est "+ notesObtenues[j]+" :");
            switch (notesObtenues[j]) {
                case 4:
                    System.out.println(" suffisant");
                    break;
                case 5:
                System.out.println(" bien");
                    break;
                case 6:
                System.out.println(" très bien");
                    break;
                default:
                System.out.println(" insuffisant");
                    break;
            }
        }
        for(int k =0; k<NBRE_NOTES; k++){
            totalNote += notesObtenues[k];
        }
        moyenne= totalNote/NBRE_NOTES ;
        System.out.println("La moyenne est de : "+moyenne);
        if (moyenne >= 4) {
            System.out.println("L'élève est promu !");
        }else{
            System.out.println("L'élève est non promu !");
        }
    }
}
