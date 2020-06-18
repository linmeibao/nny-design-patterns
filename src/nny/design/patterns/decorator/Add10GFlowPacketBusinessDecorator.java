package nny.design.patterns.decorator;

/**
 * 加量10G流量包业务装饰器
 *
 * @author shengyong.huang
 * @date 2020-06-15
 */
public class Add10GFlowPacketBusinessDecorator extends SimBusinessDecorator {

    public Add10GFlowPacketBusinessDecorator(SimCard simCard) {
        super(simCard);
    }

    /**
     * 增加10G流量包
     */
    private void add10G() {
        System.out.println("增加10G流量包");
    }

    @Override
    public void addAdditionalBusiness() {
        super.addAdditionalBusiness();
        // 在原有的基础上增加10G流量包这个额外的行为
        add10G();
    }
}
