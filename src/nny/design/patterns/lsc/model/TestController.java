package nny.design.patterns.lsc.model;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class TestController {

    /**
     * 搜索商品接口
     * @param name  商品名称
     * @return  分类列表，每个分类中包含商品列表，商品的名称将和name进行模糊匹配
     */
    public List<CategoryDto> list(String name){
        return new ArrayList<CategoryDto>();
    }
}
