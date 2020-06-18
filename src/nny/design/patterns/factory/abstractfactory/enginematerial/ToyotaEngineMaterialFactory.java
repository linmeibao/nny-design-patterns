package nny.design.patterns.factory.abstractfactory.enginematerial;

/**
 * 丰田发动机材料工厂
 *
 * @author shengyong.huang
 * @date 2020-06-18
 */
public class ToyotaEngineMaterialFactory implements IEngineMaterialFactory {
    @Override
    public AbstractFuelSupplySystem createFuelSupplySystem() {
        return new ToyotaFuelSupplySystem();
    }

    @Override
    public AbstractIgnitionSystem createIgnitionSystem() {
        return new ToyotaIgnitionSystem();
    }

    @Override
    public AbstractCoolingSystem createCoolingSystem() {
        return new ToyotaCoolingSystem();
    }
}
