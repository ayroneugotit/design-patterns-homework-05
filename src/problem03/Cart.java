package problem03;

import java.util.HashMap;
import java.util.Map;

public class Cart implements ICloneable<Cart> {
    private Map<Product, Integer> products;

    public Cart() {
        this.products = new HashMap<>();
    }

    public Cart(Map<Product, Integer> products) {
        this.products = products;
    }

    public Cart myClone() {
        Map<Product, Integer> clonedProducts = new HashMap<>();
        for (Map.Entry<Product, Integer> e : products.entrySet()) {
            clonedProducts.put(e.getKey().myClone(), e.getValue());
        }
        return new Cart(clonedProducts);
    }

    private Map.Entry<Product, Integer> getProductEntry(String productName) {
        for (Map.Entry<Product, Integer> e : products.entrySet()) {
            if (e.getKey().getName().equals(productName)) {
                return e;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        addProduct(product, 1);
    }

    public void addProduct(Product product, int quantity) {
        Map.Entry<Product, Integer> productEntry = getProductEntry(product.getName());
        if (productEntry != null) {
            productEntry.setValue(productEntry.getValue() + quantity);
        } else {
            products.put(product, quantity);
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Map.Entry<Product, Integer> e : products.entrySet()) {
            totalPrice += e.getKey().getPrice() * e.getValue();
        }
        return totalPrice;
    }
}
