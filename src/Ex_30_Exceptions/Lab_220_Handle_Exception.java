package Ex_30_Exceptions;

public class Lab_220_Handle_Exception {
    public static void main(String[] args) {
        int a=0;

        try {
            a=10/0;
        } catch (Exception e)
        {
            System.out.println("Div by Zero not allowed!");
        }

        System.out.println(a);
    }
}
