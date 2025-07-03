package Ex_20_Polymorphism.Overloading;

public class WebAutomation {
    public static void main(String[] args) {
        browser b = new browser();

        b.startbrowser();
        b.startbrowser("chrome");

    }
}
    class browser
    {
        void startbrowser()
        {
            System.out.println("start browser");
        }
        String startbrowser(String browser)
        {
            System.out.println("Starting browser " + browser);
            return browser;
        }
    }

