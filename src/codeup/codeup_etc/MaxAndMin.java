package codeup.codeup_etc;

public class Codeup4596_Min {

    public int[] getMax(int arr[]) {
        // loop 구성
        int maxIdx = 0;
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < maxValue) {
                maxValue = arr[i];
                maxIdx = i;
            }
        }
        return new int[]{maxValue, maxIdx};
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {3, 23, 85, 34, 17, 74, 25, 52, 65},
                {10, 7, 39, 42, 88, 52, 14, 72, 63},
                {87, 42, 18, 78, 53, 45, 18, 84, 53},
                {34, 28, 64, 85, 12, 16, 75, 36, 55},
                {21, 77, 45, 35, 28, 75, 90, 76, 1},
                {25, 87, 65, 15, 28, 11, 37, 28, 74},
                {65, 27, 75, 41, 7, 89, 78, 64, 39},
                {47, 47, 70, 45, 23, 65, 3, 41, 44},
                {87, 13, 82, 38, 31, 12, 29, 29, 80}
        };
        // loop 를 돌아야한다. 9 * 9
        int minValue = arr[0][0];
        int[] minIdx = {0, 0};  // i, j
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                //
                int a = arr[i][j];  //   j가 i보다 먼저 바뀜
                //  j 가 0~9까지 한 번 돌면 i가 1씩 올라감
                int nowValue = arr[i][j];
                if (nowValue < minValue) {
                    minValue = arr[i][j];
                    minIdx[0] = i;
                    minIdx[1] = j;
                }
            }
        }

        System.out.println(minValue);
        System.out.printf("%d %d", minIdx[0] + 1, minIdx[1] + 1);

        Codeup4596_Min codeup4596 = new Codeup4596_Min();

    }
}