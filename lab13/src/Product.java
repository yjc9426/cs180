/**
 * Created by yuan105 on 7/26/16.
 */
public abstract class Product {
    String productName;

    public Product(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }
    public abstract double getPrice();
}
