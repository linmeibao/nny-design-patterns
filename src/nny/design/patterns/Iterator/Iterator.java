package nny.design.patterns.Iterator;

/**
 * 迭代器接口
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public interface Iterator {
    /**
     * 是否有下一个值
     *
     * @return bool
     */
    public boolean hasNext();

    /**
     * 下一个值
     *
     * @return 元素
     */
    public Object next();
}
