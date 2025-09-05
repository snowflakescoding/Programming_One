import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();
        int first_digit = number / 100;
        int remainder_after_first = number - first_digit * 100;
        int second_digit = remainder_after_first / 10;
        int remainder_after_second = number - first_digit * 100 - second_digit * 10;
        int third_digit = remainder_after_second;
        int sum = first_digit + second_digit + third_digit;
        System.out.println("The sum of the digits is " + sum);
    }
}
