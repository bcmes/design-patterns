package bcmes.com.github.dp3build.simple;

//Para ser usado somente dentro do package simple
class Director {
    public static Car.Builder ferrari(Car.Builder build) {
        return build.color("red-ferrari").numberDoors(2);
    }

    public static Car.Builder fusca(Car.Builder build) {
        return build.color("blue").numberDoors(2);
    }
}
