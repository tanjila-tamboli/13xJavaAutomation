package Ex_30_Exceptions;

public class Lab_224_Try_IQ {
    public static void main(String[] args) {
        String str= "10";

        try {
            str.trim();
            int a = 10 / 0;
        }
        catch(NullPointerException | ArithmeticException e)
        {
            System.out.println("Null or Arth Error");
        } catch (Exception e) {
            System.out.println("Yes");
        }
        System.out.println("End");


    }
}