package Practice.Exercises.Week03.business;

import java.util.Scanner;

public class CheckISBN10 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first 9 digits of an ISBN as integer: ");
            int firstNineDigits = scanner.nextInt();
            String digits = String.format("%09d", firstNineDigits);
            int checksum = 0;
            checksum += 1 * (digits.charAt(0) - '0');
            checksum += 2 * (digits.charAt(1) - '0');
            checksum += 3 * (digits.charAt(2) - '0');
            checksum += 4 * (digits.charAt(3) - '0');
            checksum += 5 * (digits.charAt(4) - '0');
            checksum += 6 * (digits.charAt(5) - '0');
            checksum += 7 * (digits.charAt(6) - '0');
            checksum += 8 * (digits.charAt(7) - '0');
            checksum += 9 * (digits.charAt(8) - '0');
            int lastDigit = checksum % 11;
            String lastDigitStr = (lastDigit == 10) ? "X" : String.valueOf(lastDigit);
            String isbn10 = digits + lastDigitStr;
            System.out.println("The ISBN-10 number is " + isbn10);
        }
    }
}

