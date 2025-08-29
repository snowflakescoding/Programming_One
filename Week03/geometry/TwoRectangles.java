package Practice.Exercises.Week03.geometry;

import java.util.Scanner;

public class TwoRectangles {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double width1 = scanner.nextDouble();
            double height1 = scanner.nextDouble();
            
            System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double width2 = scanner.nextDouble();
            double height2 = scanner.nextDouble();
            
            double r1Left = x1 - width1 / 2;
            double r1Right = x1 + width1 / 2;
            double r1Top = y1 + height1 / 2;
            double r1Bottom = y1 - height1 / 2;
            
            double r2Left = x2 - width2 / 2;
            double r2Right = x2 + width2 / 2;
            double r2Top = y2 + height2 / 2;
            double r2Bottom = y2 - height2 / 2;
            
            if (r2Left >= r1Left && r2Right <= r1Right && r2Top <= r1Top && r2Bottom >= r1Bottom) {
                System.out.println("r2 is inside r1");
            } else if (r1Left < r2Right && r1Right > r2Left && r1Top > r2Bottom && r1Bottom < r2Top) {
                System.out.println("r2 overlaps r1");
            } else {
                System.out.println("r2 does not overlap r1");
            }
        }
    }
}

