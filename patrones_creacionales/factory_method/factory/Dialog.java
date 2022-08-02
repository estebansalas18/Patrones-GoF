package patrones_creacionales.factory_method.factory;

import patrones_creacionales.factory_method.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
