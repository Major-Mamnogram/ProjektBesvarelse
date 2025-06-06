package byggemarket.model;

import java.util.ArrayList;

public class ProductContainer {
    private ArrayList<Product> products;
    private static ProductContainer instance;

    //create pdocut container
    private ProductContainer() {
        products = new ArrayList<>();
    }

    // Singleton getInstance method
    public static ProductContainer getInstance() {
        if (instance == null) {
            instance = new ProductContainer();
        }
        return instance;
    }

    // Find product by productNo
    public Product findProduct(int productNo) {
        for (Product p : products) {
            if (p.getProductNO() == productNo) {
                return p;
            }
        }
        return null;
    }

    // Save a product (add or update)
    public void saveProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductNO() == product.getProductNO()) {
                
                products.set(i, product);
                return;
            }
        }
        products.add(product);
    }
}
