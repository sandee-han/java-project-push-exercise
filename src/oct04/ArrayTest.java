package oct04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i <= 9; i++){
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }

}
