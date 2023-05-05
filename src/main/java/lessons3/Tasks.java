package lessons3;

import java.util.Arrays;

public class Tasks {
    public void forPrint1to99(){
        for (int i = 0; i <= 99; i++) {
            if (i%2==1){
                System.out.println(i);
            }
        }
    }

    public void forFactorial(int n){        //5!=1*2*3*4*5=120
        int factorial =1;
        for (int i = 1; i <= n; i++) {
            factorial*=i;
        }
        System.out.println(factorial);
    }
    public void whileTask1to2(){
        while (true){
            System.out.println("1 and 2 are rewritten \n");
            forPrint1to99();
            System.out.println();
            forFactorial(5);
            break;
        }
    }

    public void doWhileTask1to2(){
        do {
            System.out.println("1 and 2 are rewritten \n");
            forPrint1to99();
            System.out.println();
            forFactorial(5);
            break;
        }while (true);
    }

    public int xPowN(int x, int n){
        int rez = (int) Math.pow(x,n);
        System.out.println(rez);
        return rez;
    }

    public void printMinus5Sequence(){
        int[] array = new int[10];
        int a=5;
        for (int i = 0; i <array.length ; i++) {
            a-=5;
            array[i]= a;
            System.out.print(array[i]+" ");
        }
    }
    public void printMinus5Sequence1() {
        int a = 5;
        int b = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(b+" ");
            b += -a;
        }
    }

    public int multiplicationTable(int x){  //n = 125 125 x 2 = 250 125 x 3 = 375 ..
        int rez=0;
        for (int i = 1; i <= 10; i++) {
            rez=x*i;
            System.out.println(rez);
        }
        return x;
    }

    public void arrayOdd() {
        int n = 10;
        int[] oddNumbers = new int[n];
        for (int i = 0, num=1; i <n; i++, num+=2) {
            oddNumbers[i]=num;
        }
            System.out.println(Arrays.toString(oddNumbers));
        }

        public int minArrayNum(int n) {
            int[] array = generateRandomArray(n);
            System.out.println(Arrays.toString(array));
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            System.out.println(min);
            return min;
        }

    public int maxArrayNum(int n) {
        int[] array = generateRandomArray(n);
        System.out.println(Arrays.toString(array));
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
        return max;
    }

    private int[] generateRandomArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        return array;
    }

    public int replaceMaxAndMin(int n) {
        int[] array = generateRandomArray(n);
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[i] = min;
            } else if (array[i] == min) {
                array[i] = max;
            }
        }

        int neytral = max;
        max = min;
        min = neytral;

        System.out.println(Arrays.toString(array));
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        return n;
    }

}







