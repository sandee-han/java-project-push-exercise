package oct07.population;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistics1 {



    public void readFileByLine(String filename) throws IOException {
//        FileReader fileReader = new FileReader((filename));
//        BufferedReader reader = new BufferedReader(fileReader);
        // 아래 new BufferedReader(new FileReader(filename)); 이 부분과 동일하다

        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();
    }

    public PopulationMove1 parse(String data) {
        String[] split = data.split(",");
        int fromSido = Integer.parseInt(split[0]);
        int toSido = Integer.parseInt(split[6]);

        return new PopulationMove1(fromSido, toSido);
    }



    public void readByChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String fileContents = "";
        while (fileContents.length() < 1_000_000) {
            char c = (char)fileReader.read();
            fileContents += c;
            System.out.println(fileContents);
        }
        System.out.println(fileContents);
    }

    // 요오즘 서타일
    public void readByLine2(String filename) {
        try(BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)){
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        String address = "C:\\Users\\iwmis\\Documents\\문서류\\멋사\\기타 자료\\Mdis 2021 data\\2021_인구관련연간자료_20220927_66125.csv";
        FileReader fileReader = new FileReader(address);
        // 여기까진 파일을 읽지 않는다.

        PopulationStatistics1 populationStatistics1 = new PopulationStatistics1();
//        populationStatistics.readFileByLine(address);
        populationStatistics1.readByLine2(address);




    }
}
