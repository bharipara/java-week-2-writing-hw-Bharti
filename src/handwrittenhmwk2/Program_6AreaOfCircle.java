package handwrittenhmwk2;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */

public class Program_6AreaOfCircle {

    public static void main(String[] args) {
        // Scanner declaration

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radius :");
        double radius = scanner.nextDouble();
        areaOfCircle(radius);
        //closing the scanner object
        scanner.close();
        }
        //calculating area of circle

    public static void areaOfCircle(double radius) {
        double pi = Math.PI;
        double area = (pi *radius *radius);
        System.out.println("The area of circle is :" + area);

    }
    }

