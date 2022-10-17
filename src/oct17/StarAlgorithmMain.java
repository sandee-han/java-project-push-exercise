package oct17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarAlgorithmMain {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("loop count");
        String input = br.readLine();
        int number = Integer.parseInt(input);
        System.out.println("letter type");
        String type = br.readLine();

        StarAlgorithm starAlgorithm = new StarAlgorithm(number, type);
        starAlgorithm.makeRightTriangle();
        starAlgorithm.makeStarPyramid();

    }
}
