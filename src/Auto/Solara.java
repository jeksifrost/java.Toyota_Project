package Auto;

import Gear.*;

public class Solara extends Car {

    private final Model model = Model.CABRIOLET;
    private boolean isRoofDown;
    Refrigerator refrigerator;


    public class Refrigerator {

        public void coolDrink() {
            System.out.println("Напиток охлаждён");
        }
    }

    public Solara(double price, String color, int maxSpeed, TransmissionType transmissionType,
                  boolean isMoving, Wheel[] wheels, GasTank gasTank, Engine engine, Electrician electrician,
                  Lights lights, boolean isRoofDown) {
        super(price, color, maxSpeed, transmissionType, isMoving, wheels, gasTank, engine, electrician, lights);
        this.isRoofDown = isRoofDown;
        this.refrigerator = new Refrigerator();
    }

    public Model getModel() {
        return model;
    }

    public boolean isRoofDown() {
        return isRoofDown;
    }

    public void setRoofDown(boolean roofDown) {
        isRoofDown = roofDown;
    }
}
