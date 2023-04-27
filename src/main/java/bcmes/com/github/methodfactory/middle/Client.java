package bcmes.com.github.methodfactory.middle;

import bcmes.com.github.methodfactory.middle.factory.IphoneFactory;
import bcmes.com.github.methodfactory.middle.iphone.Iphone;
import bcmes.com.github.methodfactory.middle.factory.Iphone11Factory;

public class Client {
    private Iphone device = null;
    //....
    public String anyOperation() {
        //....
        IphoneFactory factory = new Iphone11Factory();
        device = factory.createIPhone(IphoneFactory.Type.ELEVEN);
        //....
        assert device != null : "Iphone model not found.";
        return "Finished operation with " + device.getClass().getSimpleName() + ".";
    }
    //....
}
