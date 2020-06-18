package nny.design.patterns.factory.abstractfactory.enginematerial;

/**
 * 本田冷却系统
 *
 * @author shengyong.huang
 * @date 2020-06-18
 */
public class HondaCoolingSystem extends AbstractCoolingSystem {
    @Override
    public void startCoolingSystem() {
        System.out.println("启动本田冷却系统");
    }
}
