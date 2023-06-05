package bcmes.com.github.dp6adapter;

public class QuadradoPino {
    private double width;

    public QuadradoPino(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return Math.pow(this.width, 2);
    }
}
