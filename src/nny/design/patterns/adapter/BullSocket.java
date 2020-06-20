package nny.design.patterns.adapter;

/**
 * 公牛插座实现
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public class BullSocket implements IChinaSocket {
    @Override
    public void provideChargingService(IChinaPlug chinaPlug) {
        System.out.println("使用公牛插座");
        chinaPlug.startCharging();
    }
}
