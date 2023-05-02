package lessons2;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum = -1, secondNum = -1;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Please enter the first number:");
            if (scanner.hasNextInt()) {
                firstNum = scanner.nextInt();
                while (!validInput) {
                    System.out.println("Please enter the second number:");
                    if (scanner.hasNextInt()) {
                        secondNum = scanner.nextInt();
                        validInput = true;
                    } else {
                        System.out.println("Error:second number");
                        scanner.nextLine();
                    }
                }
            } else {
                System.out.println("Error: first number");
                scanner.nextLine();
            }
        }
            int divider = 2;
            double sumHulf = (firstNum+secondNum)/divider;
        System.out.println("("+firstNum+ " + "+secondNum+")"+ "/"+divider +"=" +"Result ="+sumHulf);


    }
}
