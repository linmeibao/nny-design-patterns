package nny.design.patterns.builder;

/**
 * @author shengyong.huang
 * @date 2020-07-21
 */
public class TestMain {
    public static void main(String[] args) {
        Director director = new Director();

        ComputerBuilder hp = new HPComputerBuilder();

        director.setComputerBuilder(hp);

        director.constructComputer();

        //get the pc
        Computer pc = director.getComputer();

    }
}
