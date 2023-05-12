package lessons5.part2Inheritance;

public class Dog extends Animal{
    private static int countDog =0;

    public Dog(String name) {
        super(name);
        countDog++;
    }

    public static int getCountDog() {
        System.out.println("Count dog: "+countDog);
        return countDog;
    }

    @Override
    public void run(int distance) {
        super.run(distance);
        if (distance>=500){
            System.out.println(name + "Say: "+"this is very far to run");
        }else {
            System.out.println(name+ " Say: "+ "lets go run " +distance+"m");
        }
    }

    @Override
    public void swim(int distance) {
        super.swim(distance);

        if (distance>=10){
            System.out.println(name + " Say: "+"this is very far to swim");
        }else {
            System.out.println(name+ " Say: " + "i like swim, it`s only "+ distance+"m" );
        }
    }


}
