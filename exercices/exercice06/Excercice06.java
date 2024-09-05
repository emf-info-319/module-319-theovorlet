package exercices.exercice06;

public class Excercice06 { 
    public static void main(String[] args) {
        
        int noteduModule = 6;
        if (noteduModule == 1) {
            System.out.println("travaille non rendu");
        } else if (noteduModule == 2 ) {
            System.out.println("très insffisant");
        } else if (noteduModule == 3) {
            System.out.println("insuffisant");
        }else if (noteduModule == 4) {
            System.out.println("suffisant");
        }else if (noteduModule == 5) {
            System.out.println("bien");
        }else if (noteduModule == 6) {
            System.out.println("très bien");
        }

    
        switch (noteduModule) {
            case 1:
            System.out.println("travaille non rendu");
                break;
            case 2 :
            System.out.println("travaille non rendu");
                break;
            case 3 :
            System.out.println("travaille non rendu");
                break;
            case 4:
            System.out.println("travaille non rendu");
                break;
            case 5:
            System.out.println("travaille non rendu");
                break;
            case 6:
            System.out.println("travaille non rendu");
                break;
        

            default:
                break;
        }
    }
    
}
