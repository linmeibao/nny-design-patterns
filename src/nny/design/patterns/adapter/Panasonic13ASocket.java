package nny.design.patterns.adapter;

/**
 * 飞利浦13A插座实现
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public class Panasonic13ASocket implements IChinaHongkongSocket {
    @Override
    public void provideChargingService(IChinaHongkongPlug hongkongPlug) {
        System.out.println("使用飞利浦13A插座");
        hongkongPlug.receivePowerSupply();
    }
}
