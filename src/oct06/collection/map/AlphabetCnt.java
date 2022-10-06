package oct06.collection.map;

import java.util.HashMap;

public class AlphabetCnt {

    //대문자 65 ~ 90, 소문자 97~122 if((c >= 65 and c< 90) or ())
    // 알파벳인지 확인하는 function
    public boolean isAlphabet(char ch) {
        //  내꺼
//        if((int)c >= 97 && (int)c < 122){
//            return true;
//        } else {
//            return false;
//        }
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        AlphabetCnt alphabetCnt = new AlphabetCnt();
        String s1 = "abccddefghijkkkkkllm".toUpperCase();

        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        for (char c = 'A'; c < 'Z'; c++){
            alphabetMap.put(c, 0);
        }

        // String을 한글자씩 출력할 수 있어야한다.
        for(int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i);
            boolean isAlphabet = alphabetCnt.isAlphabet(c);
            if(isAlphabet) {
                // 여기서만 개수를 센다
                alphabetMap.put(c, alphabetMap.get(c) + 1);
            }
        }
        System.out.println(alphabetMap);

    }

}
