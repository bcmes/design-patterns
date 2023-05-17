package bcmes.com.github.o2abstractfactory.factories;

import bcmes.com.github.o2abstractfactory.products.btn.Button;
import bcmes.com.github.o2abstractfactory.products.btn.ButtonLinux;
import bcmes.com.github.o2abstractfactory.products.btn.ButtonWin;
import bcmes.com.github.o2abstractfactory.products.ckb.Checkbox;
import bcmes.com.github.o2abstractfactory.products.ckb.CheckboxLinux;
import bcmes.com.github.o2abstractfactory.products.ckb.CheckboxWin;

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
