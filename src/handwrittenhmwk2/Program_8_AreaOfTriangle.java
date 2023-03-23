package handwrittenhmwk2;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Program_8_AreaOfTriangle {
    public static void main(String[] args) {
        // Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lenth of the triangle :");
        int lenth = scanner.nextInt();
        System.out.println("Enter the height of the triangle :");
        int height = scanner.nextInt();
        areaOfTriangle(height,lenth);
        //closing the scanners
        scanner.close();

    }
    //calculating the area of triangle
    public static void areaOfTriangle(int lenth,int height){
        int area = (lenth *height)/2;
        System.out.println("The area of triangle is :");
    }
}
