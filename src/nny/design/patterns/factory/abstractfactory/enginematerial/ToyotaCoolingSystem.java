package nny.design.patterns.factory.abstractfactory.enginematerial;

/**
 * 丰田冷却系统
 *
 * @author shengyong.huang
 * @date 2020-06-18
 */
public class ToyotaCoolingSystem extends AbstractCoolingSystem {
    @Override
    public void startCoolingSystem() {
        System.out.println("启动丰田冷却系统");
    }
}
