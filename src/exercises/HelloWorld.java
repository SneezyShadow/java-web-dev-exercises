package exercises;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] Arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, What is your name:");
        String name = input.nextLine();
        input.close();

        System.out.println("Hello " + name);
    }
}
