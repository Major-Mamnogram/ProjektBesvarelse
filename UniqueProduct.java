package byggemarket.model;

public class UniqueProduct extends Product {
    private String serialNumber;

    public UniqueProduct(int productNo, String description, String category, int sellingPrice, int costPrice, String serialNumber) {
        super(productNo, description, category, sellingPrice, costPrice);
        this.serialNumber = serialNumber;
    }

    //getter/setter serialNumber
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
