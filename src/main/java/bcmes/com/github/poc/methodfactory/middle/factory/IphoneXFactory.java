package bcmes.com.github.poc.methodfactory.middle.factory;

import bcmes.com.github.poc.methodfactory.middle.iphone.IphoneX;
import bcmes.com.github.poc.methodfactory.middle.iphone.Iphone;
import bcmes.com.github.poc.methodfactory.middle.iphone.IphoneXSMax;

public class IphoneXFactory extends IphoneFactory {

    @Override
    public Iphone createIPhone(Type type) {
        if (type == Type.X)
            return new IphoneX();
        else if (type == Type.XSMAX)
            return new IphoneXSMax();
        else return null;
    }
}
