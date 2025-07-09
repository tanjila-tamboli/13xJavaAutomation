package Ex_30_Exceptions;

public class Lab_222_Try_Catch_Multiple {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("fool");
        } catch (Exception e) {
            System.out.println("fool");
            System.out.println("2");
        }
    }
}
