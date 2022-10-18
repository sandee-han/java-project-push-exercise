package oct18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareStar {
    private int i = 0;
    public int getSize() throws IOException {
        System.out.print("size: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        return Integer.parseInt(input);
    }

    public void Square(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void Rectangle(int x_size, int y_size) {
        for (int i = 1; i <= y_size; i++) {
            for (int j = 1; j <= x_size; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void RecursiveStar(int size, int now) {
        if(size < now) return;

        System.out.print("*".repeat(now));
        System.out.println();
        RecursiveStar(size, ++now);
    }

}
