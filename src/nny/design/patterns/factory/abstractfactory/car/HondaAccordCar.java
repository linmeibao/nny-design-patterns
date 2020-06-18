package nny.design.patterns.factory.abstractfactory.car;

import nny.design.patterns.factory.abstractfactory.enginematerial.IEngineMaterialFactory;

/**
 * 本田雅阁
 *
 * @author shengyong.huang
 * @date 2020-06-17
 */
public class HondaAccordCar extends AbstractCar {

    IEngineMaterialFactory iEngineMaterialFactory;

    public HondaAccordCar(IEngineMaterialFactory iEngineMaterialFactory) {
        this.iEngineMaterialFactory = iEngineMaterialFactory;
    }

    @Override
    public void assemblyEngine() {
        iEngineMaterialFactory.createCoolingSystem().startCoolingSystem();
        iEngineMaterialFactory.createFuelSupplySystem().startFuelSupplySystem();
        iEngineMaterialFactory.createIgnitionSystem().startIgnitionSystem();
    }
}
