package oct06.collection;

public class AlphabetCnt {

    //대문자 65 ~ 90, 소문자 97~122 if((c >= 65 and c< 90) or ())
    // 알파벳인지 확인하는 function
    public boolean isAlphabet(char c) {
        if((int)c >= 97 && (int)c < 122){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        AlphabetCnt alphabetCnt = new AlphabetCnt();
        String s1 = "ab53c12cd:d'e2fghij21kkkkkl12lm";

        // String을 한글자씩 출력할 수 있어야한다.
        for(int i = 0; i < s1.length(); i++){
            if(alphabetCnt.isAlphabet(s1.charAt(i))) {
                System.out.print(s1.charAt(i) + " ");
            }
        }


    }

}
