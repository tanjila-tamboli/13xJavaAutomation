package Task_3_july;

public class MethodOverloadingExample {
    public static void main(String[] args) {
      calculator cal= new calculator();
      int a=cal.add(5,6);
        System.out.println(a);
      double d= cal.add(5.5,5.6);
        System.out.println(d);
    }
}
 class calculator
 {
      int add(int a, int b)
      {
          return a+b;
      }
      double add(double a, double b)
      {
          return a+b;
      }
 }
