package patrones_creacionales.factory_method.factory;

import patrones_creacionales.factory_method.buttons.Button;
import patrones_creacionales.factory_method.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
