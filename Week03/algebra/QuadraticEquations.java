package Practice.Exercises.Week03.algebra;
import java.util.Scanner;

public class QuadraticEquations {
     public static void main(String[]args) {
         try (Scanner input = new Scanner(System.in)) {
             double a = input.nextDouble();
             double b = input.nextDouble();
             double c = input.nextDouble();
             double x1 = (-b + Math.pow((b * b - 4 * a * c), 0.5)) / (2 * a);
             double x2 = (-b + Math.pow((b * b - 4 * a * c), 0.5)) / (2 * a);
             double discriminant = b * b - 4 * a * c;
             if (discriminant > 0) {
                 System.out.println("The equation has two roots " + x1 + " and " + x2);
             } else if (discriminant == 0) {
                 System.out.println("The equation has one root " + x1);
             } else {
                 System.out.println("The equation has no real roots");
             }
         }
     }
}
