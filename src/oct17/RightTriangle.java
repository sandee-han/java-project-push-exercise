package oct17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RightTriangle {
    public static void main(String[] args) throws IOException {
        /*
        *
        * *
        * * *
        * * * *
        * * * * *
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        input = br.readLine();
        int number = Integer.parseInt(input);

        for (int i = 1; i <= number; i++){
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
