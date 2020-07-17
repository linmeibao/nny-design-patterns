package nny.design.patterns.bridge;

/**
 * 颜色接口
 *
 * @author shengyong.huang
 * @date 2020-07-17
 */
public interface Color {
    /**
     * 填充颜色
     *
     * @param penType 笔类型
     * @param name    名称
     */
    void bepaint(String penType, String name);
}
