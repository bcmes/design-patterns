package bcmes.com.github.dp3build.simple;

public class Car {
    private String color;
    private int numberDoors;
    //diversos outros atributos...
    //teria de gerar o boilerplate code...

    public static class Builder {
        private final Car car;
        private final Builder builder;

        public Builder() {
            this.car = new Car();
            this.builder = this;
        }

        public Builder color(String color) {
            this.car.color = color;
            return this.builder;
        }

        public Builder numberDoors(int numberDoors) {
            this.car.numberDoors = numberDoors;
            return this.builder;
        }

        public Car build() {
            return this.car;
        }

        //Com diretor embutido
        public Builder ferrari() {
            return Director.ferrari(builder);
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