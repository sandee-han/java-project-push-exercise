package oct17;

public class StarAlgorithm {

    private int number;
    private String type;

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public StarAlgorithm(int number, String type) {
        this.number = number;
        this.type = type;
    }

    public StarAlgorithm() {
    }

    public void makeRightTriangle() {
        for (int i = 1; i <= number; i++){
            for (int j = 0; j < i; j++) {
                System.out.printf("%s ", type);
            }
            System.out.println("");
        }
    }

    public void makeStarPyramid() {
        for(int i = 0; i < number; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
                System.out.printf("%s ", type);
            }
            System.out.println();
        }
    }
}
