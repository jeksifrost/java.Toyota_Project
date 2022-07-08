package Gear;

public class Lights {

    private double price;
    boolean isWorkable;

    public Lights(double price, boolean isWorkable) {
        this.price = price;
        this.isWorkable = isWorkable;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWorkable() {
        return isWorkable;
    }

    public void setWorkable(boolean workable) {
        isWorkable = workable;
    }
}
