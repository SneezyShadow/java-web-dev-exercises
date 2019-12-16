package exercises;

import java.util.Scanner;

public class NumericTypes {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insert the length of the Rectangle:");
        double length = input.nextDouble();
        System.out.println("Insert the Width of the rectangle:");
        double width = input.nextDouble();
        input.close();

        double area = length * width;

        System.out.println("The area of the rectangle is "+ area);

    }
}
