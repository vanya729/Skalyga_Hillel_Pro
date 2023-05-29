package lessons9.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>();
    integers.add(1);
    integers.add(2);
    integers.add(1);
    integers.add(4);
    integers.add(4);
    integers.add(1);
    integers.add(5);
    integers.add(1);

    List<Integer> newIntLit = findUnique(integers);
    }
    public static List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> list = new ArrayList<>();
        for (int val : numbers){
            if (!list.contains(val)){
                list.add(val);
            }
        }
        System.out.println(list);
        return list;
    }
}

