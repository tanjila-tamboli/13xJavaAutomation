package Ex_30_Exceptions;

public class Lab_229_Jr_QA_VS_Sr_QA_2 {
    public static void main(String[] args) {
        try {
            String str= args[0];

            int a= Integer.parseInt(str);

            int b=100/a;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
