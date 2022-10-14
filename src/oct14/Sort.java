package oct14;

public class Sort {
    public int[] Insertion(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] Swap(int[] arr) {
        if (arr[1] < arr[0]) {
            int temp = arr[1];
            arr[1] = arr[0];
            arr[0] = temp;
        }
        return arr;
    }
}
