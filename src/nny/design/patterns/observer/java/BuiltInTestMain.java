package nny.design.patterns.observer.java;

import java.util.Observer;

/**
 * 测试方法
 *
 * @author shengyong.huang
 * @date 2019/9/4
 */
public class BuiltInTestMain {

    public static void main(String[] args) {
        BuiltInSubject builtInSubject = new BuiltInSubject();
        Observer builtInObserverA = new BuiltInObserverA(builtInSubject);

        builtInSubject.setState(0);
        builtInSubject.setState(1);
    }
}
