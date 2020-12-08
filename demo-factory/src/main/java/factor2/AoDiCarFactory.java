package factor2;

public class AoDiCarFactory implements AbstractFactory{
    @Override
    public Car makeCar() {
        return new AoDiCar();
    }
}
