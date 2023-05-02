package lessons2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double summa = 0;
        int n = 0;

        while (true) {
            System.out.println("Input count number: ");
            n = getCorrectNum(scanner);
            if (n > 0) {
                break;
            } else {
                System.out.println("Enter a positive number.");
            }
        }

        System.out.println("Input the values of which you want to find the arithmetic mean");
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = getCorrectNum(scanner);
            summa += number[i];

        }
        System.out.println("Sum of you number: " + summa);
        double sumHulf = summa/n;
        System.out.println("Result ="+sumHulf);
    }


    static int getCorrectNum(Scanner scanner) {
        int num = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                break;
            } else {
                System.out.println("Error: Enter a valid integer");
                scanner.nextLine();
            }
        }
        return num;
    }
}
//2. Програма, яка знаходить середнє арифметичне значення довільної кількості чисел.
/*
1)визначити яке число ввів користувач       +
2)перрірити чи є це чисолом                 +


3)створити масив з n елементів, що б записвати туди значення        +
-перевірити на число                                    +
4)порахувати сумму              +

5) порхувати середнє арефметичне                +

 */