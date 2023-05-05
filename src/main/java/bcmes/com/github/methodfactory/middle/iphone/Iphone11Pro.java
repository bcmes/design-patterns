package bcmes.com.github.methodfactory.middle.iphone;

public class Iphone11Pro extends Iphone {
    @Override
    protected Iphone create() {
        return new Iphone11Pro();
    }
}