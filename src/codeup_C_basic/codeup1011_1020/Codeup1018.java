package codeup_C_basic.codeup1011_1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 선언
        String s = br.readLine(); // String입력 받음
        br.close();
        String[] array = s.split(":"); // 입력받은 값 :로 구분
        System.out.println(array[0] + ":" + array[1]);
    }
}
