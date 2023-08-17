package lessons25.homework1Plurals;


public class Order {

    int number;
    String name;


    public Order(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}