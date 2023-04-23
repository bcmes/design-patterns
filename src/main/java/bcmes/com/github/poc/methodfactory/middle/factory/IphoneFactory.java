package bcmes.com.github.poc.methodfactory.middle.factory;

import bcmes.com.github.poc.methodfactory.middle.iphone.Iphone;

public abstract class IphoneFactory {
    public enum Type {X, XSMAX, ELEVEN, ELEVEN_PRO}

    public Iphone orderIPhone(){
        System.out.println("Fake IPhone order implementation..");
        return null;
    }

    public abstract Iphone createIPhone(Type type);
}
