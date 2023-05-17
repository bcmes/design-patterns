package bcmes.com.github.o1methodfactory.simple.iphone;

public class Iphone11 extends Iphone {
    @Override
    protected Iphone create() {
        return new Iphone11();
    }
}