package nny.design.patterns.observer;

/**
 * 观察者B
 *
 * @author shengyong.huang
 * @date 2019/9/4
 */
public class ObserverB extends Observer {
    /**
     * 构造方法中向主题注册自己
     *
     * @param subject 主题对象
     */
    public ObserverB(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("ObserverB receive " + subject.getState());
    }
}
