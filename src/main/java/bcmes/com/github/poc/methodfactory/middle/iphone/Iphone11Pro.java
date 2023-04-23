package bcmes.com.github.poc.methodfactory.middle.iphone;

public class Iphone11Pro extends Iphone {
    @Override
    protected Iphone getHardware() {
        return new Iphone11Pro();
    }
}