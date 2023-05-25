package lessons8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        CollectionIml cIml = new CollectionIml();
        cIml.add("Vanya");
        cIml.add("Skalyga");
        cIml.add(1, "Oleg");

        System.out.println("Array size: "+cIml.size());
        System.out.println("Add data:");
        System.out.println(cIml.get(0));
        System.out.println(cIml.get(1));
        System.out.println(cIml.get(2));

        System.out.println(cIml.contain("Alex"));
        System.out.println(cIml.contain("Vanya"));
        cIml.delete("Skalyga");
        System.out.println("\nAfter delete data size: "+cIml.size());
        System.out.println(cIml.get(0));
        System.out.println(cIml.get(1));
        System.out.println(cIml.clear());
        System.out.println("Size: "+cIml.size());

    }
}
