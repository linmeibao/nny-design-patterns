package nny.design.patterns.chainofresponsibility;

import java.math.BigDecimal;
import java.util.List;

/**
 * 折扣券处理
 *
 * @author shengyong.huang
 * @date 2020-07-21
 */
public class DiscountChain implements UseCouponBase {
    @Override
    public void doSomething(List couponList, UseCouponBase useCouponBase, BigDecimal discounts) {

        System.out.println("使用折扣券逻辑处理");
        //使用折扣券逻辑处理（怎么使用的代码此处我就省略了，具体业务逻辑具体实现就行）

        //交给下一个执行器处理
        useCouponBase.doSomething(couponList, useCouponBase, discounts);
    }
}
