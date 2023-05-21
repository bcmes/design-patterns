package bcmes.com.github.dp3build.simple;

public class Car {
    private String color;
    private int numberDoors;
    //diversos outros atributos...
    //teria de gerar o boilerplate code...

    public static class Builder {
        private final Car car;

        public Builder() {
            this.car = new Car();
        }

        public Builder color(String color) {
            this.car.color = color;
            return this;
        }

        public Builder numberDoors(int numberDoors) {
            this.car.numberDoors = numberDoors;
            return this;
        }

        public Car build() {
            return this.car;
        }

        //Com diretor embutido
        public Builder ferrari() {
            return Director.ferrari(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", numberDoors=" + numberDoors +
                '}';
    }
}