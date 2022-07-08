import Auto.*;
import Gear.*;
import Exception.*;

public class Runner {

    //не учтены диаметры колёс для каждой модели авто

    public static void main(String[] args) {

        Electrician electrician = new Electrician(100, true);
        Electrician electricianBroken = new Electrician(100, false);
        Engine engine = new Engine(200, true);
        Engine engineBroken = new Engine(200, false);
        GasTank gasTank = new GasTank(50, 500);
        GasTank gasTankEmpty = new GasTank(50, 0);
        Lights lights = new Lights(10, true);
        Lights lightsBroken = new Lights(10, false);
        Wheel wheel1 = new Wheel(50, 50, false);
        Wheel wheel2 = new Wheel(50, 50, false);
        Wheel wheel3 = new Wheel(50, 50, false);
        Wheel wheel4 = new Wheel(50, 50, false);
        Wheel wheelBroken = new Wheel(50, 50, true);
        Wheel[] wheels = new Wheel[]{wheel1, wheel2, wheel3, wheel4};
        Wheel[] wheelsBroken = new Wheel[]{wheel1, wheel2, wheel3, wheelBroken};

        Car camry = new Camry(1000, "red", 200, TransmissionType.AUTOMATIC, false,
                wheels, gasTank, engine, electrician, lights, true);

        Car dynaWheelsBroken = new Dyna(1000, "red", 200, TransmissionType.AUTOMATIC, false,
                wheelsBroken, gasTank, engine, electrician, lights, 500);

        Car hianceElectricianBroken = new Hiance(1000, "red", 200, TransmissionType.AUTOMATIC, false,
                wheels, gasTank, engine, electricianBroken, lights, 500, wheel1);

        Car solaraEngineBroken = new Solara(1000, "red", 200, TransmissionType.AUTOMATIC, false,
                wheels, gasTank, engineBroken, electrician, lights, false);

        Car solaraGasTankEmpty = new Solara(1000, "red", 200, TransmissionType.AUTOMATIC, false,
                wheels, gasTankEmpty, engine, electrician, lights, false);

        Car solaraLightsBroken = new Solara(1000, "red", 200, TransmissionType.AUTOMATIC, false,
                wheels, gasTank, engine, electrician, lightsBroken, false);

        Car[] cars = new Car[]{camry, dynaWheelsBroken, hianceElectricianBroken, solaraEngineBroken,
                solaraGasTankEmpty, solaraLightsBroken};

        for (Car car : cars) {
            try {
                car.startMoving();
            } catch (StartCarException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
