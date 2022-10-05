package oct05;

interface RandomGen {
    public int NumGen(int input);
}

public class Calculator2 implements RandomGen{
    private int a, b;

    public Calculator2(int a) {
        this.a = a;
        this.b = NumGen(b);
        System.out.printf("a: %d, b: %d\n", a, b);
    }

    public void plus() {
        System.out.println(a + b);
    }

    public void sub() {
        System.out.println(a - b);
    }

    public void div() {
        if(b == 0){
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        } else {
            System.out.println(a / (double)b);
        }

    }

    public void multiple() {
        System.out.println(a * b);
    }

    @Override
    public int NumGen(int input) {
        input = (int) (Math.random() * 9);
        return input;
    }
}
