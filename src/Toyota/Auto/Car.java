package Toyota.Auto;

import Toyota.Gear.*;
import Toyota.Exception.StartCarException;

public abstract class Car {

    private double price;
    private Color color;
    private int maxSpeed;
    private TransmissionType transmissionType;
    private boolean isMoving;

    private Wheel[] wheels;
    private GasTank gasTank;
    private Engine engine;
    private Electrics electrics;
    private HeadLights headLights;

    public Car(double price, Color color, int maxSpeed, TransmissionType transmissionType, boolean isMoving,
               Wheel[] wheels, GasTank gasTank, Engine engine, Electrics electrics, HeadLights headLights) {
        this.price = price;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmissionType = transmissionType;
        this.isMoving = isMoving;
        this.wheels = wheels;
        this.gasTank = gasTank;
        this.engine = engine;
        this.electrics = electrics;
        this.headLights = headLights;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public GasTank getGasTank() {
        return gasTank;
    }

    public void setGasTank(GasTank gasTank) {
        this.gasTank = gasTank;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Electrics getElectrician() {
        return electrics;
    }

    public void setElectrician(Electrics electrics) {
        this.electrics = electrics;
    }

    public HeadLights getLights() {
        return headLights;
    }

    public void setLights(HeadLights headLights) {
        this.headLights = headLights;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void startMoving() throws StartCarException {
        for (Wheel wheel : this.wheels) {
            if (wheel.isBroken()) {
                throw new StartCarException("Есть проколотое колесо");
            }
        }
        if (this.wheels.length != 4) {
            throw new StartCarException("Не хватает колёс");
        } else if (this.gasTank.getCurrentVolume() <= 0) {
            throw new StartCarException("Бензобак пуст");
        } else if (!this.engine.isBroken()) {
            throw new StartCarException("Двигатель не работает");
        } else if (!this.electrics.isBroken()) {
            throw new StartCarException("Электрика не работает");
        } else if (!this.headLights.isBroken()) {
            throw new StartCarException("Фары не работают");
        } else {
            this.isMoving = true;
            System.out.println("Машина движется. Параметр isMoving = " + this.isMoving);
        }
    }

    public void stopMoving() {
        this.isMoving = false;
        System.out.println("Машина не движется. Параметр isMoving = " + this.isMoving);
    }

    public void lightsOn() {
        System.out.println("Фарю включены");
    }


}
