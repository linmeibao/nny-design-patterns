package nny.design.patterns.state;

/**
 * 收货成功状态
 * @author shengyong.huang
 * @date 2020-07-06
 */
public class ReceivedSuccessState extends State {
    public ReceivedSuccessState(Order order) {
        this.order  = order;
    }

    @Override
    protected void handle() {
        System.out.println("收货成功状态,执行收货成功的复杂逻辑");
        // 改变当前状态为"订单结束"
        order.setContextState(order.getOrderEndState());
    }
}
