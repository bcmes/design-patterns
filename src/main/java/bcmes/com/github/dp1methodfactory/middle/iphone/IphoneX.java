package bcmes.com.github.dp1methodfactory.middle.iphone;

public class IphoneX extends Iphone {
    @Override
    protected Iphone create() {
        return new IphoneX();
    }
}