package patrones_creacionales.abstract_factory.factories;

import patrones_creacionales.abstract_factory.buttons.Button;
import patrones_creacionales.abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
