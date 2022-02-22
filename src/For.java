public class For {
        public static void main(String[] args) {
                /*
                for(statement de initializare; conditia de oprire; statement care se intampla dupa fiecare iteratie) {
                 // bloc de cod
                }
                 */


                for(int counter = 0; counter < 25; counter++) {
                        System.out.println("[FOR1] Counterul are valoarea " + counter);
                }

                System.out.println("----------------------------------");

                int iterator;

                for(iterator = 0; iterator < 10; iterator++) {
                        System.out.println("FOR2 - Iteratorul are valoarea " + iterator);
                }

        }
}
