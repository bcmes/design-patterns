package bcmes.com.github.methodfactory.theproblemb;

public class Iphone {

    public enum Types {ELEVEN, X}

    public Iphone(String type) {/*....*/}

    /**
     * Aqui até temos uma "factory implementada".
     * O problema é esses blocos IFs, que se muitos e/ou grandes demais, dificultará a leitura e manutenção do arquivo.
     * Imagine que para instanciar cada "tipo" de iPhone, haja antes, várias linhas de configurações.
     */
    public static Iphone createIphone(Types type){
        if (Types.ELEVEN.equals(type)){
            //Multiple lines of instruction
            return new Iphone("iPhone11");
        } else if (Types.X.equals(type)){
            //Multiple lines of instruction
            return new Iphone("iPhoneX");
        } else {
            throw new IllegalArgumentException("Please enter a valid iPhone model.");
        }
        //....Every new iPhone is a new if
    }
}