package nny.design.patterns.factory.abstractfactory.enginematerial;

/**
 * 本田发动机材料工厂
 *
 * @author shengyong.huang
 * @date 2020-06-18
 */
public class HondaEngineMaterialFactory implements IEngineMaterialFactory {
    @Override
    public AbstractFuelSupplySystem createFuelSupplySystem() {
        return new HondaFuelSupplySystem();
    }

    @Override
    public AbstractIgnitionSystem createIgnitionSystem() {
        return new HondaIgnitionSystem();
    }

    @Override
    public AbstractCoolingSystem createCoolingSystem() {
        return new HondaCoolingSystem();
    }
}
