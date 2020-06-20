package nny.design.patterns.facade;

/**
 * 系统A
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public class SystemAService {

    public void start() {
        System.out.println("SystemAService start");
    }

    public void on() {
        System.out.println("SystemAService on");
    }

    public void off() {
        System.out.println("SystemAService off");
    }
}
