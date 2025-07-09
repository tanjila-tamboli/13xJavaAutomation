package Ex_30_Exceptions;

public class Lab_223_Try_Catch_Multiple_IQ {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
