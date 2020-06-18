package nny.design.patterns.factory.abstractfactory.car;

import nny.design.patterns.factory.abstractfactory.enginematerial.IEngineMaterialFactory;

/**
 * 丰田卡罗拉
 *
 * @author shengyong.huang
 * @date 2020-06-17
 */
public class ToyotaCorollaCar extends AbstractCar {

    IEngineMaterialFactory iEngineMaterialFactory;

    public ToyotaCorollaCar(IEngineMaterialFactory iEngineMaterialFactory) {
        this.iEngineMaterialFactory = iEngineMaterialFactory;
    }

    @Override
    public void assemblyEngine() {
        iEngineMaterialFactory.createCoolingSystem().startCoolingSystem();
        iEngineMaterialFactory.createFuelSupplySystem().startFuelSupplySystem();
        iEngineMaterialFactory.createIgnitionSystem().startIgnitionSystem();
    }
}
