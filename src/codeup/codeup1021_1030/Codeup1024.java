package codeup.codeup1021_1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] array = s.split("");
        for(int i = 0; i < array.length; i++) {
            System.out.println("'" + array[i] + "'");
        }
    }
}
