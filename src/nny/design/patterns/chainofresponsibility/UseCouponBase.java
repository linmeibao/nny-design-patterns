package nny.design.patterns.chainofresponsibility;

import java.math.BigDecimal;
import java.util.List;

/**
 * 优惠券业务逻辑接口
 *
 * @author shengyong.huang
 * @date 2020-07-21
 */
public interface UseCouponBase {
    /**
     * 所有处理逻辑的方法
     *
     * @param couponList    责任链集合
     * @param useCouponBase 自身对象
     * @param discounts     折扣 3折/5折 0.3/0.5
     */
    void doSomething(List couponList, UseCouponBase useCouponBase, BigDecimal discounts);

}
