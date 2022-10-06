package oct06.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


// 내 코드
public class ReadFile {
    private String filename;

    void readOneLetter() throws  IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.print(line.charAt(0));
        }
    }

    void readTwoLetters() throws  IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.print(line.charAt(0) + " ");
            System.out.print(line.charAt(1) + " ");
        }
    }

    void readNumLetters(int num) throws  IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            try {
                for(int i = 0; i < num; i++) {
                    System.out.print(line.charAt(i) + " ");
                }
            } catch (StringIndexOutOfBoundsException e){

            }

        }
    }
    public ReadFile(String filename){
        this.filename = filename;
    }

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("afile.txt");
        readFile.readOneLetter();
        readFile.readTwoLetters();
        readFile.readNumLetters(15);
    }
}
