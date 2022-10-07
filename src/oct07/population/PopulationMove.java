package oct07.population;

public class PopulationiMove {
    private int fromSido;
    private int toSido;

    // constructor 추가 fromSido, toSido를 받아서 멤버변수에 넣는 기능
    public PopulationiMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }
}
