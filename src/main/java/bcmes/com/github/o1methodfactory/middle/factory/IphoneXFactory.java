package bcmes.com.github.o1methodfactory.middle.factory;

import bcmes.com.github.o1methodfactory.middle.iphone.Iphone;
import bcmes.com.github.o1methodfactory.middle.iphone.IphoneX;
import bcmes.com.github.o1methodfactory.middle.iphone.IphoneXSMax;

public class IphoneXFactory extends IphoneFactory {

    @Override
    public Iphone factory(Type type) {
        if (type == Type.X)
            return new IphoneX();
        else if (type == Type.XSMAX)
            return new IphoneXSMax();
        else return null;
    }
}
