package oct14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertionSort01 {
    public static void main(String[] args) throws IOException {
        int[] arr = {8, 5, 6, 2, 4};
        Sort sort = new Sort();
        System.out.println(Arrays.toString(sort.Swap(arr)));
        System.out.println(Arrays.toString(sort.Insertion(arr)));
    }
}
