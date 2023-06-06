package lessons11;

import lessons11.exceptions.ArrayDataException;
import lessons11.exceptions.ArraySizeException;

public class Main  {
    public static void main(String[] args) throws  ArrayDataException, ArraySizeException {
        String[][] arr = {
                {"0","1","2","3"},
                {"4","5","6","7"},
                {"8","9","4","5"},
                {"1","3","7","6"},
        };

        String[][] arr1 = {
            {"0","1","2","3"},
            {"4","5","6","7"},
            {"8","9","QWERTY","5"},
            {"1","3","7","6"},
        };
        String[][] arr2 = {
                {"0","1","2","3"},
                {"4","5","6","7"},
                {"8","9","QWERTY","5"},
                {"1","3","7","6"},
                {"1","3","7","6"},
        };


        ArrayValueCalculator calculator = new ArrayValueCalculator();
        int r = calculator.doCalc(arr);
        System.out.println("Sum: "+ r);
        try {
            int res = calculator.doCalc(arr1);
            System.out.println(res);
        }catch (ArrayDataException e){
            System.out.println("Array data exception: " + e.getMessage());
        }catch (ArraySizeException e){
            System.out.println("Array size exception: " + e.getMessage());
        }

        try {
            int res1 = calculator.doCalc(arr2);
            System.out.println(res1);
        }catch (ArrayDataException e){
            System.out.println("Array data exception: " + e.getMessage());
        }catch (ArraySizeException e){
            System.out.println("Array size exception: " + e.getMessage());
        }
    }
}
