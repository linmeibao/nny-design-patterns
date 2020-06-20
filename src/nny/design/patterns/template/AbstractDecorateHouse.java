package nny.design.patterns.template;

/**
 * 装修房子抽象类
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public abstract class AbstractDecorateHouse {

    /**
     * 装修房子的算法
     */
    public final void decorating() {
        hardDecorate();
        softDecorate();
    }

    /**
     * 房子的硬装
     */
    protected void hardDecorate() {
        System.out.println("开始房子的硬装铺设水管线路，铺设电路，安装瓷砖地板");
    }

    /**
     * 房子的软装
     */
    protected abstract void softDecorate();
}
