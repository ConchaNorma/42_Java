import java.util.Scanner;

public class Program {

   public static void main(String[] args) {
       int primeNum = 0;
       Scanner scan = new Scanner(System.in);
       int number = 0;
       do {
       number = scan.nextInt();
       if (number <= 1) {
        System.err.println("Illegal Argument");
        System.exit(-1);
       }
       int numTemp = number;
       int sumDigits = 0;
       do {
        sumDigits += numTemp % 10;
        numTemp /= 10;
       } while (numTemp > 0);
       boolean primeIs = true;
       for (int i = 2; i <= sumDigits / i; i++) {
        if (sumDigits % i == 0) {
            primeIs = false;
            break;
        }
       }
       if (primeIs) {
        primeNum++;
       }
       } while (number != 42);
       System.out.println("Count of coffee-request - " + primeNum);
   }
}
