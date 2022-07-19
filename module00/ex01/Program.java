import java.util.Scanner;

public class Program {

   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int number = scan.nextInt();
       if (number <= 1) {
        System.err.println("IllegalArgument");
        System.exit (-1);
       }
       int numIterations = 0;
       for (int i = 2; i <= number / i; i++) {
        numIterations++;
        if (number % i == 0) {
            System.out.println("false " + numIterations);
            System.exit(0);
        }
       }
        System.out.println("true " + numIterations);
   }
}
