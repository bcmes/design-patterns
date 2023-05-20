package bcmes.com.github.dp1methodfactory.middle.iphone;

public class IphoneXSMax extends Iphone {
    @Override
    protected Iphone create() {
        return new IphoneXSMax();
    }
}