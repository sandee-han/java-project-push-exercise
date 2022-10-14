package codeup.codeup1041_1050;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");
        int i1 = Integer.parseInt(arr[0]);
        int i2 = Integer.parseInt(arr[1]);

        System.out.println((int)(i1 * (Math.pow(2, i2))));
    }
}
