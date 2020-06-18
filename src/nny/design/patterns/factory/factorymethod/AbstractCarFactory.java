package nny.design.patterns.factory.factorymethod;

/**
 * 抽象汽车工厂（生产汽车）
 *
 * @author shengyong.huang
 * @date 2020-06-17
 */
public abstract class AbstractCarFactory {

    /**
     * 汽车生产订单
     */

    /**
     * 根据指定类型生成订单，生产汽车
     *
     * @param type
     */
    public void orderCar(String type) {

        AbstractCar car = createCar(type);

        car.assemblyEngine();
        car.externalInspection();
        car.internalInspection();

        System.out.printf("%s 汽车生产完成，请联系客户提车 \n", type);

    }

    /**
     * 根据类型创建车子
     *
     * @param type 类型
     * @return 车对象
     */
    protected abstract AbstractCar createCar(String type);
}
