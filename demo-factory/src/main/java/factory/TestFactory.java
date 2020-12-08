package factory;

/**
 * @author zhangchongyu
 */
public class TestFactory {

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car baoMa = factory.makeCar("baoMa");
        Car aoDi = factory.makeCar("aoDi");
    }

}
