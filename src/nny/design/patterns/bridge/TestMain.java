package nny.design.patterns.bridge;

/**
 * @author shengyong.huang
 * @date 2020-07-17
 */
public class TestMain {

    public static void main(String[] args) {
        AbstractPen smallPen = new SmallPen();
        AbstractPen middlePen = new MiddlePen();
        AbstractPen bigPen = new BigPen();

        Color red = new Red();
        Color blue = new Blue();
        Color green = new Green();

        smallPen.setColor(red);
        smallPen.draw("鲜花");

        middlePen.setColor(blue);
        middlePen.draw("牛粪");

        bigPen.setColor(green);
        bigPen.draw("老黄牛");

    }
}
