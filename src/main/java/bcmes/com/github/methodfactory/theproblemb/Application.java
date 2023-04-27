package bcmes.com.github.methodfactory.theproblemb;

public class Application {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone();
        System.out.println("\n" + iPhone.createIphone(Iphone.Types.X));
    }
}
