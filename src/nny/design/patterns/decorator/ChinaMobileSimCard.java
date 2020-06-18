package nny.design.patterns.decorator;

/**
 * 具体构建类 中国移动手机卡
 *
 * @author shengyong.huang
 * @date 2020-06-15
 */
public class ChinaMobileSimCard implements SimCard {
    @Override
    public void addAdditionalBusiness() {
        System.out.println("中国移动手机卡A套餐业务");
    }
}
