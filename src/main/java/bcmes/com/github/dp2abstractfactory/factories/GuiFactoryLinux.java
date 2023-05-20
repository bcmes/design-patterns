package bcmes.com.github.dp2abstractfactory.factories;

import bcmes.com.github.dp2abstractfactory.products.btn.Button;
import bcmes.com.github.dp2abstractfactory.products.btn.ButtonLinux;
import bcmes.com.github.dp2abstractfactory.products.ckb.Checkbox;
import bcmes.com.github.dp2abstractfactory.products.ckb.CheckboxLinux;

public class GuiFactoryLinux implements GuiFactory{
    @Override
    public Button createButton() {
        return new ButtonLinux();
    }

    @Override
    public Checkbox createCheckbox() {
        return new CheckboxLinux();
    }
}
