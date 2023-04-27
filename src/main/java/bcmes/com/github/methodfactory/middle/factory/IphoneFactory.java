package bcmes.com.github.methodfactory.middle.factory;

import bcmes.com.github.methodfactory.middle.iphone.Iphone;

public abstract class IphoneFactory {
    public enum Type {X, XSMAX, ELEVEN, ELEVEN_PRO}

    public abstract Iphone createIPhone(Type type);
}
