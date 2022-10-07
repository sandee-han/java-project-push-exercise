package oct06.readfile;

public class SidoNumToName {
    private String SidoName;

    public String getSidoName() {
        return SidoName;
    }

    public SidoNumToName(int num) {
        switch (num) {
            case 11: SidoName = "서울";
            case 12: SidoName = "";
        }
    }
}
