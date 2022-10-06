package oct06.collection.numbergenerator_with_set;

import java.util.HashSet;
import java.util.Set;

public class RandomNumberGenerator implements NumberGenerator{
    private Set<Integer> numbers = new HashSet<>();
    @Override
    public int generate(int num) {
        return (int)(Math.random() * num);
    }

    public Set<Integer> getNumbers() {
        return numbers;
    }

}
