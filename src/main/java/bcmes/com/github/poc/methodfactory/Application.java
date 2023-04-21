package bcmes.com.github.poc.methodfactory;

import bcmes.com.github.poc.methodfactory.client.Client;

public class Application {
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println("\n" + client.anyOperation());
    }
}
