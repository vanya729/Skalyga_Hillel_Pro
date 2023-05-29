package lessons9.task4Part1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("Samsung", "Xiaomi","Apple", "Xiaomi", "Samsung","Apple",
                "Samsung","Xiaomi", "Poco", "Samsung", "Sigma", "Samsung");
        countOccurance(stringList);
    }

    public static void countOccurance(List<String> list) {
        List<Word> list1 = new ArrayList<>();
        for (String word : list) {
            boolean wordExists = false;
            for (Word w : list1) {
                if (w.name.equals(word)) {
                    w.count++;
                    wordExists = true;
                    break;
                }
            }
            if (!wordExists) {
                Word newWord = new Word(word);
                list1.add(newWord);
            }
        }
        for (Word w : list1) {
            System.out.println(w.name + ": " + w.count);
        }

    }
    public static class Word {
        String name;
        int count;

        public Word(String name) {
            this.name = name;
            this.count = 1;
        }
    }
}
