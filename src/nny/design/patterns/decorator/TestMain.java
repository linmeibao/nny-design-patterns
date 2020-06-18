package nny.design.patterns.decorator;

/**
 * @author shengyong.huang
 * @date 2020-06-15
 */
public class TestMain {
    public static void main(String[] args) {
        SimCard chinaMobileSimCard = new ChinaMobileSimCard();
        chinaMobileSimCard.addAdditionalBusiness();

        // 装饰彩铃功能
        chinaMobileSimCard = new MusicBusinessDecorator(chinaMobileSimCard);
        chinaMobileSimCard.addAdditionalBusiness();

        // 装饰来电显示
        chinaMobileSimCard = new CallerIdBusinessDecorator(chinaMobileSimCard);
        chinaMobileSimCard.addAdditionalBusiness();

        // 装饰加量流量包
        chinaMobileSimCard = new Add10GFlowPacketBusinessDecorator(chinaMobileSimCard);
        chinaMobileSimCard.addAdditionalBusiness();
    }
}
