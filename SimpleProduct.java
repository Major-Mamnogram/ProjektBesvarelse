package byggemarket.model;

public class SimpleProduct extends Product {
    private String pname;
    private String manufacturer;
    private String model;
    private double rrp;
    private int quantity;
    private String supplierID;
    private String sku;

    // Constructor
    public SimpleProduct(int productNo, String description, String category, int sellingPrice, int costPrice, int quantity,
                         String pname, String manufacturer, String model, double rrp, int quantitySimple,
                         String supplierID, String sku) {
        super(productNo, description, category, sellingPrice, costPrice, quantity);
        this.pname = pname;
        this.manufacturer = manufacturer;
        this.model = model;
        this.rrp = rrp;
        this.quantity = quantitySimple;
        this.supplierID = supplierID;
        this.sku = sku;
    }

    // pname getter/setter
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }

    // manufacturer getter/setter
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // model getter/setter
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    // rrp getter/setter
    public double getRrp() {
        return rrp;
    }
    public void setRrp(double rrp) {
        this.rrp = rrp;
    }

    // quantity getter/setter
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // supplierID getter/setter
    public String getSupplierID() {
        return supplierID;
    }
    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    // sku getter/setter
    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }
}
