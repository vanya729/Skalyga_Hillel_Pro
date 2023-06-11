package lessons12.homework15;


import java.util.Random;

public class HomeWorkApp {

    Random random = new Random();

    public void printThreeWords(){
        String [] arrWords = {"Orange", "Banana", "Apple"};
        for (int i = 0; i <arrWords.length ; i++) {
            System.out.println(arrWords[i]);

        }
    }

    public void checkSumSign(){
        int a = random.nextInt(21)-10;
        int b = random.nextInt(21)-10;
        int sum=a+b;
        System.out.println( "A= "+a);
        System.out.println( "B= "+b);
        System.out.println("Sum ="+sum);
        if (sum>=0){
            System.out.println("The amount is positive");
        }else {
            System.out.println("Amount is negative");
        }
    }

    public void printColor(){
        int value = random.nextInt(310)-100;
        System.out.println(value);
        if (value<=0){
            System.out.println("Red");
        }else if (value >= 0 && value <= 100){
            System.out.println("Yellow");
        }else {
            System.out.println("Green");
        }
    }

    public void compareNumbers(){
        int a = random.nextInt(21)-10;
        int b = random.nextInt(21)-10;
        if (a>=b){
            System.out.println("a>=b");
            System.out.println("a= "+a +","+ "b= "+b);
        }else {
            System.out.println("a<b");
            System.out.println("a= "+a +","+ "b= "+b);
        }
    }

    public boolean sixVoidReturnBoolVoid(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public void sevenVoidPosetiveOrNegativeNum(int a){
        if (a>=0){
            System.out.println(a+" = a positive number");
        }else {
            System.out.println(a+ " = a negative number");
        }
    }


    public boolean eightVoidPosOrNegNumBool(int a){
        return a<=0;
    }


    public void nineVoidStrCount(String str, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public boolean tenVoidJumpingYears(int year){
        if (year % 4 !=0){
            return false;
        }else if (year % 100 !=0){
            return true;
        }else if (year % 400 ==0){
            return true;
        }
        return false;
    }
}
/*
10. * Написати метод, який визначає, чи є рік високосним,
і повертає boolean (високосний – true, не високосний – false). Кожен 4-й рік є високосним,
 крім кожного 100-го, причому кожен 400-й – високосний.
 */