package nny.design.patterns.template;

/**
 * 单身家庭装修房子
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public class SingleFamilyDecorateHouse extends AbstractDecorateHouse {
    @Override
    protected void softDecorate() {
        System.out.println("单身家庭装修房子，选购单人布艺沙发、步阳防盗门");
    }
}
