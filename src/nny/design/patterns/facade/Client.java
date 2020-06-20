package nny.design.patterns.facade;

/**
 * 客户端调用
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public class Client {
    public static void main(String[] args) {

        SystemFacade systemFacade = new SystemFacade();

        // 调用高层接口，让子系统更容易使用
        systemFacade.start();
        // 调用高层接口，让子系统更容易使用
        systemFacade.on();
        // 调用高层接口，让子系统更容易使用
        systemFacade.off();
    }

}
