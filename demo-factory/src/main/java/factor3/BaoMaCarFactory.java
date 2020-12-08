package factor3;

public class BaoMaCarFactory implements AbstractFactory {
    @Override
    public Car makeCar() {
        return new BaoMaCar();
    }

    @Override
    public Watch makeWatch() {
        return new BaoMaWatch();
    }
}
