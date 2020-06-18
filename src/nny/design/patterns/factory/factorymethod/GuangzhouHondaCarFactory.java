package nny.design.patterns.factory.factorymethod;

/**
 * 广州本田汽车工厂
 *
 * @author shengyong.huang
 * @date 2020-06-17
 */
public class GuangzhouHondaCarFactory extends AbstractCarFactory {
    @Override
    protected AbstractCar createCar(String type) {

        if ("CIVIC".equals(type)) {
            return new HondaCivicCar();
        } else if ("FIT".equals(type)) {
            return new HondaFitCar();
        } else if ("ACCORD".equals(type)) {
            return new HondaAccordCar();
        } else {
            throw new RuntimeException("未找到对应类型的车");
        }

    }
}
