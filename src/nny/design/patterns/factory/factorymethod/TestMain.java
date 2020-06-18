package nny.design.patterns.factory.factorymethod;

/**
 * 测试类
 *
 * @author shengyong.huang
 * @date 2020-06-17
 */
public class TestMain {
    public static void main(String[] args) {
        AbstractCarFactory toyotaFactory = new FawToyotaCarFactory();
        // 生产丰田普拉多
        toyotaFactory.orderCar("PRADO");

        AbstractCarFactory hondaFactory = new GuangzhouHondaCarFactory();
        // 生产本田雅阁
        hondaFactory.orderCar("ACCORD");
        // 生产本田飞度
        hondaFactory.orderCar("FIT");
    }
}
