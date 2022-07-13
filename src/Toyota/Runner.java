package Toyota;

import Toyota.Auto.*;
import Toyota.Factories.CarFactory;
import Toyota.Factories.Country;
import Toyota.Factories.GearFactory;
import Toyota.Gear.*;
import Toyota.Exception.*;

public class Runner {

    //не учтены диаметры колёс для каждой модели авто

    public static void main(String[] args) {

        GearFactory gearFactoryChina = new GearFactory(Country.CHINA);
        GearFactory gearFactoryRussia = new GearFactory(Country.RUSSIA);
        GearFactory gearFactoryUSA = new GearFactory(Country.USA);

        CarFactory carFactoryChina = null;
        CarFactory carFactoryRussia = null;
        CarFactory carFactoryUSA = null;
        CarFactory carFactoryChinaError = null;
        try {
            carFactoryChina = new CarFactory(Country.CHINA, gearFactoryChina);
            carFactoryRussia = new CarFactory(Country.RUSSIA, gearFactoryRussia);
            carFactoryUSA = new CarFactory(Country.USA, gearFactoryUSA);
            carFactoryChinaError = new CarFactory(Country.CHINA, gearFactoryUSA);
        } catch (CountyFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        }

        Camry camry = carFactoryChina.createCamry(Color.RED, 100_000);
        Dyna dyna = carFactoryRussia.createDyna(Color.WHITE, 200_000);
        Hiance hiance = carFactoryUSA.createHiance(Color.SILVER, 300_000);
        Solara solara = carFactoryUSA.createSolara(Color.BLACK, 400_000);

        Car[] cars = new Car[]{camry, dyna, hiance, solara};

        for (Car car : cars) {
            try {
                car.startMoving();
            } catch (StartCarException e) {
                System.out.println(e.getMessage());
            }
        }

        camry.usb.connectMusic();
    }

}
