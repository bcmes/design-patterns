package bcmes.com.github.poc.methodfactory.middle.factory;

import bcmes.com.github.poc.methodfactory.middle.iphone.*;

public class Iphone11Factory extends IphoneFactory {

    @Override
    public Iphone createIPhone(Type type) {
        if (type == Type.ELEVEN)
            return new Iphone11();
        else if (type == Type.ELEVEN_PRO)
            return new Iphone11Pro();
        else return null;
    }
}
