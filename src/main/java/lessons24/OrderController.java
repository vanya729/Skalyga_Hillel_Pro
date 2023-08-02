package lessons24;

import com.google.gson.Gson;

import static spark.Spark.*;

import lessons24.data.Order;
import lessons24.data.OrderRepository;
import lessons24.data.Product;
import lessons24.status.StandardResponse;
import lessons24.status.StatusResponse;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//http://localhost:4567/order
public class OrderController {
    private static List<Order> orderList= new ArrayList<>();
    public static void main(String[] args) {


        OrderRepository orderRepository = new OrderRepository();
        Gson gson = new Gson();

        get("/order", (request, response) -> {
            response.type("application/json");
            return new Gson().toJsonTree(orderList);
        });


        get("/order/:uuid", (request, response) -> {
            response.type("application/json");
            UUID uuid = UUID.fromString(request.params(":uuid"));

            return new Gson().toJsonTree(orderList.stream()
                    .filter(o -> o.getUuid().equals(uuid))
                    .findFirst().get());
        });

        post("/order", (request, response)  -> {
            response.type("application/json");

            Product product = new Gson().fromJson(request.body(), Product.class);
            product.setUUID(UUID.randomUUID());

            Order order = new Order();
            order.setUuid(UUID.randomUUID());
            order.setCreateAt(new Timestamp(System.currentTimeMillis()));
            order.setUpdateAt(new Timestamp(System.currentTimeMillis()));
            order.getProducts().add(product);
            order.setCost(order.getProducts().stream().mapToDouble(Product::getCost).sum());

            orderList.add(order);
            return new Gson().toJsonTree(order);
        });

        put("/order/:uuid", (request, response)  -> {
            response.type("application/json");
            UUID uuid = UUID.fromString(request.params(":uuid"));

            Order order = orderList.stream()
                    .filter(o -> o.getUuid().equals(uuid))
                    .findFirst().get();

            order.setUpdateAt(new Timestamp(System.currentTimeMillis()));


            Product product = new Gson().fromJson(request.body(), Product.class);
            product.setUUID(UUID.randomUUID());
            order.getProducts().add(product);
            order.setCost(order.getProducts().stream().mapToDouble(Product::getCost).sum());

            return new Gson().toJsonTree(order);
        });

        delete("/order/:uuid", (request, response) -> {
            response.type("application/json");
            UUID uuid = UUID.fromString(request.params(":uuid"));

            Order orderToRemove = orderList.stream()
                    .filter(o -> o.getUuid().equals(uuid))
                    .findFirst()
                    .orElse(null);

            if (orderToRemove == null) {
                response.status(404);
                return gson.toJson(new StandardResponse(StatusResponse.ERROR, "Order not found"));
            }

            orderList.remove(orderToRemove);
            return gson.toJson(new StandardResponse(StatusResponse.SUCCESS, "Order deleted successfully"));
        });
    }
}