package Ex_30_Exceptions;

public class Lab_226_IQ2 {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        try {

            b = 10 / c;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}