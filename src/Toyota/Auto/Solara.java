package Toyota.Auto;

import Toyota.Gear.*;

public class Solara extends Car {

    private final Model model = Model.CABRIOLET;
    private boolean isRoofUp;
    private MiniFridge miniFridge;

    public static class MiniFridge {

        public void coolDrink() {
            System.out.println("Напиток охлаждён");
        }
    }

    public Solara(double price, String color, int maxSpeed, TransmissionType transmissionType,
                  boolean isMoving, Wheel[] wheels, GasTank gasTank, Engine engine, Electrics electrics,
                  HeadLights headLights, boolean isRoofUp) {
        super(price, color, maxSpeed, transmissionType, isMoving, wheels, gasTank, engine, electrics, headLights);
        this.isRoofUp = isRoofUp;
        this.miniFridge = new MiniFridge();
    }

    public Model getModel() {
        return model;
    }

    public void changeRoofStatus() {
        this.isRoofUp = !this.isRoofUp;
    }

    public boolean isRoofUp() {
        return isRoofUp;
    }
}
