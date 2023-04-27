package bcmes.com.github.methodfactory.theproblemb;

public class Iphone {

    public enum Types {ELEVEN, X}

    public String createIphone(Types type){
        if (Types.ELEVEN.equals(type)){
            //Multiple lines of instruction
            return "iPhone11";
        } else if (Types.X.equals(type)){
            //Multiple lines of instruction
            return "iPhoneX";
        } else {
            throw new IllegalArgumentException("Please enter a valid iPhone model.");
        }
        //....Every new iPhone is a new if
    }
}