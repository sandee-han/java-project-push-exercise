package oct05.calculator_re;

public class Calculator {
    // NumberMaker에서 만들어준 숫자를 가지고
    // 사칙 연산한 결과를 출력한다.
    private NumberMaker numberMaker;
    private int baseNum = 10;

    public Calculator(NumberMaker numberMaker) {    // NumberMaker를 파라미터로 받는 constructor 생성
        this.numberMaker = numberMaker;
    }

    public Calculator(NumberMaker numberMaker, int baseNum) {
        this.numberMaker = numberMaker;
    }

    public void plus(int num) {
        int result = num + this.numberMaker.make(this.baseNum);
        System.out.println(result);
    }
}
