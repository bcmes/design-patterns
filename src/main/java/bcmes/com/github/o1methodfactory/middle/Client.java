package bcmes.com.github.o1methodfactory.middle;

import bcmes.com.github.o1methodfactory.middle.factory.IphoneFactory;
import bcmes.com.github.o1methodfactory.middle.iphone.Iphone;
import bcmes.com.github.o1methodfactory.middle.factory.Iphone11Factory;

public class Client {
    private Iphone device = null;
    //....
    public String anyOperation() {
        //....
        IphoneFactory factory = new Iphone11Factory();
        device = factory.factory(IphoneFactory.Type.ELEVEN);
        //....
        assert device != null : "Iphone model not found.";
        return "Finished operation with " + device.getClass().getSimpleName() + ".";
    }
    //....
}
