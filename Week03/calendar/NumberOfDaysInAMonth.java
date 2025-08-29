package Practice.Exercises.Week03.calendar;

import java.util.Scanner;

public class NumberOfDaysInAMonth {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the month: ");
            int month = scanner.nextInt();
            System.out.print("Enter the year: ");
            int year = scanner.nextInt();
            int days = 0;
            String monthName = "";
            if (month < 1 || month > 12) {
                System.out.println("Invalid month entered. Please enter a value between 1 and 12.");
            } else {
                switch (month) {
                    case 1 -> {
                        monthName = "January";
                        days = 31;
                    }
                    case 2 -> {
                        monthName = "February";
                        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                            days = 29;
                        } else {
                            days = 28;
                        }
                    }
                    case 3 -> {
                        monthName = "March";
                        days = 31;
                    }
                    case 4 -> {
                        monthName = "April";
                        days = 30;
                    }
                    case 5 -> {
                        monthName = "May";
                        days = 31;
                    }
                    case 6 -> {
                        monthName = "June";
                        days = 30;
                    }
                    case 7 -> {
                        monthName = "July";
                        days = 31;
                    }
                    case 8 -> {
                        monthName = "August";
                        days = 31;
                    }
                    case 9 -> {
                        monthName = "September";
                        days = 30;
                    }
                    case 10 -> {
                        monthName = "October";
                        days = 31;
                    }
                    case 11 -> {
                        monthName = "November";
                        days = 30;
                    }
                    case 12 -> {
                        monthName = "December";
                        days = 31;
                    }
                }
                
                System.out.println(monthName + " " + year + " had " + days + " days.");
            }
        }
    }
}
