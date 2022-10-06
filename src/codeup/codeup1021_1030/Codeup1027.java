package codeup.codeup1021_1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] array = input.split("\\.");
        System.out.println(array[2] + "-" + array[1] + "-" + array[0]);
    }
}
