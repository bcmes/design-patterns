package bcmes.com.github.methodfactory.middle.iphone;

public class IphoneX extends Iphone {
    @Override
    protected Iphone getHardware() {
        return new IphoneX();
    }
}