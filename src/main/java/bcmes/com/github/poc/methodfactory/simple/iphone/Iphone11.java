package bcmes.com.github.poc.methodfactory.simple.iphone;

public class Iphone11 extends Iphone {
    @Override
    protected Iphone getHardware() {
        return new Iphone11();
    }
}