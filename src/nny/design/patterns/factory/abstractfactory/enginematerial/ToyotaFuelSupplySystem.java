package nny.design.patterns.factory.abstractfactory.enginematerial;

/**
 * 丰田燃油供给系统
 *
 * @author shengyong.huang
 * @date 2020-06-18
 */
public class ToyotaFuelSupplySystem extends AbstractFuelSupplySystem {
    @Override
    public void startFuelSupplySystem() {
        System.out.println("启动丰田燃油供给系统");
    }
}
