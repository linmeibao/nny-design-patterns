package nny.design.patterns.chainofresponsibility;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 优惠券路由
 *
 * @author shengyong.huang
 * @date 2020-07-21
 */

public class UseCouponChain implements UseCouponBase {
    // 所有 case 列表
    private List<UseCouponBase> mCaseList = new ArrayList<>();
    // 索引，用于遍历所有 case 列表
    private int index = 0;

    // 添加 case
    public UseCouponChain addBaseCase(UseCouponBase base) {
        mCaseList.add(base);
        return this;
    }

    @Override
    public void doSomething(List couponList, UseCouponBase useCouponBase, BigDecimal discounts) {
        //所有遍历完了，直接返回
        if (index == mCaseList.size()) {
            return;
        }
        //获取当前 case
        UseCouponBase currentCase = mCaseList.get(index);
        //修改索引值，以便下次回调获取下个节点，达到遍历效果
        index++;
        //调用 当前 case 处理方法
        currentCase.doSomething(couponList, useCouponBase, discounts);
    }
}
