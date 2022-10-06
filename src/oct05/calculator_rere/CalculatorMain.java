package oct05.calculator_rere;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new ByPassNumberCreator());
        calculator.plus(10);

    }
}
