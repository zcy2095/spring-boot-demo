package factor3;

/**
 * @author zhangchongyu
 */
public class TestFactory {

    public static void main(String[] args) {
        AbstractFactory aoDiCarFactory = new AoDiCarFactory();
        aoDiCarFactory.makeCar();
        aoDiCarFactory.makeWatch();

        AbstractFactory baoMaCarFactory = new BaoMaCarFactory();
        baoMaCarFactory.makeCar();
        baoMaCarFactory.makeWatch();
    }

}
