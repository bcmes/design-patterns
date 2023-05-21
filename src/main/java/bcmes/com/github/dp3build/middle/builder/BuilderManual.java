package bcmes.com.github.dp3build.middle.builder;

import bcmes.com.github.dp3build.middle.car.Manual;

public class BuilderManual implements Builder{
    private final Manual manual;

    public BuilderManual() {
        this.manual = new Manual();
    }

    @Override
    public Builder seats(int seats) {
        manual.setSeats(""+seats);
        return this;
    }

    @Override
    public Builder engine(String engine) {
        manual.setEngine(engine);
        return this;
    }

    @Override
    public Builder gps(boolean isGps) {
        manual.setGps(""+isGps);
        return this;
    }

    public Manual build() {
        return manual;
    }
}
