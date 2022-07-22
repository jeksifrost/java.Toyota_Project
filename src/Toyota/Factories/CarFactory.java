package Toyota.Factories;

import Toyota.Auto.*;
import Toyota.Exception.CountyFactoryNotEqualException;
import Toyota.Gear.TransmissionType;
import Toyota.Gear.Wheel;
import Toyota.Gear.WheelRadius;

public class CarFactory {

    private Country country;
    private final GearFactory gearFactory;

    public CarFactory(Country country, GearFactory gearFactory) throws CountyFactoryNotEqualException {
        this.country = country;
        this.gearFactory = gearFactory;
        if (this.country != gearFactory.getCountry()) {
            throw new CountyFactoryNotEqualException("Страна завода и конвейера не совпадает. " +
                    "Завод находится в стране " + gearFactory.getCountry() + ", а конвейер находится в стране " + country);
        }
    }

    public Camry createCamry(Color color, int price) {
        return new Camry(price, color, 200, TransmissionType.AUTOMATIC, false,
                gearFactory.createWheels(WheelRadius.R17), gearFactory.createGasTank(), gearFactory.createEngine(),
                gearFactory.createElectrics(), gearFactory.createHeadLights(), false, country);
    }

    public Dyna createDyna(Color color, int price) {
        return new Dyna(price, color, 200, TransmissionType.AUTOMATIC, false,
                gearFactory.createWheels(WheelRadius.R17), gearFactory.createGasTank(), gearFactory.createEngine(),
                gearFactory.createElectrics(), gearFactory.createHeadLights(), 200, country);
    }

    public Hiance createHiance(Color color, int price) {
        return new Hiance(price, color, 200, TransmissionType.AUTOMATIC, false,
                gearFactory.createWheels(WheelRadius.R20), gearFactory.createGasTank(), gearFactory.createEngine(),
                gearFactory.createElectrics(), gearFactory.createHeadLights(), 100,
                new Wheel(false, WheelRadius.R20), country);
    }

    public Solara createSolara(Color color, int price) {
        return new Solara(price, color, 200, TransmissionType.AUTOMATIC, false,
                gearFactory.createWheels(WheelRadius.R20), gearFactory.createGasTank(), gearFactory.createEngine(),
                gearFactory.createElectrics(), gearFactory.createHeadLights(), false, country);
    }

}
