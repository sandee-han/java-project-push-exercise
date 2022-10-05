package codeup_C_basic.codeup1011_1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1019 {
    public static void main(String[] args) throws IOException {
        String year = "";
        String month = "";
        String day = "";


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 선언
        String s = br.readLine(); // String입력 받음
        br.close();

        // 입력받은 값 .로 구분
        // . 으로 구분 시 \\. 이나 [.] 와 같은 형식으로 split()에 입력해야 한다.
        String[] array = s.split("\\.");

        // year 확인 후 10 보다 작을 경우 000 추가
        // 100 보다 작을 경우 00 추가
        // 1000 보다 작을 경우 0 추가
        if(Integer.parseInt(array[0]) < 10){
            year = "000" + array[0];
        } else if(Integer.parseInt(array[0]) < 100) {
            year = "00" + array[0];
        } else if(Integer.parseInt(array[0]) < 1000) {
            year = "0" + array[0];
        } else {
            year = array[0];
        }


        // month 확인 후 10 보다 작을 경우 0 추가
        if(Integer.parseInt(array[1]) < 10){
            month = "0" + array[1];
        } else {
            month = array[1];
        }

        // day 확인 후 10보다 작을 경우 0 추가
        if(Integer.parseInt(array[2]) < 10){
            day = "0" + array[2];
        } else {
            day  = array[2];
        }
        System.out.println(year + "." + month + "." + day);
    }
}
