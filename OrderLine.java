package byggemarket.model;

public class OrderLine {
    private Product p;
    private int quantity;
    
    // constructor
    public OrderLine(Product p, int qty) {
        this.p = p;
        this.quantity = qty;
    }

    
    //product getter/setter
    public Product getProduct() {
        return p;
    }
    
    public void setProduct(Product p) {
        this.p = p;
    }
    
    // quantity getter/setter
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
