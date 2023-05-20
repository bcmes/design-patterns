package bcmes.com.github.dp3build.simple;

public class Client {
    public void anyOperation(){
        Car car0 = new Car.Builder().color("red").numberDoors(4).build();
        Car car1 = new Car.Builder().ferrari().build();

        System.out.println(car0);
        System.out.println(car1);
    }

    public static void main(String[] args) {
        new Client().anyOperation();
    }
}
