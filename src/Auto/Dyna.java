package Auto;

import Gear.*;

public class Dyna extends Car {

    private final Model model = Model.CARGO;
    private int loadCapacity;
    Socket socket;

    public class Socket {
        public void chargePhone() {
            System.out.println("Телефон заряжается");
        }
    }

    public Dyna(double price, String color, int maxSpeed, TransmissionType transmissionType,
                boolean isMoving, Wheel[] wheels, GasTank gasTank, Engine engine,
                Electrician electrician, Lights lights, int loadCapacity) {
        super(price, color, maxSpeed, transmissionType, isMoving, wheels, gasTank, engine, electrician, lights);
        this.loadCapacity = loadCapacity;
        this.socket = new Socket();
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
}
