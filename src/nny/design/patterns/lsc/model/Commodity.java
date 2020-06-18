package nny.design.patterns.lsc.model;

/**
 * 商品Model
 */
public class Commodity {
    /**
     * id
     */
    private Integer id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 色卡对象
     */
    private ColourCard colourCard;

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

    public ColourCard getColourCard() {
        return colourCard;
    }

    public void setColourCard(ColourCard colourCard) {
        this.colourCard = colourCard;
    }
}
