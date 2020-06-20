package nny.design.patterns.adapter;

/**
 * 测试方法
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public class TestMain {
    public static void main(String[] args) {

        IChinaSocket xiaomiSocket = new XiaomiSocket();
        IChinaSocket bullSocket = new BullSocket();
        IChinaPlug huaweiPlug = new HuaweiPlug();

        // 使用小米插座给华为手机充电器充电
        xiaomiSocket.provideChargingService(huaweiPlug);

        // 使用公牛插座给华为手机充电器充电
        bullSocket.provideChargingService(huaweiPlug);

        IChinaHongkongSocket panasonic13ASocket = new Panasonic13ASocket();
        IChinaHongkongPlug hongkongApplePlug = new ChinaHongkongApplePlug();

        // 使用飞利浦插头给港版苹果手机充电器充电
        panasonic13ASocket.provideChargingService(hongkongApplePlug);

        // 适配器使用
        // 使用适配器将港版苹果充电器转换成中国大陆规格
        ChinaPlugAdapter chinaPlugAdapter = new ChinaPlugAdapter(hongkongApplePlug);

        // 使用小米插座给港版苹果充电器充电
        xiaomiSocket.provideChargingService(chinaPlugAdapter);

        // 使用公牛插座给港版苹果充电器充电
        bullSocket.provideChargingService(chinaPlugAdapter);

    }
}
