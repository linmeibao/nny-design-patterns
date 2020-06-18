package nny.design.patterns.factory.abstractfactory.car;

import nny.design.patterns.factory.abstractfactory.enginematerial.HondaEngineMaterialFactory;
import nny.design.patterns.factory.abstractfactory.enginematerial.IEngineMaterialFactory;

/**
 * 广州本田汽车工厂
 *
 * @author shengyong.huang
 * @date 2020-06-17
 */
public class GuangzhouHondaCarFactory extends AbstractCarFactory {
    @Override
    protected AbstractCar createCar(String type) {

        IEngineMaterialFactory iEngineMaterialFactory = new HondaEngineMaterialFactory();

        if ("CIVIC".equals(type)) {
            return new HondaCivicCar(iEngineMaterialFactory);
        } else if ("FIT".equals(type)) {
            return new HondaFitCar(iEngineMaterialFactory);
        } else if ("ACCORD".equals(type)) {
            return new HondaAccordCar(iEngineMaterialFactory);
        } else {
            throw new RuntimeException("未找到对应类型的车");
        }

    }
}
