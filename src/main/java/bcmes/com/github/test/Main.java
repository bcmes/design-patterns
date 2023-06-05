package bcmes.com.github.test;

public class Main {
    public static void main(String[] args) {
        new Thread(() -> {
            Letters a = new Letters();
            a.letter = 'A';
            Letters.qtd += 1;
            System.out.println(a);
        }).start();

        new Thread(() -> {
            Letters b = new Letters();
            b.letter = 'B';
            Letters.qtd += 1;
            System.out.println(b);
        }).start();

    }
}