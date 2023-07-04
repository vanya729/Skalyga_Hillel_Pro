package lessons14;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;


class ExTest {


        Ex ex = new Ex();

        @Test
        @DisplayName("Correct average value")
        public void ex1Test1(){
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
            OptionalDouble averageValue = ex.ex1AvarageSum(list);
            assertEquals(3.5, averageValue.getAsDouble(), 0.001);
        }

        @Test
        @DisplayName("Correct average value with negative number")
        public void ex1Test2(){
            List<Integer> list = Arrays.asList(-1, -2, -3, -4, -5, -6);
            OptionalDouble averageValue = ex.ex1AvarageSum(list);
            assertEquals(-3.5 ,averageValue.getAsDouble(), 0.001);
        }

        @Test
        @DisplayName("Correct ex2 test1")
        public void ex2Test1(){
            List<String> values = Arrays.asList("one", "two", "ten", "six");
            List<Pair> expected = new ArrayList<>(Arrays.asList(
                    new Pair("one", "ONE"),
                    new Pair("two", "TWO"),
                    new Pair("ten", "TEN"),
                    new Pair("six", "SIX")
            ));
            List<Pair> result = ex.ex2UpperCase(values);
            assertEquals(expected,result);
//            assertEquals(expected.size(), result.size());
//            for (int i = 0; i < expected.size(); i++) {
//                assertEquals(expected.get(i), result.get(i));
//            }
        }

        @Test
        @DisplayName("Correct ex2 test2 empty List")
        public void ex2Test2() {
            List<String> values = new ArrayList<>();
            List<Pair> expected = new ArrayList<>(Arrays.asList());
            List<Pair> result = ex.ex2UpperCase(values);
            assertEquals(expected, result);
        }

        @Test
        @DisplayName("Correct ex3 test1")
        public void ex3Test1() {
            List<String> words = Arrays.asList("apple", "banana", "caat", "Dog", "elephant");
            List<String> lowerCaseWords = ex.ex3LowerCase(words);
            List<String> expectedWords = Arrays.asList("caat");
            assertEquals(expectedWords, lowerCaseWords);
        }

        @Test
        @DisplayName("Correct ex3 test2 empty List")
        public void ex3Test2() {
            List<String> words = Arrays.asList();
            List<String> lowerCaseWords = ex.ex3LowerCase(words);
            List<String> expectedWords = Arrays.asList();
            assertEquals(expectedWords, lowerCaseWords);
        }

    }
