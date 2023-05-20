package bcmes.com.github.dp2abstractfactory.factories;

import bcmes.com.github.dp2abstractfactory.products.btn.Button;
import bcmes.com.github.dp2abstractfactory.products.ckb.Checkbox;

public interface GuiFactory {
    Button createButton();
    Checkbox createCheckbox();
}
