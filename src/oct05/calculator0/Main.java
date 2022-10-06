package oct05.calculator0;

public class Main {
    public static void main(String[] args) {
        Calculator specificNumberCalculator = new Calculator(new SpecificNumberGenerator());
        Calculator randomNumberCalculator = new Calculator(new RandomNumberGenerator());

        specificNumberCalculator.plus();
        randomNumberCalculator.plus();
    }
}
