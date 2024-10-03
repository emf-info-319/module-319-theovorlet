package devoirs.devoir04;

public class devoir04 {
    public static void main(String[] args) {
        int year=2024;
        int month=10;
        int day=3;

        if (year>=0 && year<=9999 && month>=1 && month<=12) {
            if (month== 1|| month==3 || month ==5|| month == 7 || month == 8|| month == 10 || month == 12) {
               if (day>=1 && day<32) {
                    switch (month) {
                        case 1:
                            System.out.println("Nous sommes le "+day+" Janvier"+year);
                            break;
                        case 3:
                        System.out.println("Nous sommes le "+day+" Mars"+year);
                            break;
                        case 5:
                            System.out.println("Nous sommes le "+day+" Mai"+year);
                                break;
                        case 7:
                                System.out.println("Nous sommes le "+day+" Juillette"+year);
                                break;
                        case 8:
                                System.out.println("Nous sommes le "+day+" Aout"+year);
                                break;
                         case 10:
                                System.out.println("Nous sommes le "+day+" Octobre"+year);
                                break;
                        case 12:
                                System.out.println("Nous sommes le "+day+" Juillette"+year);
                                break;
                        default:
                            break;
                    }
               }
            }
        }

    }
}