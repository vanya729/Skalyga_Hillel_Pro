package lessons9.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = List.of("Samsung", "Apple", "Xiaomi", "Samsung","Samsung","Poco","Samsung", "Sigma","Samsung");
        String patStr = "Samsung";
        int countWorlds = countOccurance(stringList, patStr);

        System.out.println("Length '" + patStr + "'\ncount = " + countWorlds);

    }
    public static int countOccurance(List<String> list, String pattern){
        int count =0;
        for (String str : list){
            if (str.equals(pattern)){
                count++;
            }
        }
        return count;
    }
}
