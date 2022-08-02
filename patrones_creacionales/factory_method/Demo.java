package patrones_creacionales.factory_method;

import patrones_creacionales.factory_method.factory.Dialog;
import patrones_creacionales.factory_method.factory.HtmlDialog;
import patrones_creacionales.factory_method.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
