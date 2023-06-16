package lessons14;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMainClass {

    Ex ex = new Ex();

        @Test
        @DisplayName("Correct average value")
        public void ex1Test1(){
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
            double averageValue = ex.ex1AvarageSum(list);
            assertEquals(3.5, averageValue, 0.001);
        }

        @Test
        @DisplayName("Correct average value with negative number")
        public void ex1Test2(){
            List<Integer> list = Arrays.asList(-1, -2, -3, -4, -5, -6);
            double averageValue = ex.ex1AvarageSum(list);
            assertEquals(-3.5 ,averageValue, 0.001);
        }

        @Test
        @DisplayName("Correct ex2 test1")
        public void ex2Test1(){
                List<String> word = Arrays.asList("one", "two","ten", "six");
                List<String> expected = Arrays.asList("{\"one : ONE\"}", "{\"two : TWO\"}", "{\"ten : TEN\"}", "{\"six : SIX\"}");
                List<String> result = ex.ex2UpperCase(word);
                assertEquals(expected, result);
            }

        @Test
        @DisplayName("Correct ex2 test2 empty List")
        public void ex2Test2() {
            List<String> values = new ArrayList<>();
            List<String> expected = Arrays.asList();
            List<String> result = ex.ex2UpperCase(values);
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
