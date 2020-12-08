package factor2;

public class BaoMaCarFactory implements AbstractFactory{
    @Override
    public Car makeCar() {
        return new BaoMaCar();
    }
}
