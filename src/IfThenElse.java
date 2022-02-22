public class IfThenElse {
    public static void main(String[] args) {
        int a = 100;


        if(a == 50) {
            System.out.println("a este diferit de 50");
        } else if(a < 25) {
            System.out.println("a este mai mic decat 25");
        } else if(a > 100) {
            System.out.println("a este mai mare decat 100");
        } else {
            System.out.println("Inputul este diferit si neacoperit de blocul if-then-else");
        }

        //Operator ternar ? (if then else pe scurt)
        System.out.println((a == 25) ? "a este 25" : "a nu este 25");


    }
}