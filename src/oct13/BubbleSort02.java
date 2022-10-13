package oct13;


import java.util.Arrays;

public class SelectionSort01 {


    public int[] Sort(int[] arr){
        int temp;
        for(int i = 1 ; i < arr.length ; i ++) {
            if(arr[0] > arr[i]) {
                temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
            }
        }


        return arr;
    }

    public static void main(String[] args) {
        SelectionSort01 selectionSort = new SelectionSort01();
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};

        System.out.println(Arrays.toString( selectionSort.Sort(arr) ));
    }
}
