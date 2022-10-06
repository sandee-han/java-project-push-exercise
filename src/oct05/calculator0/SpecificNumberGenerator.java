package oct05.calculator0;

public class SpecificNumberGenerator implements NumberGenerator{

    // 고정된 값 리턴
    @Override
    public int generate(int num) {
        return 2000 * num;
    }
}
