package nny.design.patterns.observer;

/**
 * 观察者父类
 *
 * @author shengyong.huang
 * @date 2019/9/4
 */
public abstract class Observer {

    /**
     * 主题（被观察者）
     */
    protected Subject subject;

    /**
     * 当观察值被改变时调用
     */
    public abstract void update();
}
