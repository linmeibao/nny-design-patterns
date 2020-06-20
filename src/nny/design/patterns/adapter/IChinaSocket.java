package nny.design.patterns.adapter;

/**
 * 中国大陆插座接口
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public interface IChinaSocket {

    /**
     * 插入插座充电
     *
     * @param chinaPlug 插头对象v
     */
    void provideChargingService(IChinaPlug chinaPlug);

}
