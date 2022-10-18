package oct18;

import java.io.IOException;

public class SquareAlgorithmMain {
    public static void main(String[] args) throws IOException {
        SquareStar squareStar = new SquareStar();
//        squareStar.Square(squareStar.getSize());
//        squareStar.Rectangle(squareStar.getSize(), squareStar.getSize());
        squareStar.RecursiveStar(squareStar.getSize(), 1);
    }
}
