package Toyota.Factories;

import Toyota.Gear.*;

public class GearFactory {

    private Country country;

    public GearFactory(Country country) {
        this.country = country;
    }

    public Electrics createElectrics() {
        return new Electrics(false);
    }

    public Engine createEngine() {
        return new Engine(false);
    }
    
    public GasTank createGasTank() {
        return new GasTank(0);
    }
    
    public HeadLights createHeadLights() {
        return new HeadLights(false);
    }
    
    public Wheel[] createWheels(WheelRadius wheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel(false, wheelRadius);
        }
        return wheels;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
