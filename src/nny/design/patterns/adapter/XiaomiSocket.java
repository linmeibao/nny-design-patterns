package nny.design.patterns.adapter;

/**
 * 小米插座实现
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public class XiaomiSocket implements IChinaSocket {
    @Override
    public void provideChargingService(IChinaPlug chinaPlug) {
        System.out.println("使用小米插座");
        chinaPlug.startCharging();
    }
}
