package problem03;

public class Order implements ICloneable<Order> {
    private Cart cart;
    private double deliveryPrice;
    private Discount discount;

    public Order(Cart cart, double deliveryPrice, Discount discount) {
        this.cart = cart;
        this.deliveryPrice = deliveryPrice;
        this.discount = discount;
    }

    public Order myClone() {
        Cart clonedCart = cart.myClone();
        Discount clonedDiscount = discount.myClone();
        return new Order(clonedCart, deliveryPrice, clonedDiscount);
    }
}
