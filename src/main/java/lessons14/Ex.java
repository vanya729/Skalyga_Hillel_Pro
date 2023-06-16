package lessons14;

import java.util.List;

public class Ex {

    public double ex1AvarageSum(List<Integer> values) {
        return values.stream()
                .mapToDouble(Integer::doubleValue)
                .sum() / values.size();
    }
    public List<String> ex2UpperCase(List<String> values) {
         return values.stream()
                .map(s -> "{\""+s+" : " + s.toUpperCase()+"\"}")
                .toList();

    }
    public List<String> ex3LowerCase(List<String> values){
        return values.stream()
                .filter(s -> s.equals(s.toLowerCase())&& s.length()==4)
                .toList();
    }
}
