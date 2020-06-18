package nny.design.patterns.factory.abstractfactory.car;

import nny.design.patterns.factory.abstractfactory.enginematerial.IEngineMaterialFactory;

/**
 * 丰田普拉多
 *
 * @author shengyong.huang
 * @date 2020-06-17
 */
public class ToyotaPradoCar extends AbstractCar {

    IEngineMaterialFactory iEngineMaterialFactory;

    public ToyotaPradoCar(IEngineMaterialFactory iEngineMaterialFactory) {
        this.iEngineMaterialFactory = iEngineMaterialFactory;
    }

    @Override
    public void assemblyEngine() {
        iEngineMaterialFactory.createCoolingSystem().startCoolingSystem();
        iEngineMaterialFactory.createFuelSupplySystem().startFuelSupplySystem();
        iEngineMaterialFactory.createIgnitionSystem().startIgnitionSystem();
    }
}
