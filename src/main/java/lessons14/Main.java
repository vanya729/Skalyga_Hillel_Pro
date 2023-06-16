package lessons14;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ex ex= new Ex();

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> word = Arrays.asList("one", "two","ten", "six");
        List<String> wordAll = Arrays.asList("one", "TWO","tenn","hello" ,"SIX","halo","NINE");


        System.out.println(ex.ex1AvarageSum(list));
        System.out.println("-------------------------------------------------------------------");
        System.out.println(ex.ex2UpperCase(word));
        System.out.println("-------------------------------------------------------------------");
        System.out.println(ex.ex3LowerCase(wordAll));
    }
}
