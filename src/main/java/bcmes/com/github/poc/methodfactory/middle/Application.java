package bcmes.com.github.poc.methodfactory.middle;

public class Application {
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println("\n" + client.anyOperation());
    }
}
