package lessons17.factory.factory;

import lessons17.factory.buttons.Button;
import lessons17.factory.buttons.HtmlButton;
import lessons17.factory.factory.Dialog;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
