package nny.design.patterns.factory.abstractfactory.enginematerial;

/**
 * 本田点火系统
 *
 * @author shengyong.huang
 * @date 2020-06-18
 */
public class HondaIgnitionSystem extends AbstractIgnitionSystem {
    @Override
    public void startIgnitionSystem() {
        System.out.println("启动本田点火系统");
    }
}
