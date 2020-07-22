package nny.design.patterns.flyweight.composite;

import nny.design.patterns.flyweight.onlyflyweight.Flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试方法
 *
 * @author shengyong.huang
 * @date 2020-07-22
 */
public class TestMain {

    public static void main(String[] args) {
        List<String> compositeState = new ArrayList<>();
        compositeState.add("辣椒炒肉");
        compositeState.add("牛肉");
        compositeState.add("鸡肉");
        compositeState.add("辣椒炒肉");
        compositeState.add("牛肉");

        FlyweightFactory flyFactory = new FlyweightFactory();
        Flyweight compositeFly1 = flyFactory.factory(compositeState);
        Flyweight compositeFly2 = flyFactory.factory(compositeState);
        //外蕴状态是同一个
        compositeFly1.operation("小汤点菜");
        System.out.println();
        compositeFly2.operation("小王点菜");

        System.out.println("---------------------------------");
        System.out.println("复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));

        String state = "牛肉";
        Flyweight fly1 = flyFactory.factory(state);
        Flyweight fly2 = flyFactory.factory(state);
        System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2));
    }

}
