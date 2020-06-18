package nny.design.patterns.strategy;

/**
 * 支付宝付款方式实现
 *
 * @author shengyong.huang
 * @date 2020-06-07
 */
public class AlipayPayment implements IPaymentPattern {
    @Override
    public void pay() {
        System.out.println("支付宝付款");
    }
}
