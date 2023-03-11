package sample;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        System.out.println("We have a circle with radius 4");
        int radius = 4;

        System.out.println("Input x coordinat: ");
        double x = sc.nextDouble();
        System.out.println("Input y coordinat: ");
        double y = sc.nextDouble();

        double result1 = Math.pow(x, 2) + Math.pow(y, 2);
        int radiusSquare = radius * radius;

        if(result1 <= radiusSquare){

            System.out.println("The point is located in the circle");
        }
        else{
            System.out.println("The point isn't located in the circle");
        }

    }

}

