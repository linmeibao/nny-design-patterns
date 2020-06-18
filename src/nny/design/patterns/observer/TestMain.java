package nny.design.patterns.observer;


/**
 * 测试方法
 *
 * @author shengyong.huang
 * @date 2019/9/4
 */
public class TestMain {
    public static void main(String[] args) {

        // 主题对象（被观察者）
        Subject subject = new Subject();

        // 新建观察者对象，并向主题对象注册
        Observer observerA = new ObserverA(subject);
        Observer observerB = new ObserverB(subject);
        Observer observerC = new ObserverC(subject);

        // 改变主题对象中的状态，同时通知所有观察者
        subject.setState(0);
        subject.setState(1);
    }
}
