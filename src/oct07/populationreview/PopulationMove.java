package oct07.populationreview;

public class PopulationMove {
    private int toSido;
    private int fromSido;
    public int getToSido() {
        return toSido;
    }
    public int getFromSido() {
        return fromSido;
    }
    public PopulationMove(int toSido, int fromSido) {
        this.toSido = toSido;
        this.fromSido = fromSido;
    }
}
