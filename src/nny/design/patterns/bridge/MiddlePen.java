package nny.design.patterns.bridge;

/**
 * @author shengyong.huang
 * @date 2020-07-17
 */
public class MiddlePen extends AbstractPen {
    @Override
    public void draw(String name) {
        String penType = "中号毛笔绘制";
        this.color.bepaint(penType, name);
    }
}
