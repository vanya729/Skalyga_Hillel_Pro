package lessons10.homework1Plurals;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        coffeeOrderBoard.add("Vanya");
        coffeeOrderBoard.add("Alex");
        coffeeOrderBoard.add("Oleg");

        coffeeOrderBoard.draw();

        Map<Integer, Order> orders = coffeeOrderBoard.getOrders();
        System.out.println("Current orders: " + orders);

        coffeeOrderBoard.deliver();
        System.out.println("After delivery:");
        orders = coffeeOrderBoard.getOrders();
        System.out.println("Current orders: " + orders);

        int orderNum = 2;
        coffeeOrderBoard.deliverWithNum(orderNum);
        System.out.println("After delivering order number " + orderNum + ":");
        orders = coffeeOrderBoard.getOrders();
        System.out.println("Current orders: " + orders);

        coffeeOrderBoard.draw();

    }
}

