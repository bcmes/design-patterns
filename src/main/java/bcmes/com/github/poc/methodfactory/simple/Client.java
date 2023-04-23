package bcmes.com.github.poc.methodfactory.simple;

import bcmes.com.github.poc.methodfactory.simple.iphone.Iphone;
import bcmes.com.github.poc.methodfactory.simple.iphone.Iphone11;
import bcmes.com.github.poc.methodfactory.simple.iphone.IphoneX;

public class Client {
    private Iphone device = null;

    //Não tem nada haver com a responsabilidade dessa classe, mas ten Dev que deixa no client mesmo :(
    private Iphone factory(Class<?> type) {
        if (type == Iphone11.class)
            return new Iphone11();
        else if (type == IphoneX.class)
            return new IphoneX();
        else return null;
    }

    //....
    public String anyOperation() {
        //....
        device = factory(Iphone11.class);
        //....
        assert device != null : "Iphone model not found.";
        return "Finished operation with " + device.getClass().getSimpleName() + ".";
    }
    //....
}