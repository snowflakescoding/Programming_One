package Practice.Exercises.Week02.maths;

import java.util.Scanner;

public class IntegerDigitsSum {
     public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.print("Enter a number between 0 and 1000: ");
             int number = scanner.nextInt();
             number = (number < 0 || number > 1000) ? 0 : number;
             int sum = sumOfDigits(number);
             System.out.println("The sum of the digits is: " + sum);
         }
    }
    public static int sumOfDigits(int n) {
        return (n == 0) ? 0 : (n % 10) + sumOfDigits(n / 10);
    }
}
