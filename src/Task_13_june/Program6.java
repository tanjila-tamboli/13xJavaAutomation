package Task_13_june;

public class Program6 {
    public static void main(String[] args) {
        int x = 5;

        int y = x++ + ++x + x++ + ++x;

        System.out.println("x = " + x + ", y = " + y);
    }
}
