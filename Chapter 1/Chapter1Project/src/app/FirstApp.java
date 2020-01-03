package app;

import java.util.Scanner;

// Simple calculator

class FirstApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to Add, Subtract, Multiply, or Divide?: ");
        String choice = input.nextLine();
        if (choice.equals("add")) {
            System.out.println("Give me a number: ");
            Integer number = input.nextInt();
            System.out.println("Give me another number: ");
            Integer numberTwo = input.nextInt();
            Integer sum = number + numberTwo;
            System.out.println("The total is: " + sum);
        }
        if (choice.equals("subtract")) {
            System.out.println("Give me a number: ");
            Integer number = input.nextInt();
            System.out.println("Give me another number: ");
            Integer numberTwo = input.nextInt();
            Integer sub = number - numberTwo;
            System.out.println("The total is: " + sub);
        }
        if (choice.equals("multiply")) {
            System.out.println("Give me a number: ");
            Integer number = input.nextInt();
            System.out.println("Give me another number: ");
            Integer numberTwo = input.nextInt();
            Integer mult = number * numberTwo;
            System.out.println("The total is: " + mult);
        }
        if (choice.equals("divide")) {
            System.out.println("Give me a number: ");
            Float number = input.nextFloat();
            System.out.println("Give me another number: ");
            Float numberTwo = input.nextFloat();
            Float div = number / numberTwo;
            System.out.println("The total is: " + div);
        }
        input.close();
    }
}