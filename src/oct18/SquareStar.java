package oct18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareStar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int size = Integer.parseInt(input);

        for (int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
