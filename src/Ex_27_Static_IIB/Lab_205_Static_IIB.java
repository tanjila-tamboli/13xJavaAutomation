package Ex_27_Static_IIB;

public class Lab_205_Static_IIB
{
    public static void main(String[] args)
    {
         T t1= new T();
         T t2= new T();
        System.out.println(T.a);
        t1.a = 12;
        System.out.println(T.a);
        System.out.println(t1.a);
        System.out.println(t2.a);
        // System.out.println(P.b);
        t1.b  = 24;
        t2.b =34;
        System.out.println(t1.b);
        System.out.println(t2.b);

    }
}

class T {
    static int a = 10;
    int b = 15;

    static {
        // This is static block.
        // This is called whenever a class a loaded.
        System.out.println("Hi, this is called, becoz, class is laoded");
    }
}
/*T.a prints the static value 10

You change it using t1.a = 12;

Because a is static, it’s shared by all instances and also accessed using the class name T.a

So, now all objects see the updated value 12

Variable	   Type	       Accessed by	     Shared?	       Example
a	          Static       Class/Object  	✅ Yes	         P.a, p1.a
b	          Instance   	Only Object	    ❌ No	         p1.b, p2.b

 */