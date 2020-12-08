package factor2;

/**
 * @author zhangchongyu
 */
public class AoDiCar implements Car {

    public AoDiCar() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("奥迪车");
    }
}
