package Auto;

import Gear.*;
import Exception.StartCarException;

public abstract class Car {

    private double price;
    private String color;
    private int maxSpeed;
    private TransmissionType transmissionType;
    private boolean isMoving;

    private Wheel[] wheels;
    private GasTank gasTank;
    private Engine engine;
    private Electrician electrician;
    private Lights lights;

    public Car(double price, String color, int maxSpeed, TransmissionType transmissionType, boolean isMoving,
               Wheel[] wheels, GasTank gasTank, Engine engine, Electrician electrician, Lights lights) {
        this.price = price;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmissionType = transmissionType;
        this.isMoving = isMoving;
        this.wheels = wheels;
        this.gasTank = gasTank;
        this.engine = engine;
        this.electrician = electrician;
        this.lights = lights;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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

    public Electrician getElectrician() {
        return electrician;
    }

    public void setElectrician(Electrician electrician) {
        this.electrician = electrician;
    }

    public Lights getLights() {
        return lights;
    }

    public void setLights(Lights lights) {
        this.lights = lights;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void startMoving() throws StartCarException {
        for (Wheel wheel : this.wheels) {
            if (wheel.isPunctured()) {
                throw new StartCarException("Есть проколотое колесо");
            }
        }
        if (this.wheels.length != 4) {
            throw new StartCarException("Не хватает колёс");
        } else if (this.gasTank.getAmountOfGas() <= 0) {
            throw new StartCarException("Бензобак пуст");
        } else if (!this.engine.isWorkable()) {
            throw new StartCarException("Двигатель не работает");
        } else if (!this.electrician.isWorkable()) {
            throw new StartCarException("Электрика не работает");
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
