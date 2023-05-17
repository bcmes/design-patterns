package bcmes.com.github.o1methodfactory.middle.factory;

import bcmes.com.github.o1methodfactory.middle.iphone.Iphone;

public abstract class IphoneFactory {
    public enum Type {X, XSMAX, ELEVEN, ELEVEN_PRO}

    public abstract Iphone factory(Type type);
}
