package lessons12.homework15;

public class Main {
    public static void main(String[] args) {
        HomeWorkApp homeWorkApp = new HomeWorkApp();
        homeWorkApp.printThreeWords();
        System.out.println("---------------------------------");

        homeWorkApp.checkSumSign();
        System.out.println("---------------------------------");

        homeWorkApp.printColor();
        System.out.println("---------------------------------");

        homeWorkApp.compareNumbers();
        System.out.println("---------------------------------");

        boolean rez = homeWorkApp.sixVoidReturnBoolVoid(10,5);
        System.out.println(rez);
        System.out.println("---------------------------------");


        homeWorkApp.sevenVoidPosetiveOrNegativeNum(4);
        System.out.println("---------------------------------");

        boolean res = homeWorkApp.eightVoidPosOrNegNumBool(-5);
        System.out.println(res);
        System.out.println("---------------------------------");


        homeWorkApp.nineVoidStrCount("hello", 10);

        System.out.println("---------------------------------");
        boolean year = homeWorkApp.tenVoidJumpingYears(2024);
        System.out.println(year);
    }
}
