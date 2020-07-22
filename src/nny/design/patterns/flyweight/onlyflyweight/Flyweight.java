package nny.design.patterns.flyweight.onlyflyweight;

/**
 * 抽象享元类
 *
 * @author shengyong.huang
 * @date 2020-07-22
 */
public interface Flyweight {
    /**
     * 一个示意性方法，参数state是外蕴状态
     *
     * @param state
     */
    void operation(String state);
}
