package Toyota.Auto;

import Toyota.Gear.*;

public class Hiance extends Car {

    private final Model model = Model.CARGO;
    private int loadCapacity;
    private Wheel spareWheel;

    public Hiance(double price, String color, int maxSpeed, TransmissionType transmissionType,
                  boolean isMoving, Wheel[] wheels, GasTank gasTank, Engine engine,
                  Electrics electrics, HeadLights headLights, int loadCapacity, Wheel spareWheel) {
        super(price, color, maxSpeed, transmissionType, isMoving, wheels, gasTank, engine, electrics, headLights);
        this.loadCapacity = loadCapacity;
        this.spareWheel = spareWheel;
    }

    public Model getModel() {
        return model;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Wheel getSpareWheel() {
        return spareWheel;
    }

    public void setSpareWheel(Wheel spareWheel) {
        this.spareWheel = spareWheel;
    }
}
