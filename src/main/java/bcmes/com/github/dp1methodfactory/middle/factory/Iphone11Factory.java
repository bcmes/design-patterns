package bcmes.com.github.dp1methodfactory.middle.factory;

import bcmes.com.github.dp1methodfactory.middle.iphone.Iphone;
import bcmes.com.github.dp1methodfactory.middle.iphone.Iphone11;
import bcmes.com.github.dp1methodfactory.middle.iphone.Iphone11Pro;

public class Iphone11Factory extends IphoneFactory {

    @Override
    public Iphone factory(Type type) {
        if (type == Type.ELEVEN)
            return new Iphone11();
        else if (type == Type.ELEVEN_PRO)
            return new Iphone11Pro();
        else return null;
    }
}
