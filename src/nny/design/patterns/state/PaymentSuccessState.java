package nny.design.patterns.state;

/**
 * 支付成功状态
 *
 * @author shengyong.huang
 * @date 2020-07-06
 */
public class PaymentSuccessState extends State {

    public PaymentSuccessState(Order order) {
        this.order = order;
    }

    @Override
    protected void handle() {
        System.out.println("支付成功状态,执行支付成功的复杂逻辑");
        // 改变当前状态为"正在发货状态"
        order.setContextState(order.getShippingState());
    }
}
