package ex_19_opps_inheritance.multiLevel;

public class Lab_2 {
    public static void main(String[] args) {
        Son amit = new Son();
        // Son s1 = new Father();
        // Son s1 = new GrandFather();

        Grand_father g1 = new Son(); // Dynamic Dispatch
        g1.car();
        g1.home();

        Grand_father g2 = new Father();
        g2.home();
        g2.car();

        Father f2 = new Son();
        f2.home();
        f2.car();

        // WebDriver driver = new ChromeDriver();

        // Father f3 = new GrandFather();

    }
}
