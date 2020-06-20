package nny.design.patterns.adapter;

/**
 * 港版苹果手机充电器
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public class ChinaHongkongApplePlug implements IChinaHongkongPlug {
    @Override
    public void receivePowerSupply() {
        System.out.println("港版苹果手机充电器开始充电");
    }
}
