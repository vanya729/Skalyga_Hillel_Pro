package lessons9.task4Part2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("Samsung", "Xiaomi","Apple", "Xiaomi", "Samsung","Apple",
                "Samsung","Xiaomi", "Poco", "Samsung", "Sigma", "Samsung");
        List<Word> occurrencesfind = findOccurance(stringList);

        for (Word occurrence : occurrencesfind) {
            System.out.println("Name: `" + occurrence.getName() + "` , occurrence: " + occurrence.getCount());
        }
    }

    public static List<Word> findOccurance(List<String> list) {
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

        return list1;
    }
    public static class Word {
        String name;
        int count;

        public Word(String name) {
            this.name = name;
            this.count = 1;
        }

        public String getName() {
            return name;
        }

        public int getCount() {
            return count;
        }
    }
}
