package nny.design.patterns.strategy;

/**
 * 客户
 *
 * @author shengyong.huang
 * @date 2020-06-07
 */
public class Person {

    /**
     * 付款方式
     */
    IPaymentPattern paymentPattern;

    /**
     * 购物
     */
    public void shopping() {
        System.out.println("购物...");
        paymentPattern.pay();
    }

    public IPaymentPattern getPaymentPattern() {
        return paymentPattern;
    }

    public void setPaymentPattern(IPaymentPattern paymentPattern) {
        this.paymentPattern = paymentPattern;
    }
}
