package bcmes.com.github.poc.methodfactory.simple;

public class IphoneX extends Iphone {
    @Override
    protected Iphone getHardware() {
        return new IphoneX();
    }
}