package bcmes.com.github.poc.methodfactory.simple.iphone;

public class IphoneX extends Iphone {
    @Override
    protected Iphone getHardware() {
        return new IphoneX();
    }
}