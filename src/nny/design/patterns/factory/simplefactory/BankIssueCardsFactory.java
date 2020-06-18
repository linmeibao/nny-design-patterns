package nny.design.patterns.factory.simplefactory;

/**
 * 银行发卡工厂类
 *
 * @author shengyong.huang
 * @date 2020-06-16
 */
public class BankIssueCardsFactory {

    /**
     * 静态发卡方法
     *
     * @param code 联名卡标识
     * @return 联名卡实例
     */
    public static AbstractCashCard issueCashCard(String code) {
        if ("bilibili".equals(code)) {
            return new BiliBiliCashCard();
        } else if ("KG".equals(code)) {
            return new KingGloryCashCard();
        } else if ("OP".equals(code)) {
            return new OnePieceCashCard();
        } else {
            throw new RuntimeException("未找到对应发卡CODE");
        }
    }
}
