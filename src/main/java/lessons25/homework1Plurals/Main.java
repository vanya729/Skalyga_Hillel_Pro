package lessons25.homework1Plurals;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class Main {
    private static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");
    public static void main(String[] args) {

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        coffeeOrderBoard.add("Vanya");
        coffeeOrderBoard.add("Alex");
        coffeeOrderBoard.add("Oleg");

        coffeeOrderBoard.draw();

        Map<Integer, Order> orders = coffeeOrderBoard.getOrders();
        loggerInfo.info("Current orders: " + orders);

        coffeeOrderBoard.deliver();
        loggerInfo.info("After delivery:");
        orders = coffeeOrderBoard.getOrders();
        loggerInfo.info("Current orders: " + orders);

        int orderNum = 2;
        int orderNumForError = 157;
        coffeeOrderBoard.deliverWithNum(orderNum);
        coffeeOrderBoard.deliverWithNum(orderNumForError);
        loggerInfo.info("After delivering order number " + orderNum + ":");
        orders = coffeeOrderBoard.getOrders();
        loggerInfo.info("Current orders: " + orders);

        coffeeOrderBoard.draw();

    }
}

