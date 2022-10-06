package oct06.readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// 강사님 설명 코드
public class FileExercise {
    public static void main(String[] args) throws FileNotFoundException {
        // FileNotFoundException 은 파일이 없을 수도 있으므로 만들어둔다.
        // ./
//        FileReader fileReader = new FileReader("./aa_file.txt");

        // ./ 최상위 디렉토리로 접근 가능
        File dir = new File("./");
        // 현재 디렉토리에 있는 파일
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    /*
    .\.git
    .\.gitignore
    .\.idea
    .\aa_file.txt
    .\afile.txt
    .\java-project-push-exercise.iml
    .\out
    .\README.md
    .\src
     */
}
