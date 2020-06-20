package nny.design.patterns.Iterator;

/**
 * 元素容器
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public interface Container {
    /**
     * 获取迭代器
     *
     * @return 迭代器实例
     */
    public Iterator getIterator();
}
