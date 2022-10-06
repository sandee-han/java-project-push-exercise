package oct06.readfile;

import java.io.FileReader;
import java.io.IOException;

// 강사님 코드
public class ReadAFile {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("afile.txt");
        char c = (char) reader.read();
        System.out.println(c);
    }
}
