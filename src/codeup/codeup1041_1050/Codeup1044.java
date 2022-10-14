package codeup.codeup1041_1050;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1044 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int i = Integer.parseInt(input);
        System.out.println((long)i + 1);
    }
}
