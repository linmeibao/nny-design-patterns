package nny.design.patterns.decorator;

/**
 * 抽象装饰手机卡业务
 *
 * @author shengyong.huang
 * @date 2020-06-15
 */
public abstract class SimBusinessDecorator implements SimCard {
    /**
     * 以组合的方式来获取具体构建类
     */
    private SimCard simCard;

    /**
     * 构造方法示例化具体构建对象
     *
     * @param simCard 抽象构建
     */
    public SimBusinessDecorator(SimCard simCard) {
        this.simCard = simCard;
    }

    /**
     * 默认不增加任何行为
     */
    @Override
    public void addAdditionalBusiness() {
        simCard.addAdditionalBusiness();
    }

}
