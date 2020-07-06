package nny.design.patterns.state;

/**
 * 订单结束状态
 * @author shengyong.huang
 * @date 2020-07-06
 */
public class OrderEndState extends State {

    public OrderEndState(Order order) {
        this.order = order;
    }

    @Override
    protected void handle() {
        System.out.println("订单已经结束,执行订单已经结束的复杂逻辑");
        // 订单结束状态设置为空
        order.setContextState(null);
    }
}
