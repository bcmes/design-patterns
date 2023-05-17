package bcmes.com.github.o2abstractfactory;

import bcmes.com.github.o2abstractfactory.factories.GuiFactoryWin;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.operation(new GuiFactoryWin());
    }
}
