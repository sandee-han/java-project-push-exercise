package oct04;

public class CurrencyCnt3 {
    public static void main(String[] args) {
        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;
        int curr50 = 50;
        int curr10 = 10;

        int refund = 25000;

        System.out.printf("5만원권 %d장, 나머지: %d\n", refund / curr50000, refund% curr50000);
        System.out.printf("1만원권 %d장 나머지: %d\n", refund / curr10000, refund % curr10000);
        System.out.printf("5천원권 %d장 나머지: %d\n", refund / curr5000, refund % curr5000);
        System.out.printf("천원권 %d장 나머지: %d\n", refund / curr1000, refund % curr1000);
        System.out.printf("500원 %d개 나머지: %d\n", refund / curr500, refund % curr500);
        System.out.printf("100원 %d개 나머지: %d\n", refund / curr100, refund % curr100);
        System.out.printf("50원 %d개 나머지: %d\n", refund / curr50, refund % curr50);
        System.out.printf("10원 %d개 나머지: %d\n", refund / curr10, refund % curr10);


    }
}
