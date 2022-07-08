import Gear.Electrician;
import Gear.Engine;

public class Runner {

    //не учтены диаметры колёс для каждой модели авто

    public static void main(String[] args) {

        Electrician electrician = new Electrician(100, true);
        Electrician electricianBroken = new Electrician(100, false);
        Engine engine = new Engine(200, true);
        Engine engineBroken = new Engine(200, false);
    }
}
