package factor3;

/**
 * @author zhangchongyu
 */
public class BaoMaCar implements Car {

    public BaoMaCar() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("宝马车");
    }
}
