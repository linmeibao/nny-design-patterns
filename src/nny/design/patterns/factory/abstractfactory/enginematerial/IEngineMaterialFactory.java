package nny.design.patterns.factory.abstractfactory.enginematerial;

/**
 * 汽车发动机材料抽象工厂
 *
 * @author shengyong.huang
 * @date 2020-06-18
 */
public interface IEngineMaterialFactory {

    /**
     * 创建燃油供给系统
     *
     * @return 燃油供给系统
     */
    AbstractFuelSupplySystem createFuelSupplySystem();

    /**
     * 创建点火系统
     *
     * @return 点火系统
     */
    AbstractIgnitionSystem createIgnitionSystem();

    /**
     * 创建冷却系统
     *
     * @return 冷却系统
     */
    AbstractCoolingSystem createCoolingSystem();

}
