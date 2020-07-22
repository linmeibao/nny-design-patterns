package nny.design.patterns.chainofresponsibility;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 测试方法
 *
 * @author shengyong.huang
 * @date 2020-07-21
 */
public class TestMain {

    public static void main(String[] args) {
        //新建一个各类优惠券处理路由
        UseCouponChain useCouponChain = new UseCouponChain();
        //需要处理哪些优惠券按顺序添加进路由就行
        useCouponChain.addBaseCase(new MoneyOffChain())
                .addBaseCase(new DiscountChain());
        /*这里couponList 是形参，
        具体业务中可以是用户的可用优惠券列表，
        可以传入执行器中进行业务逻辑处理*/
        List couponList = new ArrayList<>();
        //执行业务逻辑处理
        useCouponChain.doSomething(couponList, useCouponChain, new BigDecimal(0));
    }

}
