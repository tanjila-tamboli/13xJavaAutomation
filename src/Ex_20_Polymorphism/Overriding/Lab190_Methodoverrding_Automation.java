package Ex_20_Polymorphism.Overriding;

public class Lab190_Methodoverrding_Automation {

    public static void main(String[] args) {

        CommonAll c1= new CommonAll();
        c1.openBrowser();
        System.out.println("====");
        opera o1= new opera();
        o1.openBrowser();
        System.out.println("====");
        FireFox f1= new FireFox();
        f1.openBrowser();

        // Dynamic Dispatch
        CommonAll c2 = new opera();
        c2.openBrowser();

        CommonAll c3 = new FireFox();
        c3.openBrowser();

    }
}
class CommonAll
{
    void openBrowser()
    {
        System.out.println("aaaa");
    }
}
class opera extends CommonAll
{
    void openBrowser()
    {
        System.out.println("bbbb");
    }
}
class FireFox extends CommonAll
{
    void openBrowser()
    {
        System.out.println("cccc");
    }
}