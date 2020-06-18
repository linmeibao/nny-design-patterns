package nny.design.patterns.lsc.entity;

/**
 * @author shengyong.huang
 * @date 2019/9/12
 */
public class ColourCardEntity {

    /**
     * id
     */
    private Integer id;
    /**
     * 色卡Code
     */
    private String colorCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }
}
