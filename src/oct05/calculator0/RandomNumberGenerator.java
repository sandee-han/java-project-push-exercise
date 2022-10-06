package oct05.calculator0;

public class RandomNumberGenerator implements NumberGenerator {

    //  무작위 값 리턴
    @Override
    public int generate(int num) {
        return (int)(Math.random() * num);
    }
}
