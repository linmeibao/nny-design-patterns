package nny.design.patterns.flyweight.onlyflyweight;

/**
 * 具体享元类
 *
 * @author shengyong.huang
 * @date 2020-07-22
 */
public class ConcreteFlyweight implements Flyweight {
    /**
     * 内蕴状态
     */
    private String intrinsicState = null;

    /**
     * 构造函数，内蕴状态作为参数传入
     *
     * @param intrinsicState
     */
    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为， 但是并不改变对象的内蕴状态。
     */
    @Override
    public void operation(String state) {
        System.out.println("内蕴状态= " + this.intrinsicState);
        System.out.println("外蕴状态 = " + state);
    }

}
