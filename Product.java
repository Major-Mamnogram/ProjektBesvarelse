package byggemarket.model;

public class Product {
    private int productNO;
    private String description;
    private String category;
    private int sellingPrice;
    private int costPrice;

    // Constructor
    public Product(int productNO, String description, String category, int sellingPrice, int costPrice) {
        this.productNO = productNO;
        this.description = description;
        this.category = category;
        this.sellingPrice = sellingPrice;
        this.costPrice = costPrice;
    }

    // productNO getter/setter
    public int getProductNO() {
        return productNO;
    }
    public void setProductNO(int productNO) {
        this.productNO = productNO;
    }

    // description getter/setter
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // category getter/setter
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    // sellingPrice getter/setter
    public int getSellingPrice() {
        return sellingPrice;
    }
    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    // costPrice getter/setter
    public int getCostPrice() {
        return costPrice;
    }
    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }
    }