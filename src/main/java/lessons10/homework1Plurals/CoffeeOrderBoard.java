package lessons10.homework1Plurals;

import java.util.HashMap;
import java.util.Map;

public class CoffeeOrderBoard {
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
    }


    public void deliver(){
        if (!listOrder.isEmpty()){
            int orderNumKey = listOrder.keySet().iterator().next();
            listOrder.remove(orderNumKey);
            System.out.println( "Delivered order number: "+ orderNumKey);
        }else {
            System.out.println("No orders in the queue.");
        }
    }

    public void deliverWithNum(int orderNum){
        if (listOrder.containsKey(orderNum)){
            listOrder.remove(orderNum);
            System.out.println("Delivered order number: " + orderNum);
        }else {
            System.out.println("Order number " + orderNum + " does not exist.");
        }
    }

    public void draw() {
        for (Order order :  listOrder.values()) {
            System.out.println("===============================");
            System.out.println(order.getNumber()+ " | " + order.getName());
        }
        System.out.println("===============================");
    }

    public Map<Integer, Order> getOrders() {
        return listOrder;
    }
}
