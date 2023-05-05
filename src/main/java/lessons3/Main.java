package lessons3;

public class Main {
    public static void main(String[] args) {
            Tasks tasks = new Tasks();

            System.out.println("Task 1:");
            tasks.forPrint1to99();
            System.out.println("--------------------------------------------");
            System.out.println("\nTask 2:");
            tasks.forFactorial(7);
        System.out.println("--------------------------------------------");

        System.out.println("Task 3:");
            tasks.whileTask1to2();
        System.out.println("--------------------------------------------");

        System.out.println("Task 4:");
        tasks.doWhileTask1to2();
        System.out.println("--------------------------------------------");

        System.out.println("Task 5:");
        tasks.xPowN(2,5);
        System.out.println("--------------------------------------------");

        System.out.println("Task 6(1):");
        tasks.printMinus5Sequence();
        System.out.println("\nTask 6(2):");
        tasks.printMinus5Sequence1();
        System.out.println("--------------------------------------------");

        System.out.println("Task 7: ");
        tasks.multiplicationTable(125);
        System.out.println("--------------------------------------------");

        System.out.println("Task 8:");
        tasks.arrayOdd();
        System.out.println("--------------------------------------------");

        System.out.println("Task 9:");
        tasks.minArrayNum(7);
        System.out.println("--------------------------------------------");

        System.out.println("Task 10:");
        tasks.maxArrayNum(7);
        System.out.println("--------------------------------------------");

        System.out.println("Task 11:");
        tasks.replaceMaxAndMin(7);
        System.out.println("--------------------------------------------");



    }
}
