package codeup.codeup1061_1070;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int i = Integer.parseInt(input);

        if (i >= 90) {
            System.out.println("A");
        } else if (i >= 70) {
            System.out.println("B");
        } else if (i >= 40) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

    }
}
