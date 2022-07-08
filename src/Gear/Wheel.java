package Gear;

public class Wheel {

    private double price;
    private int diameter;
    private boolean isIntact;

    public Wheel(double price, int diameter, boolean isIntact) {
        this.price = price;
        this.diameter = diameter;
        this.isIntact = isIntact;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public boolean isIntact() {
        return isIntact;
    }

    public void setIntact(boolean intact) {
        isIntact = intact;
    }
}
