package nny.design.patterns.adapter;

/**
 * 华为手机充电器
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public class HuaweiPlug implements IChinaPlug {
    @Override
    public void startCharging() {
        System.out.println("华为手机充电器开始充电");
    }
}
