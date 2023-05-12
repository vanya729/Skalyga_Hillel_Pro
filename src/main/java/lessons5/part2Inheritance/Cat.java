package lessons5.part2Inheritance;

public class Cat extends Animal {
    private static int countCat=0;
    public Cat(String name) {
        super(name);
        countCat++;
    }

    public static int getCountCat() {
        System.out.println("Cat count: "+countCat);
        return countCat;
    }

    @Override
    public void run(int distance) {
        if (distance>=200){
            System.out.println(getName()+" Say: " +"I'm lazy, run alone");
        }else {
            System.out.println(getName()+" Say: " +" Lets go ran "+ distance+"m");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance>=0){
            System.out.println(getName()+" Say: " +"I'm a cat, I can't swim");
        }
    }
}
