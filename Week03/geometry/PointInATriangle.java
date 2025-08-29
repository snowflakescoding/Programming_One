package Practice.Exercises.Week03.geometry;

import java.util.Scanner;

public class PointInATriangle {
     public static void main(String[] args) {
         try (Scanner input = new Scanner(System.in)) {
             System.out.print("Enter a point's x- and y-coordinates: ");
             double x = input.nextDouble();
             double y = input.nextDouble();
             double x1 = 0, y1 = 0;
             double x2 = 200, y2 = 0;
             double x3 = 0, y3 = 300;
             double area = 0.5 * (-y2 * x1 + y1 * (-x2 + x3) + x2 * y3 + x1 * (y2 - y3));
             double area1 = 0.5 * (-y2 * x + y * (-x2 + x3) + x2 * y3 + x * (y2 - y3));
             double area2 = 0.5 * (-y1 * x + y1 * (-x + x3) + x * y3 + x1 * (y - y3));
             double area3 = 0.5 * (-y1 * x2 + y * (-x + x2) + x2 * y3 + x1 * (y2 - y));
             if (area == area1 + area2 + area3) {
                 System.out.println("The point is in the triangle.");
             } else {
                 System.out.println("The point is not in the triangle.");
             }}
     }
}
