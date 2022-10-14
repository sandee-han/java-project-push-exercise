package oct14;

import java.util.Arrays;

public class InsertionSort01 {
    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};
        Sort sort = new Sort();
        System.out.println(Arrays.toString(sort.Insertion(arr)));
    }
}
