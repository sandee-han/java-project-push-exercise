package codeup.codeup1021_1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for(int i = 0; i < input.length(); i++) {
            System.out.print("[");
            System.out.print(input.charAt(i));
            for(int j = input.length() - 1; j > i; j--){
                System.out.print("0");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
