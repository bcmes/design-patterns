package bcmes.com.github.o1methodfactory.middle.iphone;

public class Iphone11Pro extends Iphone {
    @Override
    protected Iphone create() {
        return new Iphone11Pro();
    }
}