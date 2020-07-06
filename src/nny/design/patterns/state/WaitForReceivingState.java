package nny.design.patterns.state;

/**
 * 待收货状态
 *
 * @author shengyong.huang
 * @date 2020-07-06
 */
public class WaitForReceivingState extends State {


    public WaitForReceivingState(Order order) {
        this.order = order;
    }

    @Override
    protected void handle() {
        System.out.println("待收货状态,执行待收货的复杂逻辑");
        // 改变当前状态为"收货成功"
        order.setContextState(order.getReceivedSuccessState());
    }
}
