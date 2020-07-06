package nny.design.patterns.state;

/**
 * 状态抽象类
 *
 * @author shengyong.huang
 * @date 2020-07-05
 */
public abstract class State {

    /**
     * 订单对象
     */
    protected Order order;

    /**
     * 状态处理抽象方法
     */
    protected abstract void handle();
}
