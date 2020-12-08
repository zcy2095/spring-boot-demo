package factor3;

public class AoDiCarFactory implements AbstractFactory {
    @Override
    public Car makeCar() {
        return new AoDiCar();
    }

    @Override
    public Watch makeWatch() {
        return new AoDiWatch();
    }
}
