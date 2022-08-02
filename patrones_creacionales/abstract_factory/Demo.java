package patrones_creacionales.abstract_factory;

import patrones_creacionales.abstract_factory.app.Application;
import patrones_creacionales.abstract_factory.factories.GUIFactory;
import patrones_creacionales.abstract_factory.factories.MacOSFactory;
import patrones_creacionales.abstract_factory.factories.WindowsFactory;

public class Demo {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
