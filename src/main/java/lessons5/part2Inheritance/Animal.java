package lessons5.part2Inheritance;

public class Animal{
    String name;

    public static int countAnimal =0;
    public Animal(String name) {
        this.name = name;
        countAnimal++;
    }

    public static int getCountAnimal() {
        System.out.println("Count animal: "+countAnimal);
        return countAnimal;
    }

    public void run(int distance){
    }

    public void swim(int distance){
    }
}
