package nny.design.patterns.composite;

/**
 * @author shengyong.huang
 * @date 2020-06-20
 */
public class ImagerFile extends File {

    public ImagerFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是图像文件，文件名：" + super.getName());
    }

}
