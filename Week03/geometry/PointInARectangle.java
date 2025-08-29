package Practice.Exercises.Week03.geometry;

import java.util.Scanner;

public class PointInARectangle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double rectangleWidth = 10.0;
            double rectangleHeight = 5.0;
            double halfWidth = rectangleWidth / 2;
            double halfHeight = rectangleHeight / 2;
            System.out.print("Enter a point with two coordinates: ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            if (Math.abs(x) <= halfWidth && Math.abs(y) <= halfHeight) {
                System.out.println("Point (" + x + ", " + y + ") is in the regtangle.");
            } else {
                System.out.println("Point (" + x + ", " + y + ") is not in the regtangle.");
            }
        }
    }
}
