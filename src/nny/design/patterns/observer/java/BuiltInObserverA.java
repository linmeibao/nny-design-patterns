package nny.design.patterns.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * java内置观察者对象
 *
 * @author shengyong.huang
 * @date 2019/9/4
 */
public class BuiltInObserverA implements Observer {

    /**
     * 内置主题对象
     */
    private Observable observable;

    /**
     * 构造方法中向主题对象注册自己
     *
     * @param observable 主题对象
     */
    public BuiltInObserverA(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);

    }

    @Override
    public void update(Observable o, Object arg) {

        System.out.println(observable.countObservers());

        if (o instanceof BuiltInSubject) {
            BuiltInSubject subject = (BuiltInSubject) o;
            System.out.println("ObserverA receive " + subject.getState() + " arg :" + arg);
        }
    }
}
