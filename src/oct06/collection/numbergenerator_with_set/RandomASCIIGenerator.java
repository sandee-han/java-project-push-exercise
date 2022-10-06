package oct06.collection.numbergenerator_with_set;

import java.util.HashSet;
import java.util.Set;

public class RandomASCIIGenerator implements NumberGenerator{
    private Set<Integer> asciiNumbers = new HashSet<>();

    public Set<Integer> getAsciiNumbers() {
        return asciiNumbers;
    }
    @Override
    public int generate(int num) {
        return (int)((Math.random() * num) + 65);
    }
}
