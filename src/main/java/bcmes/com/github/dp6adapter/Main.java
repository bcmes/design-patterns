package bcmes.com.github.dp6adapter;

public class Main {
    public static void main(String[] args) {
        // Round fits round, no surprise.
        RedondoBuraco hole = new RedondoBuraco(5);
        RedondoPino rpeg = new RedondoPino(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        QuadradoPino smallSqPeg = new QuadradoPino(2);
        QuadradoPino largeSqPeg = new QuadradoPino(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        Adapter smallSqPegAdapter = new Adapter(smallSqPeg);
        Adapter largeSqPegAdapter = new Adapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
