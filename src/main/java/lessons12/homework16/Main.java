package lessons12.homework16;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        findSymbolOccurance("Hello", 'l');
        System.out.println("------------------------------");

        int rez = findWordPosition("Hello", "lo");
        System.out.println(rez);
        System.out.println("------------------------------");
        stringReverse("Hello");
        System.out.println("------------------------------");
        boolean result= isPalindrome("ORGO");
        System.out.println(result);
        System.out.println("------------------------------");
        arrayGame();
        System.out.println("------------------------------");
    }

    public static int findSymbolOccurance(String str, char a){
        int count =0;
        for (int i = 1; i <str.length(); i++) {
            if (str.charAt(i)==a){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static int findWordPosition(String sourse, String target) {
        if (sourse.contains(target)) {
            return sourse.indexOf(target);
        } else {
            return -1;
        }
    }

    public static void stringReverse(String str){
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length/2; i++) {
            char n = arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i]=n;
        }
        System.out.println(arr);
    }

    public static boolean isPalindrome(String str){
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!= arr[arr.length -i -1]){
                return false;
            }
        }
        return true;
    }

    public static void arrayGame(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(words));
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String riddledWord = words[randomIndex];
        int wordlength = riddledWord.length();

        System.out.println(riddledWord);
        System.out.print("Enter your guess: ");
        String userWord = scanner.nextLine().toLowerCase();
//        System.out.println(wordlength);

        while (true) {
            if (riddledWord.equals(userWord)) {
                System.out.println("You win!!!");
                break;
            } else {
                String revealedLetters = "";
                for (int i = 0; i < wordlength; i++) {
                    if (i < userWord.length() && riddledWord.charAt(i) == userWord.charAt(i)) {
                        revealedLetters += riddledWord.charAt(i);
                    } else {
                        revealedLetters += "#";
                    }
                }
                if (revealedLetters.length() < 15) {
                    revealedLetters += "#".repeat(15 - revealedLetters.length());
                }
                System.out.println(revealedLetters);
                System.out.print("Try again: ");
                userWord = scanner.nextLine().toLowerCase();
            }
        }

    }
}

