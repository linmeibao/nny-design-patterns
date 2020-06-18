package nny.design.patterns.decorator;

/**
 * 抽象构建 手机卡
 *
 * @author shengyong.huang
 * @date 2020-06-15
 */
public interface SimCard {
    /**
     * 增加手机卡附加业务
     */
    void addAdditionalBusiness();
}
