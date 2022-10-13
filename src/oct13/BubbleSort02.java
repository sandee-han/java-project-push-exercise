package oct13;


import java.util.Arrays;

public class BubbleSort02 {
    public int[] Sort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++){
                if (arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort02 bubbleSort02 = new BubbleSort02();
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};

        System.out.println(Arrays.toString(bubbleSort02.Sort(arr)));
    }
}
