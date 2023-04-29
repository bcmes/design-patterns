package bcmes.com.github.methodfactory.theproblema;

public class Iphone {

    public Iphone(String type) {/*....*/}

    public static Iphone createIphone11(){
        //Multiple lines of instruction
        return new Iphone("iPhone11");
    }

    public static Iphone createIphoneX(){
        //Multiple lines of instruction
        return new Iphone("iPhoneX");
    }

    //....Every new iPhone is a new method
}