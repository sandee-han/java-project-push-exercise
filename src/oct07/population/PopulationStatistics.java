package oct07.population_statistics;

import java.io.FileReader;
import java.io.IOException;

public class PopulationStatistics {
    public static void main(String[] args) throws IOException {
        String address = "C:\\Users\\iwmis\\Documents\\문서류\\멋사\\기타 자료\\Mdis 2021 data\\2021_인구관련연간자료_20220927_66125.csv";
        FileReader fileReader = new FileReader(address);

        char c = (char)fileReader.read();
        System.out.println(c);
    }
}
