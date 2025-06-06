package byggemarket.controller;

import byggemarket.model.*;

public class OrderController {
    private OrderContainer orderContainer;
    private CustomerController customerController;
    private ProductController productController;
    private Order order;
    private Customer currentCustomer;

    //constructor
    public OrderController() {
        this.orderContainer = OrderContainer.getInstance();
        this.customerController = new CustomerController();
        this.productController = new ProductController();
    }
    //ToDo check if currentCustomer is set
        //ToDo create method to change order based on ID

    //create order
    public Order createOrder(){
        
        Order newOrder = new Order(currentCustomer);
        newOrder = orderContainer.addOrder(newOrder);
        this.order = newOrder;
        return newOrder;
    }
    
    //set customer name, phone
    public Customer setCustomer(String name, int phone){
        //ToDo add get current Customer
        Customer customer = customerController.findCustomer(name,phone);
        if (customer == null){
            customer = customerController.saveCustomer(name, phone);
        }
        this.currentCustomer = customer;
        this.order = null;
        return customer;
    }
    
    //add orderline
    public OrderLine addOrderLine(int productID, int qty){
        if(this.currentCustomer == null){
            return null;
        }
        Product product = productController.findProduct(productID);
        if(product == null){
            return null;
        }else{
            OrderLine orderLine = this.order.addOrderLine(product, qty);
            return orderLine;
        }
        
    }

    //end order with staffID
    public Order endOrder(int orderID) {
        Order order = orderContainer.findOrder(orderID);
        if (order == null) {
            return null;
        }
        if(!order.isDelivered()){
            return null;
        }

        order.setOrderStatus(true);
        return order;
    }
    
    
    //set delivery status
    public void setDelivered(boolean delivered){
        order.setDelivered(true);
    }
    
    //admin add product
    public Product adminAddProduct(int productNO, String description, String category, int sellingPrice, int costPrice){
        Product product = new Product(productNO, description, category, sellingPrice, costPrice);
        productController.addProduct(product);
        return product;
        
    }
}
