package nny.design.patterns.factory.abstractfactory.car;

import nny.design.patterns.factory.abstractfactory.enginematerial.IEngineMaterialFactory;

/**
 * 本田思域
 *
 * @author shengyong.huang
 * @date 2020-06-17
 */
public class HondaCivicCar extends AbstractCar {
    IEngineMaterialFactory iEngineMaterialFactory;

    public HondaCivicCar(IEngineMaterialFactory iEngineMaterialFactory) {
        this.iEngineMaterialFactory = iEngineMaterialFactory;
    }

    @Override
    public void assemblyEngine() {
        iEngineMaterialFactory.createCoolingSystem().startCoolingSystem();
        iEngineMaterialFactory.createFuelSupplySystem().startFuelSupplySystem();
        iEngineMaterialFactory.createIgnitionSystem().startIgnitionSystem();
    }
}
