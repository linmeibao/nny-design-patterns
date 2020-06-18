package nny.design.patterns.factory.abstractfactory.car;

/**
 * 抽象汽车类
 *
 * @author shengyong.huang
 * @date 2020-06-17
 */
public abstract class AbstractCar {

    /**
     * 组装发动机方法
     */
    public abstract void assemblyEngine();

    /**
     * 进行汽车内部检查
     */
    public void internalInspection() {
        System.out.println("汽车内部检查");
    }

    /**
     * 进行汽车外部检查
     */
    public void externalInspection() {
        System.out.println("汽车外部检查");
    }

}
