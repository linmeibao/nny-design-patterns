package nny.design.patterns.factory.abstractfactory.car;

import nny.design.patterns.factory.abstractfactory.enginematerial.IEngineMaterialFactory;
import nny.design.patterns.factory.abstractfactory.enginematerial.ToyotaEngineMaterialFactory;

/**
 * 一汽丰田汽车工厂
 *
 * @author shengyong.huang
 * @date 2020-06-17
 */
public class FawToyotaCarFactory extends AbstractCarFactory {
    @Override
    protected AbstractCar createCar(String type) {

        IEngineMaterialFactory iEngineMaterialFactory = new ToyotaEngineMaterialFactory();

        if ("PRADO".equals(type)){
            return new ToyotaPradoCar(iEngineMaterialFactory);
        } else if ("COROLLA".equals(type)){
            return new ToyotaCorollaCar(iEngineMaterialFactory);
        } else {
            throw new RuntimeException("未找到对应类型的车");
        }
    }
}
