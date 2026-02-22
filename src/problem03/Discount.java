package problem03;

public class Discount implements ICloneable<Discount> {
    private double percent;

    public Discount(double percent) {
        this.percent = percent;
    }

    public Discount myClone() {
        return new Discount(percent);
    }
}
