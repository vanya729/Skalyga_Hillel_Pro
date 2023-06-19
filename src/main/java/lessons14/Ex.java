package lessons14;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex {

    public OptionalDouble ex1AvarageSum(List<Integer> values) {
        IntStream intStream = values.stream().mapToInt(Integer::intValue);
        OptionalDouble res = intStream.average();
        return res;
    }

    public List<Pair> ex2UpperCase(List<String> values) {
         return values.stream()
                 .map(lCase -> new Pair(lCase, lCase.toUpperCase()))
                 .collect(Collectors.toList());
    }

    public List<String> ex3LowerCase(List<String> values){
        return values.stream()
                .filter(s -> s.equals(s.toLowerCase())&& s.length()==4)
                .toList();
    }
}
