package bcmes.com.github.poc.methodfactory.simple;

public class IphonePro extends Iphone {
    @Override
    protected Iphone getHardware() {
        return new IphonePro();
    }
}