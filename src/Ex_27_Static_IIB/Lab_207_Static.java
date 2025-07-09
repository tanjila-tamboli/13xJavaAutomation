package Ex_27_Static_IIB;

public class Lab_207_Static {
    public static void main(String[] args) {
        B b1= new B();      // calles static block
        System.out.println(B.b); // called static variable directly by class
        System.out.println( b1.a);  // called non static variable , create object of class
        b1.display();// called non static method
        B.commonToAll();  // called static method

    }

}
class B{

    static {
        System.out.println("SIB, called once, class is loaded");
    }
    int a = 10;
    static int b = 15;

    void display(){
        System.out.println(b);
        System.out.println("Non static F(n)");
    }

    static void commonToAll(){
//        System.out.println(a);
        System.out.println("Static F(n)");
    }
    static class C{
        // // Whatever you are going to use in the automation also. Good news.
    }
}
