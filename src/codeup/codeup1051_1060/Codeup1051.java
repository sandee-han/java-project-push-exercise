package codeup.codeup1051_1060;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");
        if(Integer.parseInt(arr[0]) <= Integer.parseInt(arr[1])){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
