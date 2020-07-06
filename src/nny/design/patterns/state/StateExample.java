package nny.design.patterns.state;

/**
 * @author shengyong.huang
 * @date 2020-07-05
 */
public class StateExample {

    /**
     * 订单状态的变化，下单、待支付、支付、发货、待收货、收货、取消、待退款、已退款等等，每一个订单背后承载着很多不同的状态。每一个状态，都有不一样的业务逻辑。
     * 0 下单
     * 1 待支付
     * 2 支付
     * 3 发货
     * 4 待收货
     * 5 收货
     * 6 订单结束
     */
    private Integer state;

    public void placeOrder() {
        state = 0;
        System.out.println("下单成功！");
    }

    public void orderHandleState() {

        switch (state) {
            case 0:
                state = 1;
                System.out.println("待支付状态,执行待支付的复杂逻辑");
                break;
            case 1:
                state = 2;
                System.out.println("支付成功状态,执行支付成功的复杂逻辑");
                break;
            case 2:
                state = 3;
                System.out.println("正在发货状态,执行正在发货的复杂逻辑");
                break;
            case 3:
                state = 4;
                System.out.println("待收货状态,执行待收货的复杂逻辑");
                break;
            case 4:
                state = 5;
                System.out.println("收货成功状态,执行收货成功的复杂逻辑");
                break;
            case 5:
                state = 6;
                System.out.println("订单已经结束,执行订单已经结束的复杂逻辑");
                return;
            default:
                throw new RuntimeException("订单状态异常");
        }

        orderHandleState();
    }


    public static void main(String[] args) {
        StateExample stateExample = new StateExample();
        stateExample.placeOrder();
        stateExample.orderHandleState();
    }
}
