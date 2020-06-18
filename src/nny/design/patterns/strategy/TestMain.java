package nny.design.patterns.strategy;

/**
 * 测试方式
 *
 * @author shengyong.huang
 * @date 2020-06-07
 */
public class TestMain {

    public static void main(String[] args) {

        IPaymentPattern alipayPayment = new AlipayPayment();
        IPaymentPattern wechatPayment = new WechatPayment();
        IPaymentPattern walletPayment = new WalletPayment();

        Person person = new Person();
        // 设置付款策略
        person.setPaymentPattern(alipayPayment);
        person.shopping();

        // 切换付款策略
        person.setPaymentPattern(wechatPayment);
        person.shopping();

        // 切换付款策略
        person.setPaymentPattern(walletPayment);
        person.shopping();
    }
}
