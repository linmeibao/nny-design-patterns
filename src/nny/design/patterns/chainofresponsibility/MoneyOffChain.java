package nny.design.patterns.chainofresponsibility;

import java.math.BigDecimal;
import java.util.List;

/**
 * 满减券处理
 *
 * @author shengyong.huang
 * @date 2020-07-21
 */
public class MoneyOffChain implements UseCouponBase {
    @Override
    public void doSomething(List couponList, UseCouponBase useCouponBase, BigDecimal discounts) {

        System.out.println("使用满减券逻辑处理");
        //使用满减券逻辑处理（怎么使用的代码此处我就省略了，具体业务逻辑具体实现就行）

        //交给下一个处理
        useCouponBase.doSomething(couponList, useCouponBase, discounts);
    }
}
