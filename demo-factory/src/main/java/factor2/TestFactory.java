package factor2;

import factory.Car;
import factory.CarFactory;

/**
 * @author zhangchongyu
 */
public class TestFactory {

    public static void main(String[] args) {
        AbstractFactory aoDiCarFactory = new AoDiCarFactory();
        aoDiCarFactory.makeCar();

        AbstractFactory baoMaCarFactory = new BaoMaCarFactory();
        baoMaCarFactory.makeCar();
    }

}
