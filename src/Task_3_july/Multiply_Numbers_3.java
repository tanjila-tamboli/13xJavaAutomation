package Task_3_july;

public class Multiply_Numbers_3 {
    public static void main(String[] args) {
        MathOperation math= new MathOperation();
       int a= math.multiply(5,6);
       int b= math.multiply(4,5, 7);

        System.out.println(a);
        System.out.println(b);

    }
}
class MathOperation
{
     int multiply( int a, int b)
     {
         return a*b;
     }
     int multiply(int a, int b, int c)
     {
         return a*b*c;
     }
}
