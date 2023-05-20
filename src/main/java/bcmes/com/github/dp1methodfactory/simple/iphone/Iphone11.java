package bcmes.com.github.dp1methodfactory.simple.iphone;

public class Iphone11 extends Iphone {
    @Override
    protected Iphone create() {
        return new Iphone11();
    }
}