package nny.design.patterns.state;

/**
 * 待支付状态
 *
 * @author shengyong.huang
 * @date 2020-07-06
 */
public class NotPayState extends State {

    public NotPayState(Order order) {
        this.order = order;
    }

    @Override
    protected void handle() {
        System.out.println("待支付状态,执行待支付的复杂逻辑");
        // 改变当前状态为"支付成功"
        order.setContextState(order.getPaymentSuccessState());
    }
}
