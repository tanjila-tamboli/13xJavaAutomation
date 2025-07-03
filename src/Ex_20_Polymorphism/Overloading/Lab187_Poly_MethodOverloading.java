package Ex_20_Polymorphism.Overloading;

public class Lab187_Poly_MethodOverloading {

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
   int r1=math.add(5,6);
        System.out.println(r1);
   int r2=math.add(5,6,7);
        System.out.println(r2);

    String r3=math.add("Tanjila", "Tamboli");
        System.out.println(r3);
    double r4=math.add(4.5,5.5,6.5);
        System.out.println(r4);


    }
}
    class MathOperations {
        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c)
        {
            return a + b + c;
        }

        double add(double a, double b, double c) {
            return a + b + c;
        }

        String add(String a, String b) {
            return a + b;
        }

    }

