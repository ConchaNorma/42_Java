package day01.ex00;

public class Program {

    public static void main(String[] args) {
        User Luka = new User("Luka", 5000);
        User Elik = new User("Elik", 7000);
        System.out.println("\n======================Luka to Elik========================");

        System.out.println("Sender: " + Luka.getName() + " with balance " + Luka.getBalance());
        System.out.println("Receiver: " + Elik.getName() + " with balance " + Elik.getBalance());
       
        Integer amount = 100;
        Transaction outcome = new Transaction(Luka, Elik, -amount);
        Transaction income = new Transaction(Luka, Elik, amount);
        if (outcome != null && income != null) {
            System.out.println("After transaction: " + Luka.getName() + " " + Luka.getBalance());
            System.out.println("After transaction: " + Elik.getName() + " " + Elik.getBalance());
        }
        System.out.println("After transaction: ");
    }
}