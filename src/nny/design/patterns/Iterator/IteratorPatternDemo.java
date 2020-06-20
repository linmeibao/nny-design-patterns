package nny.design.patterns.Iterator;

/**
 * 测试demo
 *
 * @author shengyong.huang
 * @date 2020-06-20
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();


        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
