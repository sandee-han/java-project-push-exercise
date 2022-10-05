package oct05.calculator_re;

public class Main {
    public static void main(String[] args) {
        NumberMaker numberMaker = new RandomNumberMaker();
        Calculator randomNumberCalculator = new Calculator(numberMaker);   // 객체 생성시 어떤 NumberMaker 를 쓸건지 입력해야함 (랜덤인지, specific 인지)
        randomNumberCalculator.plus(20);

        Calculator byPassCalculator = new Calculator(new ByPassNumberMaker());    // 여기서 바로 new를 써도 된다.
        byPassCalculator.plus(10);
    }
}
