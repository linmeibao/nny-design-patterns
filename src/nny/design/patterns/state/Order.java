package nny.design.patterns.state;

/**
 * 订单类
 *
 * @author shengyong.huang
 * @date 2020-07-06
 */
public class Order {

    /**
     * 上下文状态对象
     */
    private State contextState;

    /**
     * 下单状态
     */
    private State placeOrderState = new PlaceOrderState(this);
    /**
     * 待支付状态
     */
    private State notPayState = new NotPayState(this);
    /**
     * 支付成功状态
     */
    private State paymentSuccessState = new PaymentSuccessState(this);
    /**
     * 正在发货状态
     */
    private State shippingState = new ShippingState(this);
    /**
     * 待收货状态
     */
    private State waitForReceivingState = new WaitForReceivingState(this);
    /**
     * 收货成功状态
     */
    private State receivedSuccessState = new ReceivedSuccessState(this);
    /**
     * 订单结束状态
     */
    private State orderEndState = new OrderEndState(this);

    public State getContextState() {
        return contextState;
    }

    public void setContextState(State contextState) {
        this.contextState = contextState;
    }

    public State getPlaceOrderState() {
        return placeOrderState;
    }

    public void setPlaceOrderState(State placeOrderState) {
        this.placeOrderState = placeOrderState;
    }

    public State getNotPayState() {
        return notPayState;
    }

    public void setNotPayState(State notPayState) {
        this.notPayState = notPayState;
    }

    public State getPaymentSuccessState() {
        return paymentSuccessState;
    }

    public void setPaymentSuccessState(State paymentSuccessState) {
        this.paymentSuccessState = paymentSuccessState;
    }

    public State getShippingState() {
        return shippingState;
    }

    public void setShippingState(State shippingState) {
        this.shippingState = shippingState;
    }

    public State getWaitForReceivingState() {
        return waitForReceivingState;
    }

    public void setWaitForReceivingState(State waitForReceivingState) {
        this.waitForReceivingState = waitForReceivingState;
    }

    public State getReceivedSuccessState() {
        return receivedSuccessState;
    }

    public void setReceivedSuccessState(State receivedSuccessState) {
        this.receivedSuccessState = receivedSuccessState;
    }

    public State getOrderEndState() {
        return orderEndState;
    }

    public void setOrderEndState(State orderEndState) {
        this.orderEndState = orderEndState;
    }


    /**
     * 订单下单
     */
    public void placeOrder() {
        this.contextState = this.placeOrderState;
    }

    /**
     * 处理订单
     */
    public void handelOrder() {

        this.contextState.handle();

        if (this.contextState != null) {
            handelOrder();
        }

    }
}
