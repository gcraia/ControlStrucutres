public class Switch {
    public static void main(String[] args) {
        int dayOfWeek = 7;

        /*
        0 - luni
        1 - marti
        ..
        5 - sambata
        6 - duminica
         */

        switch (dayOfWeek){
            case 0:
                System.out.println("Luni");
                break;
            case 1:
                System.out.println("Marti");
                break;
            case 2:
                System.out.println("Miercuri");
                break;
            case 3:
                System.out.println("Joi");
                break;
            case 4:
                System.out.println("Vineri");
                break;
            case 5:
                System.out.println("Sambata");
                break;
            case 6:
                System.out.println("Duminica");
                break;
            default:
                System.out.println("Ce zi este asta?");

        }


    }
}
