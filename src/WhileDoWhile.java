public class WhileDoWhile {
    public static void main(String[] args) {

        int counter = 0;

        /*
        while(expresia este adevarata) {
            // blocul de cod
        }
         */

        while(counter < 25) {
            System.out.println("WHILE Counterul are valoarea " + counter);
            counter++;
        }

        System.out.println("-------------------------------");
        counter = 0;
        /*
        do {
            // bloc de cod
        } while(conditia care trebuie evaluata);
         */

        do {
            System.out.println("||====================================");
            System.out.println("|| DO WHILE Counterul are valoarea " + counter);
            counter++;
        } while(counter < 25);
    }
}
