package nny.design.patterns.state;

/**
 * 下单状态
 *
 * @author shengyong.huang
 * @date 2020-07-06
 */
public class PlaceOrderState extends State {


    public PlaceOrderState(Order order) {
        this.order = order;
    }

    @Override
    protected void handle() {
        System.out.println("下单成功！");
        // 改变当前状态为"待支付"
        order.setContextState(order.getNotPayState());
    }
}
