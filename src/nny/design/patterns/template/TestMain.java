package nny.design.patterns.template;

/**
 * 测试方法
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public class TestMain {
    public static void main(String[] args) {
        AbstractDecorateHouse single = new SingleFamilyDecorateHouse();
        single.decorating();

        AbstractDecorateHouse marriedCouples = new MarriedCouplesDecorateHouse();
        marriedCouples.decorating();
    }
}
