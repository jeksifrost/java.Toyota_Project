package Gear;

public class GasTank {

    private double price;
    private int amountOfGas;

    public GasTank(double price, int amountOfGas) {
        this.price = price;
        this.amountOfGas = amountOfGas;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmountOfGas() {
        return amountOfGas;
    }

    public void setAmountOfGas(int amountOfGas) {
        this.amountOfGas = amountOfGas;
    }
}
