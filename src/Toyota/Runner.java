package Toyota;

import Toyota.Auto.*;
import Toyota.Gear.*;
import Toyota.Exception.*;

public class Runner {

    //не учтены диаметры колёс для каждой модели авто

    public static void main(String[] args) {

        Electrics electrics = new Electrics(true);
        Electrics electricsBroken = new Electrics(false);
        Engine engine = new Engine(true);
        Engine engineBroken = new Engine(false);
        GasTank gasTank = new GasTank(50);
        GasTank gasTankEmpty = new GasTank(0);
        HeadLights headLights = new HeadLights(true);
        HeadLights headLightsBroken = new HeadLights(false);
        Wheel wheel = new Wheel(false, WheelRadius.R20);

        Camry camry = new Camry(1000, "red", 200, TransmissionType.AUTOMATIC, false,
                createWheelsWithRadius(WheelRadius.R17), gasTank, engine, electrics, headLights, true);

        Dyna dynaWheelsBroken = new Dyna(1000, "red", 200, TransmissionType.AUTOMATIC, false,
                createWheelsWithRadius(WheelRadius.R17), gasTank, engine, electrics, headLights, 500);

        Hiance hianceElectricianBroken = new Hiance(1000, "red", 200, TransmissionType.AUTOMATIC, false,
                createWheelsWithRadius(WheelRadius.R17), gasTank, engine, electricsBroken, headLights, 500, wheel);

        Solara solaraEngineBroken = new Solara(1000, "red", 200, TransmissionType.AUTOMATIC, false,
                createWheelsWithRadius(WheelRadius.R17), gasTank, engineBroken, electrics, headLights, false);

        Solara solaraGasTankEmpty = new Solara(1000, "red", 200, TransmissionType.AUTOMATIC, false,
                createWheelsWithRadius(WheelRadius.R17), gasTankEmpty, engine, electrics, headLights, false);

        Solara solaraLightsBroken = new Solara(1000, "red", 200, TransmissionType.AUTOMATIC, false,
                createWheelsWithRadius(WheelRadius.R17), gasTank, engine, electrics, headLightsBroken, false);

        Car[] cars = new Car[]{camry, dynaWheelsBroken, hianceElectricianBroken, solaraEngineBroken,
                solaraGasTankEmpty, solaraLightsBroken};

        for (Car car : cars) {
            try {
                car.startMoving();
            } catch (StartCarException e) {
                System.out.println(e.getMessage());
            }
        }

        camry.usb.connectMusic();
    }

    public static Wheel[] createWheelsWithRadius(WheelRadius wheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(false, wheelRadius);
        }
        return wheels;
    }
}
