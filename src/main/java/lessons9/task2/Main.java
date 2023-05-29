package lessons9.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> list = toList(array);
        String[] str ={"H","E","L","L","O"};
        List<String> stringList = toList(str);

    }
    public static <T> List<T> toList(T[] array) {
        System.out.println("Array values: " + Arrays.toString(array));
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        /*
          for (T val : array) {
            list.add(val);
        }
         */
        System.out.println("List values: " + list);
        System.out.println("--------------------------------------");
        return list;
    }
}

