package bcmes.com.github.o2abstractfactory.factories;

import bcmes.com.github.o2abstractfactory.products.btn.Button;
import bcmes.com.github.o2abstractfactory.products.btn.ButtonWin;
import bcmes.com.github.o2abstractfactory.products.ckb.Checkbox;
import bcmes.com.github.o2abstractfactory.products.ckb.CheckboxWin;

public class GuiFactoryWin implements GuiFactory{
    @Override
    public Button createButton() {
        return new ButtonWin();
    }

    @Override
    public Checkbox createCheckbox() {
        return new CheckboxWin();
    }
}
