package bcmes.com.github.dp3build.middle.car;

public class Manual {
    private String seats;
    private String engine;
    private String gps;
    //diversos oucolortros atributos...
    //teria de gerar o boilerplate code...

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "seats='" + seats + '\'' +
                ", engine='" + engine + '\'' +
                ", gps='" + gps + '\'' +
                '}';
    }
}