package codeup.codeup1061_1070;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");

        System.out.println(Integer.parseInt(arr[0]) > Integer.parseInt(arr[1]) ? Integer.parseInt(arr[0]) : Integer.parseInt(arr[1]));
    }
}
