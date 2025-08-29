package Practice.Exercises.Week02.financial;

import java.util.Scanner;

public class FinancialCompoundValue {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the monthly saving amount (in VND): ");
            double monthlySaving = scanner.nextDouble();
            double monthlyInterestRate = 0.05 / 12;
            double accountValue = 0;
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate); // Month 1
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate); // Month 2
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate); // Month 3
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate); // Month 4
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate); // Month 5
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate); // Month 6
            System.out.println("The account value after 6 months is: " + accountValue);
        }
    }
}

