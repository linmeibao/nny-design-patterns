package nny.design.patterns.bridge;

/**
 * @author shengyong.huang
 * @date 2020-07-17
 */
public class White implements Color {
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "白色的" + name + ".");
    }
}
