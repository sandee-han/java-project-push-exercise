package oct06.collection.numbergenerator_with_set;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("한건주");
        set1.add("한건주");
        set1.add("조조");

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(3);


        System.out.println(set1);
        System.out.println(setInteger);
    }
}
