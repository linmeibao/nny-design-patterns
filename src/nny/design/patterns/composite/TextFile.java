package nny.design.patterns.composite;

/**
 * @author shengyong.huang
 * @date 2020-06-20
 */
public class TextFile extends File {

    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是文本文件，文件名：" + super.getName());
    }

}
