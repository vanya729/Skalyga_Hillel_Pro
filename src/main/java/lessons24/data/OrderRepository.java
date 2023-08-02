package lessons24.data;

import lessons24.data.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private List<Order> orders;

    public OrderRepository() {
        this.orders = new ArrayList<>();
    }

    public Order getOrderById(int id){
        for (Order order : orders){
            if (order.getUuid().equals(id)){
                return order;
            }
        }
        return null;
    }

    public List<Order> allOrder(){
        return orders;
    }

    public void addOrder(Order order){
        orders.add(order);
    }
}
