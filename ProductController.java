package byggemarket.controller;

import java.util.ArrayList;
import byggemarket.model.Product;
import byggemarket.model.ProductContainer;

public class ProductController {
    
    private ProductContainer instance;
    private ArrayList<Product> products;
    
    public ProductController() {
        this.products = new ArrayList<>();
        this.instance = ProductContainer.getInstance();
    }

    //find product
    public Product findProduct(int productNo) {
        Product product = instance.findProduct(productNo);
        if(product != null){
        return product;
    }else{
            return null;
        }
    }

    //Save product
    //ToDo manglende product instanciering
    public void addProduct(Product product) {
        instance.saveProduct(product);
    }
}
