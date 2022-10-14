package codeup.codeup1041_1050;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1042 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");
        System.out.println(Integer.parseInt(arr[0]) / Integer.parseInt(arr[1]));
    }
}
