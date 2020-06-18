package nny.design.patterns.lsc.entity;

/**
 * @author shengyong.huang
 * @date 2019/9/12
 */
public class CommodityEntity {
    /**
     * id
     */
    private Integer id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 色卡id
     */
    private Integer colourCardId;

    /**
     * 分类id
     */
    private Integer CategoryId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getColourCardId() {
        return colourCardId;
    }

    public void setColourCardId(Integer colourCardId) {
        this.colourCardId = colourCardId;
    }

    public Integer getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(Integer categoryId) {
        CategoryId = categoryId;
    }
}
