package Practice.Exercises.Week03.geometry;

import java.util.Scanner;  

public class PointInACircle {  
    public static void main(String[] args) {  
        try (Scanner input = new Scanner(System.in)) {
            double radius = 10.0;
            System.out.print("Enter a point with two coordinates: ");
            double x = input.nextDouble();
            double y = input.nextDouble();
            double distance = Math.sqrt((x * x) + (y * y));
            if (distance <= radius) {
                System.out.println("Point (" + x + ", " + y + ") is in the circle.");
            } else {
                System.out.println("Point (" + x + ", " + y + ") is not in the circle.");
            }
        } 
    }  
}