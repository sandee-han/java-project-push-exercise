package oct07.population_rok;

import java.io.IOException;

public class PopulationMove {
    private String address = "C:\\Users\\iwmis\\Documents\\문서류\\멋사\\기타 자료\\Mdis 2021 data\\2021_인구관련연간자료_20220927_66125.csv";
    private String sample = "50,130,62000,2021,12,20,26,350,52000,1,1,027,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,528528";
    private int fromSido;
    private int toSido;

    public String getAddress() {
        return address;
    }

    public String getSample() {
        return sample;
    }

    // constructor 추가 fromSido, toSido를 받아서 멤버변수에 넣는 기능
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public PopulationMove(String fromSido, String toSido) {
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
    }



    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }


}
