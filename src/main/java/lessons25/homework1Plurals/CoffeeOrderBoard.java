package lessons25.homework1Plurals;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;


@Slf4j
public class CoffeeOrderBoard {

    private static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");
    private static final Logger loggerWarn = LoggerFactory.getLogger("logger.warn");
    private static final Logger loggerError = LoggerFactory.getLogger("logger.error");

    Map<Integer, Order> listOrder;
    int lastOrder;

    public CoffeeOrderBoard() {
        listOrder = new HashMap<>();
        lastOrder=0;
    }

    public void add(String name){
        lastOrder++;
        Order newOrder = new Order(lastOrder, name);
        listOrder.put(lastOrder,newOrder);
        loggerInfo.info("Order added: " + newOrder);
    }

    public void deliver(){
        if (!listOrder.isEmpty()){
            int orderNumKey = listOrder.keySet().iterator().next();
            Order deliveredOrder = listOrder.remove(orderNumKey);
            loggerInfo.info("Delivered order: " + deliveredOrder);
        }else {
            loggerInfo.info("No orders in the queue.");
            loggerError.error("No orders in the queue.");
        }
    }

    public void deliverWithNum(int orderNum) {
        if (listOrder.containsKey(orderNum)) {
            Order deliveredOrder = listOrder.remove(orderNum);
            loggerInfo.info("Delivered order: " + deliveredOrder);
        } else {
            loggerInfo.info("Order number " + orderNum + " does not exist.");
            loggerError.error("Order number " + orderNum + " does not exist.");
        }
    }

    public void draw() {
        for (Order order : listOrder.values()) {
            loggerInfo.info("===============================");
            loggerInfo.info(order.getNumber() + " | " + order.getName());
        }
        log.info("===============================");
    }

    public Map<Integer, Order> getOrders() {
        return listOrder;
    }
}
