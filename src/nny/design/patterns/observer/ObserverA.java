package nny.design.patterns.observer;

/**
 * 观察者A
 *
 * @author shengyong.huang
 * @date 2019/9/4
 */
public class ObserverA extends Observer {
    /**
     * 构造方法中向主题注册自己
     *
     * @param subject 主题对象
     */
    public ObserverA(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("ObserverA receive " + subject.getState());

    }
}
