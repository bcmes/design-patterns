package bcmes.com.github.methodfactory.simple;

import bcmes.com.github.methodfactory.simple.iphone.Iphone;
import bcmes.com.github.methodfactory.simple.iphone.Iphone11;
import bcmes.com.github.methodfactory.simple.iphone.IphoneX;

public class Client {
    //Não tem nada haver com a responsabilidade dessa classe, mas você pode encontrar no client.
    private Iphone factory(Class<?> type) {
        if (type == Iphone11.class)
            return new Iphone11();
        else if (type == IphoneX.class)
            return new IphoneX();
        else throw new IllegalArgumentException("Invalid type.");
    }

    public static void main(String[] args) {
        Client client = new Client();
        Iphone iphone = client.factory(Iphone11.class);
        System.out.println("\nFinished operation with " + iphone.getClass().getSimpleName() + ".");
    }
}