package codeup.codeup1021_1030;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Codeup1029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        DecimalFormat form = new DecimalFormat("#.00000000000");
        System.out.println(form.format(input));
    }
}
