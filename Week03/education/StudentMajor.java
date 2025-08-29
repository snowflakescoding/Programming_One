package Practice.Exercises.Week03.education;

import java.util.Scanner;

public class StudentMajor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter two characters: ");
            String input = scanner.nextLine();
            if (input.length() != 2) {
                System.out.println("Invalid input");
                extracted();
            }
            char majorChar = input.charAt(0);
            char statusChar = input.charAt(1);
            String major = "";
            String status = "";
            switch (majorChar) {
                case 'M' -> major = "Mathematics";
                case 'C' -> major = "Computer Science";
                case 'I' -> major = "Information Technology";
                default -> {
                    System.out.println("Invalid input");
                    extracted();
                }
            }
            switch (statusChar) {
                case '1' -> status = "Freshman";
                case '2' -> status = "Sophomore";
                case '3' -> status = "Junior";
                case '4' -> status = "Senior";
                default -> {
                    System.out.println("Invalid input");
                    extracted();
                }
            }
            System.out.println(major + " " + status);
        }
    }

	private static void extracted() {
	}
}
