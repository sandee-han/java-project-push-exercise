package oct05;

public class CaculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.printf("7 + 3 = %d\n", calculator.plus(7, 3));
        System.out.printf("7 - 3 = %d\n", calculator.sub(7, 3));
        System.out.printf("1 / 2 = %f\n", calculator.div(1, 2));
        System.out.printf("7 * 3 = %d", calculator.multiple(7, 3));
    }
}
