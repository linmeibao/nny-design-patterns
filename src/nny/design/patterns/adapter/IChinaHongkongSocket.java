package nny.design.patterns.adapter;

/**
 * 中国香港插座接口
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public interface IChinaHongkongSocket {
    /**
     * 插入插座充电
     *
     * @param hongkongPlug 插头对象v
     */
    void provideChargingService(IChinaHongkongPlug hongkongPlug);
}
