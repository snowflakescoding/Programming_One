package Practice.Exercises.Week02.maths;

import java.util.Scanner;

public class RunwayLength {
     public static void main(String[]args) {
		 try (Scanner input = new Scanner(System.in)) {
			 double v = input.nextDouble();
			 double a = input.nextDouble();
			 System.out.println("Enter speed and acceleration: " + v + " " + a);
			 double length = (v * v) / (2 * a);
			 System.out.println("The minimum runway length for this airplane is " + length);
		 }
     }
}
