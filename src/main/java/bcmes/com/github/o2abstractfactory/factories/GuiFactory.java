package bcmes.com.github.o2abstractfactory.factories;

import bcmes.com.github.o2abstractfactory.products.btn.Button;
import bcmes.com.github.o2abstractfactory.products.ckb.Checkbox;

public interface GuiFactory {
    Button createButton();
    Checkbox createCheckbox();
}
