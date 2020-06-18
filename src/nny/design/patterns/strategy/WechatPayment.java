package nny.design.patterns.strategy;

/**
 * 微信付款方式实现
 *
 * @author shengyong.huang
 * @date 2020-06-07
 */
public class WechatPayment implements IPaymentPattern {
    @Override
    public void pay() {
        System.out.println("使用微信付款");
    }
}
