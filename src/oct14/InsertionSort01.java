package oct14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertionSort01 {
    public static void main(String[] args) throws IOException {
        Sort sort = new Sort();
        Array array = new Array();

        System.out.println("Swap Result: " + Arrays.toString(sort.Swap(array.getArr())));
        System.out.println("Insertion Result: " + Arrays.toString(sort.Insertion(array.getArr())));
        System.out.println("Insertion2 Result: " + Arrays.toString(sort.Insertion2(array.getArr(), 1)));
    }
}
