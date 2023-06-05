package bcmes.com.github.dp6adapter;

public class RedondoBuraco {
    private double radius;

    public RedondoBuraco(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RedondoPino peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
