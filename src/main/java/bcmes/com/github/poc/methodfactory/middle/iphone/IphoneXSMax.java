package bcmes.com.github.poc.methodfactory.middle.iphone;

public class IphoneXSMax extends Iphone {
    @Override
    protected Iphone getHardware() {
        return new IphoneXSMax();
    }
}