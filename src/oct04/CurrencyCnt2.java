package oct04;

import java.util.Scanner;

public class CurrencyCnt2 {
    public static void main(String[] args) {
        int[] currencyCount = {50000, 10000, 5000, 1000, 500, 50, 10};
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하세요. ");
        int money = sc.nextInt();

        for(int i = 0; i < currencyCount.length; i++){
            if(money > currencyCount[i]){
                System.out.println(currencyCount[i] + "권: " + money / currencyCount[i] + "장");
                money %= currencyCount[i];
            } else {
                System.out.println(currencyCount[i] + "권: 0장");
            }
        }
    }
}
