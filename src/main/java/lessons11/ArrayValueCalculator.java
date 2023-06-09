package lessons11;

import lessons11.exceptions.ArrayDataException;
import lessons11.exceptions.ArraySizeException;

public class ArrayValueCalculator{

    public int doCalc(String[][] arr) throws ArraySizeException, ArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new ArraySizeException("The array must be 4x4 in size");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Error data  [" + i + "][" + j + "]: " + arr[i][j]);
                }
            }
        }
        return sum;
    }
}