package lessons7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    DinamicArray dinamicArray= new DinamicArray();
        dinamicArray.add("Vanya");
        dinamicArray.add("Skalyga");
        dinamicArray.add(1, "Oleg");

        System.out.println("Array size: "+dinamicArray.getSize());
        System.out.println("Add data:");
        System.out.println(dinamicArray.get(0));
        System.out.println(dinamicArray.get(1));
        System.out.println(dinamicArray.get(2));


        dinamicArray.delete(1);
        System.out.println("\nAfter delete data size: "+dinamicArray.getSize());

        System.out.println(dinamicArray.get(0));
        System.out.println(dinamicArray.get(1));
    }
}
