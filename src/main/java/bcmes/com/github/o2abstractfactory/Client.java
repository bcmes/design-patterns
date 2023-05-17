package bcmes.com.github.o2abstractfactory;

import bcmes.com.github.o2abstractfactory.factories.GuiFactory;
import bcmes.com.github.o2abstractfactory.products.btn.Button;
import bcmes.com.github.o2abstractfactory.products.ckb.Checkbox;

public class Client {
    public void operation(GuiFactory factory) {
        Button btn = factory.createButton();
        Checkbox ckb = factory.createCheckbox();

        System.out.println(btn.paint());
        System.out.println(ckb.paint());
    }
}
