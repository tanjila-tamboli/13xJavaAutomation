package Ex_30_Exceptions;

public class Lab_229_Jr_QA_VS_Sr_QA {
    public static void main(String[] args) {
        String ip = null;
        try {
            ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        int a= 0; // NumberFormatException
        try {
             a = Integer.parseInt(ip); // NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        int b = 0; // ArithmeticException
        try {
             b = 100 / a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
