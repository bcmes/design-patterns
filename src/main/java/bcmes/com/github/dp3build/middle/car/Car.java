package bcmes.com.github.dp3build.middle.car;

public class Car {
    private int seats;
    private String engine;
    private boolean gps;
    //diversos oucolortros atributos...
    //teria de gerar o boilerplate code...

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine='" + engine + '\'' +
                ", gps=" + gps +
                '}';
    }
}