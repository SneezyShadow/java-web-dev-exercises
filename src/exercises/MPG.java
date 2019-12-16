package exercises;

import java.util.Scanner;

public class MPG {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many Miles have you driven:");
        double miles = input.nextDouble();
        System.out.println("How much gas have you consumed:");
        double gas = input.nextDouble();
        input.close();

        double mpg = miles / gas;
         System.out.println("Your Miles per Gallon (MPG) is "+ mpg);
    }
}
