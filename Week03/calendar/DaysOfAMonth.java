package Practice.Exercises.Week03.calendar;
import java.util.Scanner;

public class DaysOfAMonth {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter a month: ");
            String month = scanner.nextLine();
            int days;
            switch (month) {
                case "Jan" -> days = 31;
                case "Feb" -> {
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        days = 29;
                    } else {
                        days = 28; 
                    }
                }
                case "Mar" -> days = 31;
                case "Apr" -> days = 30;
                case "May" -> days = 31;
                case "Jun" -> days = 30;
                case "Jul" -> days = 31;
                case "Aug" -> days = 31;
                case "Sep" -> days = 30;
                case "Oct" -> days = 31;
                case "Nov" -> days = 30;
                case "Dec" -> days = 31;
                default -> {
                    System.out.println("Invalid month entered.");
                    return;
                }
            }
            System.out.println(month + " " + year + " has " + days + " days.");
        }
    }
}
