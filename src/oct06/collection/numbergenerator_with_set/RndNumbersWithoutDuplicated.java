package oct06.collection;

import java.util.HashSet;
import java.util.Set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        RandomASCIIGenerator randomASCIIGenerator = new RandomASCIIGenerator();

        HashSet<Integer> numbers = new HashSet<>();
        HashSet<Character> ascii = new HashSet<>();

        // ASCII 코드 받아서 문자 CHAR로 변환
        System.out.println("ASCII CODE 입력 받고 알파벳으로 변환");
        for(int i = 0; i < 500; i++) {
            ascii.add((char)randomASCIIGenerator.generate(26));
        }
        System.out.println(ascii);
        System.out.println(ascii.size());

        // 랜덤 숫자 입력받기
        System.out.println("\n랜덤 숫자 생성 1 - 20");
        for(int i = 0; i < 500; i++){
            numbers.add(randomNumberGenerator.generate(20));
        }
        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
