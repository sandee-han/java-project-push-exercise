package oct05;

public class Calculator {
    private int a, b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void plus() {
        System.out.println(a + b);
    }

    public void sub() {
        System.out.println(a - b);
    }

    public void div() {
        System.out.println(a / (double)b);
    }

    public void multiple() {
        System.out.println(a * b);
    }
}
