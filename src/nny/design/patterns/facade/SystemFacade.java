package nny.design.patterns.facade;

/**
 * 外观服务
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public class SystemFacade {

    /**
     * 子系统A
     */
    private SystemAService systemAService;
    /**
     * 子系统B
     */
    private SystemBService systemBService;
    /**
     * 子系统C
     */
    private SystemCService systemCService;

    public SystemFacade() {
        this.systemAService = new SystemAService();
        this.systemBService = new SystemBService();
        this.systemCService = new SystemCService();
    }

    /**
     * start服务
     */
    public void start() {
        systemAService.start();
        systemBService.start();
        systemCService.start();
    }

    /**
     * 统一开服务
     */
    public void on() {
        systemAService.on();
        systemBService.on();
        systemCService.on();
    }

    /**
     * 统一关服务
     */
    public void off() {
        systemAService.off();
        systemBService.off();
        systemCService.off();
    }
}
