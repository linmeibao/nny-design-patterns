package nny.design.patterns.state;

/**
 * 测试方法
 *
 * @author shengyong.huang
 * @date 2020-07-06
 */
public class TestMain {

    public static void main(String[] args) {
        // 订单
        Order order = new Order();
        // 订单下单，当前状态=下单状态
        order.placeOrder();
        // 处理订单
        order.handelOrder();
    }
}
