package nny.design.patterns.observer.java;

import java.util.Observable;

/**
 * java内置主题对象
 *
 * @author shengyong.huang
 * @date 2019/9/4
 */
public class BuiltInSubject extends Observable {

    /**
     * 状态值
     */
    private int state;

    /**
     * 获取状态
     * @return
     */
    public int getState() {
        return state;
    }

    /**
     * 改变状态
     * @param state 状态值
     */
    public void setState(int state) {
        this.state = state;

        // 状态值改成成功，必须调用setChanged，将changed设置为true，标志状态已更新，否则调用notifyObservers不起作用
        // notifyObservers方法中对changed变量有做判断，每次通知完成之后会把changed设置为false。
        setChanged();

        // 直接通知不传参数
//        notifyObservers();
        // 通知并且传递参数
        notifyObservers("参数对象");
    }
}
