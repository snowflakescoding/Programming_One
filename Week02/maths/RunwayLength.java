import java.util.Scanner;

public class RunwayLength {
     public static void main(String[]args) {
		 try (Scanner input = new Scanner(System.in)) {
			 System.out.println("Enter speed and acceleration:");
			 double v = input.nextDouble();
			 double a = input.nextDouble();
			 double length = (v * v) / (2 * a);
			 System.out.printf("The minimum runway length of this airplane is %.3f%n", length);
		 }
     }
}

