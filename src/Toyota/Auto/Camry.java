package Toyota.Auto;

import Toyota.Gear.*;

public class Camry extends Car {

    private final Model model = Model.PASSENGER;
    private boolean isCruiseControlOn;
    public Usb usb;

    public static class Usb {

        public void connectMusic() {
            System.out.println("Музыка подключена");
        }
    }

    public Camry(double price, String color, int maxSpeed, TransmissionType transmissionType, boolean isMoving,
                 Wheel[] wheels, GasTank gasTank, Engine engine, Electrics electrics,
                 HeadLights headLights, boolean isCruiseControlOn) {
        super(price, color, maxSpeed, transmissionType, isMoving, wheels, gasTank, engine, electrics, headLights);
        this.isCruiseControlOn = isCruiseControlOn;
        usb = new Usb();
    }

    public Model getModel() {
        return model;
    }

    public boolean isCruiseControlOn() {
        return isCruiseControlOn;
    }

    public void changeCruiseControl() {
        this.isCruiseControlOn = !isCruiseControlOn;
    }
}
