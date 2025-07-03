package Ex_20_Polymorphism.Overriding;

public class Lab189_MOverriding {

    public static void main(String[] args) {
        Animal a1= new Animal();
        a1.a();
        a1.horse();
        System.out.println("======");
        cat c1= new cat();
        c1.b();
        c1.a();
        c1.horse();

    }
}
class Animal
{
    void horse()
    {
        System.out.println("horse");
    }
    void a()
    {
        System.out.println("a");
    }

}

class cat extends Animal
{
 void horse()
 {
     System.out.println("hhhh");
 }
 void a()
 {
     System.out.println("aaaaa");
 }
 void b()
 {
     System.out.println("bbbbb");
 }
}
