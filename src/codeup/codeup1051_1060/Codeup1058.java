package codeup.codeup1051_1060;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");
        int input1 = Integer.parseInt(arr[0]);
        int input2 = Integer.parseInt(arr[1]);
        if(input1 == input2 && input1 == 0){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}