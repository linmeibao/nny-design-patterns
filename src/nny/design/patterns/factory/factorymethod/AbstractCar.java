package nny.design.patterns.factory.factorymethod;

/**
 * 抽象汽车类
 *
 * @author shengyong.huang
 * @date 2020-06-17
 */
public abstract class AbstractCar {

    public void internalInspection() {
        System.out.println("汽车内部检查");
    }

    public void externalInspection() {
        System.out.println("汽车外部检查");
    }

    public void assemblyEngine() {
        System.out.println("组装汽车发动机");
    }

}
