package Practice.Exercises.Week02.financial;

import java.util.Scanner;

public class CountingMonetaryUnits {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the amount in dollars and cents: ");
            double amount = scanner.nextDouble();
            int totalCents = (int) Math.round(amount * 100);
            int dollars = totalCents / 100;
            totalCents = totalCents % 100; // Remaining cents
            int quarters = totalCents / 25;
            totalCents = totalCents % 25; // Remaining cents
            int dimes = totalCents / 10;
            totalCents = totalCents % 10; // Remaining cents
            int nickels = totalCents / 5;
            totalCents = totalCents % 5; // Remaining cents
            int pennies = totalCents;
            System.out.println("The equivalent in smaller monetary units:");
            System.out.println("Dollars: " + dollars);
            System.out.println("Quarters: " + quarters);
            System.out.println("Dimes: " + dimes);
            System.out.println("Nickels: " + nickels);
            System.out.println("Pennies: " + pennies);
        }
    }
}

