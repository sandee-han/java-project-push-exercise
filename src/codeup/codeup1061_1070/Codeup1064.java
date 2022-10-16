package codeup.codeup1061_1070;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");
        int i1 = Integer.parseInt(arr[0]);
        int i2 = Integer.parseInt(arr[1]);
        int i3 = Integer.parseInt(arr[2]);

        int compare = i1 > i2 ? i2 : i1;
        int result = compare > i3 ? i3 : compare;
        System.out.println(result);
    }
}
