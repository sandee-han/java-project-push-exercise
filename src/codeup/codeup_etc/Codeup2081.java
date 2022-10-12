package codeup.codeup_etc;

public class Codeup2081 {

    public int[] getMax(int arr[]){
        // loop 구성
        int maxIdx = 0;
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIdx = i;
            }
        }
        return new int[]{maxValue, maxIdx};
    }

    public int[] getMin(int arr[]){
        // loop 구성
        int minIdx = 0;
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > minValue) {
                minValue = arr[i];
                minIdx = i;
            }
        }
        return new int[]{minValue, minIdx};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        Codeup2081 codeup2081 = new Codeup2081();

        System.out.println(codeup2081.getMax(arr)[0]);
        System.out.println(codeup2081.getMax(arr)[1] + 1);
    }
}
