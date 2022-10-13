package oct13;

import java.util.Arrays;

public class BubbleSort01 {

    public int[] Sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] > array[i+1]){
                temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        BubbleSort01 bubbleSort01 = new BubbleSort01();

        int[] arr = new int[]{7, 2, 3, 9, 28, 11};

        System.out.println(Arrays.toString(bubbleSort01.Sort(arr)));

    }
}
