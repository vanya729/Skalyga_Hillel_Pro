package lessons5.part2Inheritance;

public class Animal{
    private String name;

    public static int countAnimal =0;
    public Animal(String name) {
        this.name = name;
        countAnimal++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
