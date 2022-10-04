package oct04;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("금액을 넣으세요: ");
        int money = scan.nextInt();
        int change = 0;
        int count = 0;
        if (money > 50000) {
            count = money / 50000;
            money %= 50000;
            System.out.println("50000원 " + count + "개");
        } else {
            System.out.println("50000원 0개");
        }
        if (money > 10000) {
            count = money / 10000;
            money %= 10000;
            System.out.println("10000원 " + count + "개");
        }else {
            System.out.println("10000원 0개");
        }
        if (money > 5000) {
            count = money / 5000;
            money %= 5000;
            System.out.println("5000원 " + count + "개");
        }else {
            System.out.println("5000원 0개");
        }
        if (money > 1000) {
            count = money / 1000;
            money %= 1000;
            System.out.println("1000원 " + count + "개");
        }else {
            System.out.println("1000원 0개");
        }
        if (money > 500) {
            count = money / 500;
            money %= 500;
            System.out.println("500원 " + count + "개");
        }else {
            System.out.println("500원 0개");
        }
        if (money > 100) {
            count = money / 100;
            money %= 100;
            System.out.println("100원 " + count + "개");
        }else {
            System.out.println("100원 0개");
        }
        if (money > 50) {
            count = money / 50;
            money %= 50;
            System.out.println("50원 " + count + "개");
        }else {
            System.out.println("50원 0개");
        }
        if (money > 10){
            count = money / 10;
            money %= 10;
            System.out.println("10원" + count + "개");
        }else {
            System.out.println("10원 0개");
        }
    }
}
