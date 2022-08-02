package patrones_creacionales.abstract_factory.factories;

import patrones_creacionales.abstract_factory.buttons.Button;
import patrones_creacionales.abstract_factory.buttons.MacOSButton;
import patrones_creacionales.abstract_factory.checkboxes.Checkbox;
import patrones_creacionales.abstract_factory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
