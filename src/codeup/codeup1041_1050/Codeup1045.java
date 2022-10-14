package codeup.codeup1041_1050;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Codeup1045 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");
        int i1 = Integer.parseInt(arr[0]);
        int i2 = Integer.parseInt(arr[1]);
        DecimalFormat form = new DecimalFormat("#.00");

        System.out.println(i1 + i2);
        System.out.println(i1 - i2);
        System.out.println(i1 * i2);
        System.out.println(i1 / i2);
        System.out.println(i1 % i2);
        System.out.println(form.format((double)i1 / (double)i2));
    }
}
