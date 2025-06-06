package byggemarket.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    
    private int staffID;
    private List<OrderLine> orderLines;
    private boolean delivered;
    private int orderID;   
    private Customer customer;
    private boolean orderEnded;
    
    // Constructor
    public Order(Customer customer) {
        this.customer = customer;
        //this.staffID = staffID;
        this.orderLines = new ArrayList<>();
        this.delivered = false;
        this.orderEnded = false;
    }
    // Setter/getter for staffID
    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    // Setter/getter delivery status
    public boolean isDelivered() {
        return delivered;
    }
    //change deliverd status
    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    //getter for order status
    public boolean getOrderStatus() {
        return orderEnded;
    }
    //change order status
    public void setOrderStatus(boolean ended) {
        this.orderEnded = ended;
    }
    
    // Add order line
    public OrderLine addOrderLine(Product product, int qty) {
        OrderLine orderLine = new OrderLine(product, qty);
        orderLines.add(orderLine);
        return orderLine;
    }

    // Getter for the orderLines list
    public List<OrderLine> getOrderLines() {
        return orderLines;
    }
    // Getter/Setter for orderID
    public void setOrderID(int orderID){
        this.orderID = orderID;
    }
    
    public int getOrderID(){
        return orderID;
    }
    }

