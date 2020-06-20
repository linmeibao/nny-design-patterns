package nny.design.patterns.template;

/**
 * 已婚家庭装修房子
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public class MarriedCouplesDecorateHouse extends AbstractDecorateHouse {
    @Override
    protected void softDecorate() {
        System.out.println("已婚家庭装修房子，选购7字宽体皮质沙发、盼盼防盗门");
    }
}
