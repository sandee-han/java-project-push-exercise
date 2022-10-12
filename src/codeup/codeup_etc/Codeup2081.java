package codeup.codeup_etc;

public class Codeup4596 {

    public int getMax(int arr[]){
        // loop 구성
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        Codeup4596 codeup4596 = new Codeup4596();

        System.out.println(codeup4596.getMax(arr));
    }
}
