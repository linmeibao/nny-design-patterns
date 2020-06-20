package nny.design.patterns.composite;

/**
 * @author shengyong.huang
 * @date 2020-06-20
 */
public class VideoFile extends File{

    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是影像文件，文件名：" + super.getName());
    }

}
