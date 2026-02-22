package problem03;

public class Product implements ICloneable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product myClone() {
        return new Product(name, price);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
