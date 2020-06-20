package nny.design.patterns.adapter;
/**
 * 中国大陆插头适配器（对象适配器实现）
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public class ChinaPlugAdapter implements IChinaPlug  {


    /**
     * 香港插头
     */
    private IChinaHongkongPlug hongkongPlug;


    /**
     * 构造器中初始化
     *
     * @param hongkongPlug 香港插头实例
     */
    public ChinaPlugAdapter(IChinaHongkongPlug hongkongPlug) {
        this.hongkongPlug = hongkongPlug;
    }


    @Override
    public void startCharging() {
        // 实际调用的是香港插头充电的方法
        hongkongPlug.receivePowerSupply();


    }
}
