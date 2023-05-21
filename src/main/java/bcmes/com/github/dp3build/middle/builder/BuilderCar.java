package bcmes.com.github.dp3build.middle.builder;

import bcmes.com.github.dp3build.middle.car.Car;

public class BuilderCar implements Builder {
    private final Car car;

    public BuilderCar() {
        this.car = new Car();
    }

    @Override
    public Builder seats(int seats) {
        car.setSeats(seats);
        return this;
    }

    @Override
    public Builder engine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public Builder gps(boolean isGps) {
        car.setGps(isGps);
        return this;
    }

    public Car build() {
        return this.car;
    }
}