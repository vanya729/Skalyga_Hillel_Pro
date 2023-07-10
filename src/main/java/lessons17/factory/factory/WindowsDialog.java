package lessons17.factory.factory;

import lessons17.factory.buttons.Button;
import lessons17.factory.buttons.WindowsButton;
import lessons17.factory.factory.Dialog;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}