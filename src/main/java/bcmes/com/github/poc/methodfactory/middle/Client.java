package bcmes.com.github.poc.methodfactory.middle;

import bcmes.com.github.poc.methodfactory.middle.factory.Iphone11Factory;
import bcmes.com.github.poc.methodfactory.middle.factory.IphoneFactory;
import bcmes.com.github.poc.methodfactory.middle.iphone.Iphone;

import static bcmes.com.github.poc.methodfactory.middle.factory.IphoneFactory.Type.ELEVEN;

public class Client {
    private Iphone device = null;
    //....
    public String anyOperation() {
        //....
        IphoneFactory factory = new Iphone11Factory();
        device = factory.createIPhone(ELEVEN);
        //....
        assert device != null : "Iphone model not found.";
        return "Finished operation with " + device.getClass().getSimpleName() + ".";
    }
    //....
}
