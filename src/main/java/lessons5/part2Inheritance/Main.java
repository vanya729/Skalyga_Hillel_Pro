package lessons5.part2Inheritance;

public class Main {
    public static void main(String[] args) {


        Cat myrka = new Cat("Myrka");
        myrka.swim(10);
        myrka.run(201);
        System.out.println();
        Cat pushok = new Cat("Pushok");
        pushok.swim(2);
        pushok.run(134);



        System.out.println();
        Dog barsik = new Dog("Barsic");
        barsik.swim(100);
        barsik.run(700);
        System.out.println();

        Dog bosyak = new Dog("Bosyak");
        bosyak.swim(5);
        bosyak.run(150);

        System.out.println();
        Animal.getCountAnimal();
        Cat.getCountCat();
        Dog.getCountDog();
    }
}
