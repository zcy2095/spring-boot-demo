package factory;

/**
 * @author zhangchongyu
 */
public class CarFactory {
    public Car makeCar(String type){
        if ("baoMa".equals(type)) {
            return new BaoMaCar();
        }
        if ("aoDi".equals(type)) {
            return new AoDiCar();
        }
        return null;
    }

}
