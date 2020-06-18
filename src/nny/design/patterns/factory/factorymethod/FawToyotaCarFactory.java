package nny.design.patterns.factory.factorymethod;

/**
 * 一汽丰田汽车工厂
 *
 * @author shengyong.huang
 * @date 2020-06-17
 */
public class FawToyotaCarFactory extends AbstractCarFactory {
    @Override
    protected AbstractCar createCar(String type) {

        if ("PRADO".equals(type)){
            return new ToyotaPradoCar();
        } else if ("COROLLA".equals(type)){
            return new ToyotaCorollaCar();
        } else {
            throw new RuntimeException("未找到对应类型的车");
        }
    }
}
