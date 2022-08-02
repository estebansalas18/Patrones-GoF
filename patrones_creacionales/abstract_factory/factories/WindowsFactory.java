package patrones_creacionales.abstract_factory.factories;

import patrones_creacionales.abstract_factory.buttons.Button;
import patrones_creacionales.abstract_factory.buttons.WindowsButton;
import patrones_creacionales.abstract_factory.checkboxes.Checkbox;
import patrones_creacionales.abstract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
