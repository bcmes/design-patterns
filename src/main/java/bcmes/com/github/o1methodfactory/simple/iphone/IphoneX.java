package bcmes.com.github.o1methodfactory.simple.iphone;

public class IphoneX extends Iphone {
    @Override
    protected Iphone create() {
        return new IphoneX();
    }
}