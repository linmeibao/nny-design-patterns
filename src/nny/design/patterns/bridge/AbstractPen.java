package nny.design.patterns.bridge;

/**
 * 毛笔抽象类
 *
 * @author shengyong.huang
 * @date 2020-07-17
 */
public abstract class AbstractPen {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(String name);
}
