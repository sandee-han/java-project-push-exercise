package oct04;

import java.util.Scanner;

class Multiple {
    Scanner sc = new Scanner(System.in);

    public void getNum(int num){
        num = sc.nextInt();
    }

    public String checkMultiple(int num) {
        if(num % 7 == 0) {
            return "multiple";
        } else {
            return "not multiple";
        }
    }

}

public class MultipleofSeven {
    public static void main(String[] args) {
        Multiple multiple = new Multiple();
        int input = 0;
        multiple.getNum(input);
        System.out.println(multiple.checkMultiple(input));
    }
}
