import java.util.Scanner;

public class FinancialValue {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the monthly saving amount:  ");
            
            // declare monthly savings and interest rate
            double monthlySaving = scanner.nextDouble();
            double monthlyInterestRate = 0.05 / 12;
            
            // declare account value, starting from 0
            double accountValue = 0.0;
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate); // Month 1
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate); // Month 2
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate); // Month 3
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate); // Month 4
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate); // Month 5
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate); // Month 6
            System.out.printf("After the sixth month, the account value is $%.2f%n", accountValue);
        }
    }
}
