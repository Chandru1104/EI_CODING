public class AbstractFactoryPattern{
    public static void main(String[] args) {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            factory = new WindowsFactory();
            app = new Application(factory);
        } else {
            factory = new MacFactory();
            app = new Application(factory);
        }
        app.paint();
    }
}