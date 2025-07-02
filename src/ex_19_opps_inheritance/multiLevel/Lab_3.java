package ex_19_opps_inheritance.multiLevel;

public class Lab_3 {
    public static void main(String[] args) {
         Son s= new Son();
        System.out.println( s.gold_gf);
         s.car();
         s.home();
     Grand_father gf0 = new Grand_father();

     Grand_father gf= new Father(); //dynamic dispatch
        gf.home();
        gf.car();

     Grand_father gf1= new Son();
    }
}
