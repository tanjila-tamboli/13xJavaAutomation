package ex_19_opps_inheritance.multiLevel;

public class Lab_1 {
    public static void main(String[] args) {


        Grand_father gf = new Grand_father();
        System.out.println(gf.gold_gf);
        gf.car();
        gf.home();

        System.out.println("======");

        Father f = new Father();
        System.out.println(f.gold_gf);
        f.car();
        f.home();


        System.out.println("======");

        Son s = new Son();
        System.out.println(s.gold_gf);
        s.home();
        s.car();


    }
}
