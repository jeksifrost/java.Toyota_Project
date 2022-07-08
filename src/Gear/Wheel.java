package Gear;

public class Wheel {

    private double price;
    private int diameter;
    private boolean isPunctured;

    public Wheel(double price, int diameter, boolean isPunctured) {
        this.price = price;
        this.diameter = diameter;
        this.isPunctured = isPunctured;
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

    public boolean isPunctured() {
        return isPunctured;
    }

    public void setPunctured(boolean punctured) {
        isPunctured = punctured;
    }
}
