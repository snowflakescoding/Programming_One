import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter amount of money (in dollar):  ");
            double money = scanner.nextDouble();
            int totalCents = (int) Math.round(money * 100);
            
            int dollars = totalCents / 100;
            totalCents = totalCents % 100; // Remaining cents after dollars
            
            int quaters = totalCents / 25;
            totalCents = totalCents % 25; // Remaining cents after quarters
            
            int dimes = totalCents / 10;
            totalCents = totalCents % 10; // Remaining cents after dimes
            
            int nickles = totalCents / 5;
            totalCents = totalCents % 5; // Remaining cents after nickles
            
            int cents = totalCents; // Remaining cents left
            
            System.out.println(money + " has " + dollars + " dollars, " + quaters + " quaters, " + dimes + " dimes, " + nickles + " nickles, " + cents + " cents.");
        }
    }
}
