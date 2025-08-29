package Practice.Exercises.Week02.maths;

import java.util.Scanner;

public class DistanceOfTwoPoints {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double x1 = input.nextDouble();
            double y1 = input.nextDouble();
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();
            double distance = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);
            System.out.println("Enter x1 and y1: " + x1 + " " + y1);
            System.out.println("Enter x2 and y2: " + x2 + " " + y2);
            System.out.println("The distance between two points is: " + distance);
        }
    }
}

