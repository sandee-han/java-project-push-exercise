package oct07.populationreview;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PopulationStatistics {

    // 한 문장씩 읽어온다
    public void readByLine(String filename){
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)) {
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 파일에 내용을 작성
    public void write(List<String> strs, String filename){
        readByLine(filename);

    }

    // 파일 생성
    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        PopulationStatistics ps = new PopulationStatistics();
        ps.createAFile("from_to.txt");


    }

}
