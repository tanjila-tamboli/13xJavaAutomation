package Ex_30_Exceptions;

public class Lab_225_IQ {
    public static void main(String[] args) {
        try {
            String input = args[0];
            int a= Integer.parseInt(input);
            int output = 100/a;
        } catch (ArithmeticException| ArrayIndexOutOfBoundsException|NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
