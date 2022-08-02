package patrones_creacionales.factory_method.factory;

import patrones_creacionales.factory_method.buttons.Button;
import patrones_creacionales.factory_method.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
