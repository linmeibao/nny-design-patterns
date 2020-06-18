package nny.design.patterns.factory.abstractfactory.enginematerial;

/**
 * 丰田点火系统
 *
 * @author shengyong.huang
 * @date 2020-06-18
 */
public class ToyotaIgnitionSystem extends AbstractIgnitionSystem {
    @Override
    public void startIgnitionSystem() {
        System.out.println("启动丰田点火系统");
    }
}
