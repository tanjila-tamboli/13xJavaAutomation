package Task_3_july;

public class Find_maximum_5 {
    public static void main(String[] args) {
      utility ul= new utility();
      int r1=  ul.max(4,5);
        System.out.println(r1);
      int r2=ul.max(4,5,6);
        System.out.println(r2);
      double r3=ul.max(4.5,5.5);
        System.out.println(r3);
    }
}
class utility {
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int max(int a, int b, int c) {
        return (a > b && a > c) ? a : (b > a ? b : c);
    }

    double max(double a, double b) {
        return (a > b) ? a : b;
    }
}