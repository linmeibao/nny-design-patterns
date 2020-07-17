package nny.design.patterns.bridge;

/**
 * @author shengyong.huang
 * @date 2020-07-17
 */
public class SmallPen extends AbstractPen {
    @Override
    public void draw(String name) {
        String penType = "小号毛笔绘制";
        this.color.bepaint(penType, name);
    }
}
