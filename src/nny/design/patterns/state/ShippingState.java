package nny.design.patterns.state;

/**
 * 正在发货状态
 *
 * @author shengyong.huang
 * @date 2020-07-06
 */
public class ShippingState extends State {

    public ShippingState(Order order) {
        this.order = order;
    }

    @Override
    protected void handle() {
        System.out.println("正在发货状态,执行正在发货的复杂逻辑");
        // 改变当前状态为"待收货"
        order.setContextState(order.getWaitForReceivingState());
    }
}
