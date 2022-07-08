package Gear;

public class Electrician {

    private double price;
    boolean isWorkable;

    public Electrician(double price, boolean isWorkable) {
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
