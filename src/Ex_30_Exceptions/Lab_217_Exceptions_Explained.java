package Ex_30_Exceptions;

public class Lab_217_Exceptions_Explained {
    public static void main(String[] args) {
        System.out.println("starting program");
        String input=args[0];

        Integer a= Integer.parseInt(input);

        Integer output= 100/a;
        System.out.println(output);
        System.out.println("Ending program");
    }
}
