package Auto;

import Gear.*;

public class Camry extends Car {

    private final Model model = Model.PASSENGER;
    private boolean isCruiseControlOn;
    Usb usb;

    public class Usb {

        public void connectMusic() {
            System.out.println("Музыка подключена");
        }
    }

    public Camry(double price, String color, int maxSpeed, TransmissionType transmissionType, boolean isMoving,
                 Wheel[] wheels, GasTank gasTank, Engine engine, Electrician electrician,
                 Lights lights, boolean isCruiseControlOn) {
        super(price, color, maxSpeed, transmissionType, isMoving, wheels, gasTank, engine, electrician, lights);
        this.isCruiseControlOn = isCruiseControlOn;
        usb = new Usb();
    }

    public Model getModel() {
        return model;
    }

    public boolean isCruiseControlOn() {
        return isCruiseControlOn;
    }

    public void setCruiseControlOn(boolean cruiseControlOn) {
        isCruiseControlOn = cruiseControlOn;
    }
}
