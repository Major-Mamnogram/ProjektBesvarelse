package byggemarket.model;

import java.util.ArrayList;

public class OrderContainer {

    private static OrderContainer instance;
    private ArrayList<Order> orders;
    
    //create order container
    private OrderContainer() {
        orders = new ArrayList<>();
    }

    //return instance
    public static OrderContainer getInstance() {
        if (instance == null) {
            instance = new OrderContainer();
        }
        return instance;
    }

    //addOrder
    public Order addOrder(Order newOrder) {
        int orderID = orders.size()+1;
        newOrder.setOrderID(orderID);
        orders.add(newOrder);
        return newOrder;
    }

    //find Order
    public Order findOrder(int orderID) {
        for (Order order : orders) {
            if (order.getOrderID() == orderID) {
                return order;
            }
        }
        return null;
    }

    //return array list of orders
    public ArrayList<Order> getOrders() {
        return orders;
    }
}
