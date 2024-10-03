package devoirs.devoir04;

public class devoir04 {
    public static void main(String[] args) {
        int year=2024;
        int month=4;
        int day=31;

        System.out.println("La date entré est le "+day+"."+month+"."+year);

        if (year>=0 && year<=9999){
            if (month>=1 && month<=12) {
                
            if (month== 1|| month==3 || month ==5|| month == 7 || month == 8|| month == 10 || month == 12) {

               if (day>=1 && day<32) {

                    switch (month) {
                        case 1:
                            System.out.println("Nous sommes le "+day+" Janvier "+year);
                            break;
                        case 3:
                        System.out.println("Nous sommes le "+day+" Mars "+year);
                            break;
                        case 5:
                            System.out.println("Nous sommes le "+day+" Mai "+year);
                                break;
                        case 7:
                                System.out.println("Nous sommes le "+day+" Juillette "+year);
                                break;
                        case 8:
                                System.out.println("Nous sommes le "+day+" Aout "+year);
                                break;
                         case 10:
                                System.out.println("Nous sommes le "+day+" Octobre "+year);
                                break;
                        case 12:
                                System.out.println("Nous sommes le "+day+" Décembre "+year);
                                break;
                        default:
                            break;
                    }
               }
               else{
                System.out.println("le jour ["+day+"] est hors limite");
               }
            }
            if (month==2) {
                if (year%4 != 0){
                    if(day>=1 && day <29) {
                        System.out.println("Nous sommes le "+day+" Février "+year);
                    }
                    else{
                        System.out.println("le jour ["+day+"] est hors limite");
                    }
                }
                else if(year%4 != 1){
                    if (day>=1 && day <30) {
                        System.out.println("Nous sommes le "+day+" Février "+year);
                    } 
                    else {System.out.println("le jour ["+day+"] est hors limite");}
                }
            }
            if (month==4 || month ==6 || month == 9|| month ==11) {
                if (day>=1 && day<31) {

                    switch (month) {
                        case 4:
                            System.out.println("Nous sommes le "+day+" Avril "+year);
                            break;
                        case 6:
                        System.out.println("Nous sommes le "+day+" Juin "+year);
                            break;
                        case 9:
                            System.out.println("Nous sommes le "+day+" Septembre "+year);
                                break;
                        case 11:
                                System.out.println("Nous sommes le "+day+" Novembre "+year);
                                break;
                        default:
                            break;
                    }
            }else{
                System.out.println("le jour ["+day+"] est hors limite");
               }
        }
    }else{
        System.out.println("le mois ["+month+"] est hors limite");
    }
    }else{
        System.out.println("l'année ["+year+"] est hors limite");
    }
  }
}