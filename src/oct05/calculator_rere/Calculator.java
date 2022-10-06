package oct05.calculator_rere;

public class Calculator {

    NumberCreator numberCreator;
    private int baseNum;

    public void plus(int num){
        System.out.println(num + numberCreator.create(baseNum));

    }
    public Calculator(NumberCreator numberCreator) {
        this.numberCreator = numberCreator;
        this.baseNum = baseNum;
    }


    public Calculator(NumberCreator numberCreator, int baseNum) {
        this.numberCreator = numberCreator;
        this.baseNum = baseNum;
    }
}
