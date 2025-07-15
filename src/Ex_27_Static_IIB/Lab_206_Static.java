package Ex_27_Static_IIB;

public class Lab_206_Static {
    public static void main(String[] args) {
       A a1= new A(12);
        A a2= new A(12);

        System.out.println(a1.a);
        System.out.println(A.b);
        System.out.println(a2.a);
        System.out.println(a1.b);
        System.out.println(a2.b);

        a1.displayValue();
        a2.displayValue();

        A.staticMethod();



    }
}

class A{
    static int b= 10;
    int a=15;
     A(int a)
     {

         this.a=a;
     }
     void displayValue()
     {
         System.out.println(this.a);
         System.out.println(b); // static variable in instance method allowed
     }
    static void staticMethod(){
        System.out.println("I will be called when class is loaded");
       // System.out.println(this.a); // Methods cannot access non-static variables in a static function.
    }
}
