package oct17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarAlgorithm {
    public void RightTriangle(int number, String type) {
        for (int i = 1; i <= number; i++){
            for (int j = 0; j < i; j++) {
                System.out.printf("%s ", type);
            }
            System.out.println("");
        }
    }

    public void StarPyramid() {
        for(int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    public static void main(String[] args) throws IOException {
        StarAlgorithm starAlgorithm = new StarAlgorithm();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("loop count");
        String input = br.readLine();
        int number = Integer.parseInt(input);
        System.out.println("letter type");
        String type = br.readLine();

        starAlgorithm.RightTriangle(number, type);

    }
}
