package bcmes.com.github.o1methodfactory.theproblema;

public class Iphone {

    public Iphone(String type) {/*....*/}

    public Iphone createIphone11(){
        //Multiple lines of instruction
        return new Iphone("iPhone11");
    }

    public Iphone createIphoneX(){
        //Multiple lines of instruction
        return new Iphone("iPhoneX");
    }

    //....Every new iPhone is a new method
}