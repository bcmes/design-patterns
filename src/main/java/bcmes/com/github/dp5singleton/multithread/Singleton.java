package bcmes.com.github.dp5singleton.multithread;

public final class Singleton {
    // Cada Thread tem internamente seu espaço de memoria de trabalho reservado, onde
    // são carregadas suas variaveis. o modificador de atributos volatile, armazena essa
    // variável em um espaço de memória externo e comum a todas as threads.
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.
        //
        // It may seem that having the `result` variable here is completely
        // pointless. There is, however, a very important caveat when
        // implementing double-checked locking in Java, which is solved by
        // introducing this local variable.
        //
        // You can read more info DCL issues in Java here:
        // https://refactoring.guru/java-dcl-issue
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        //O modificador synchronized garante que somente uma thread por vez por executar
        // este bloco de código, e o objeto blocante é do tipo Singleton.class.
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
