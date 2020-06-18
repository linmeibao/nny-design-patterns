package nny.design.patterns.factory.abstractfactory.enginematerial;

/**
 * 本田燃油供给系统
 *
 * @author shengyong.huang
 * @date 2020-06-18
 */
public class HondaFuelSupplySystem extends AbstractFuelSupplySystem {
    @Override
    public void startFuelSupplySystem() {
        System.out.println("启动本田燃油供给系统");
    }
}
