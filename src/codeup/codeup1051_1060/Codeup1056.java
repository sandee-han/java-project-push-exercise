package codeup.codeup1051_1060;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1056 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");
        int input1 = Integer.parseInt(arr[0]);
        int input2 = Integer.parseInt(arr[1]);
        if(input1 == 1 && input2 == 0){
            System.out.println("1");
        } else if(input1 == 0 && input2 == 1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
