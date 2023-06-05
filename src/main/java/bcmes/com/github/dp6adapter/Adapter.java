package bcmes.com.github.dp6adapter;

public class Adapter extends RedondoPino {
    private QuadradoPino peg;

    public Adapter(QuadradoPino peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        // Calculate a minimum circle radius, which can fit this peg.
        return (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
    }
}
