package nny.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题（被观察者）
 *
 * @author shengyong.huang
 * @date 2019/9/4
 */
public class Subject {

    /**
     * 观察者列表
     */
    List<Observer> observers = new ArrayList<>();

    /**
     * 被观察的状态
     */
    int state;

    /**
     * 获取状态
     *
     * @return
     */
    public int getState() {
        return state;
    }

    /**
     * 改变状态
     *
     * @param state
     */
    public void setState(int state) {
        this.state = state;
        // 状态被改变，通知所有观察者
        notifyAllObservers();
    }

    /**
     * 注册为观察者
     *
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 通知所有观察者
     */
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
