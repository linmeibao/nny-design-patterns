package nny.design.patterns.decorator;

/**
 * 来电显示装饰器
 *
 * @author shengyong.huang
 * @date 2020-06-15
 */
public class CallerIdBusinessDecorator extends SimBusinessDecorator {

    public CallerIdBusinessDecorator(SimCard simCard) {
        super(simCard);
    }

    private void callerId() {
        System.out.println("增加来电显示功能");
    }

    @Override
    public void addAdditionalBusiness() {
        super.addAdditionalBusiness();
        // 对手机卡进行装饰，增加来电显示功能的额外行为
        callerId();
    }
}
