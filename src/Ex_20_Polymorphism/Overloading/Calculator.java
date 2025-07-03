package Ex_20_Polymorphism.Overloading;

public class Calculator {

    public static void main(String[] args) {
        clsi c1= new clsi();
        c1.calculator();
        String r1=c1.calculator("Orhan" , "Shaikh");
        System.out.println(r1);
       double r2= c1.calculator(5.5,6.5,8.5);
        System.out.println(r2);
    }
}

class clsi
{
     void calculator()
     {
         System.out.println("start cal");
     }

     String calculator(String a,String b)
     {
         System.out.println("Tanjila");
         return a+b;

     }

     double calculator( double a, double b, double c)
     {
         return a*b*c;
     }
}
