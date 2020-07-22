package nny.design.patterns.flyweight.onlyflyweight;

/**
 * 测试方法
 *
 * @author shengyong.huang
 * @date 2020-07-22
 */
public class TestMain {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly1 = factory.factory(new String("辣椒炒肉"));
        fly1.operation("王先生点菜");

        Flyweight fly2 = factory.factory(new String("牛肉"));
        fly2.operation("黄先生点菜");

        Flyweight fly3 = factory.factory(new String("辣椒炒肉"));
        fly3.operation("汤先生点菜");

        System.out.println(fly1 == fly3);
        System.out.println("被点不同的菜的个数" + factory.getFlyWeightSize());
    }
}
