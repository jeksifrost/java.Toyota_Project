package Toyota.Auto;

import Toyota.Factories.Country;
import Toyota.Gear.*;

public class Dyna extends Car {

    private final Model model = Model.CARGO;
    private int loadCapacity;
    Socket socket;

    public class Socket {
        public void chargePhone() {
            System.out.println("Телефон заряжается");
        }
    }

    public Dyna(double price, Color color, int maxSpeed, TransmissionType transmissionType,
                boolean isMoving, Wheel[] wheels, GasTank gasTank, Engine engine,
                Electrics electrics, HeadLights headLights, int loadCapacity, Country country) {
        super(price, color, maxSpeed, transmissionType, isMoving, wheels, gasTank, engine, electrics, headLights, country);
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
