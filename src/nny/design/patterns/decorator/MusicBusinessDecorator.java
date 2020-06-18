package nny.design.patterns.decorator;

/**
 * 彩铃业务装饰器
 *
 * @author shengyong.huang
 * @date 2020-06-15
 */
public class MusicBusinessDecorator extends SimBusinessDecorator {

    public MusicBusinessDecorator(SimCard simCard) {
        super(simCard);
    }

    /**
     * 彩铃业务
     */
    private void music() {
        System.out.println("增加彩铃业务");
    }

    @Override
    public void addAdditionalBusiness() {
        super.addAdditionalBusiness();
        // 对手机卡进行装饰，增加彩铃业务的额外行为
        music();
    }
}
