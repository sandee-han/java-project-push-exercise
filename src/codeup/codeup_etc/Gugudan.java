package codeup.codeup_etc;

interface Operation {
    int operation(int a, int b);
}

public class Gugudan {

    // + 와 * 만 바뀌면 되는 로직, interface를 사용해서 코드 복사 붙여넣기 보다는 call back 사용해보자
    public void playGugudanTemplate(int n, String operator, Operation operation) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", n, operator, i, operation.operation(n, i));
        }
    }

    public void playPlusGugudan(int n) {
        playGugudanTemplate(n, "+", new Operation() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        });
    }

    public void playMultipleGugudan(int n) {
        playGugudanTemplate(n, "*", new Operation() {
            @Override
            public int operation(int a, int b) {
                return a * b;
            }
        });
    }

    public static void main(String[] args) {
        int input = 2; // 몇 단을 출력할 것인지
        Gugudan gugudan = new Gugudan();

        gugudan.playPlusGugudan(input); // 더하기 구구단
        System.out.println("**********");
        gugudan.playMultipleGugudan(input); //구구단
    }
}