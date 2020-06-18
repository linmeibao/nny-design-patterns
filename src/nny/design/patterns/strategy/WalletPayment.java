package nny.design.patterns.strategy;

/**
 * 钱包付款方式
 *
 * @author shengyong.huang
 * @date 2020-06-07
 */
public class WalletPayment implements IPaymentPattern {
    @Override
    public void pay() {
        System.out.println("使用钱包付款");
    }
}
