package Ex_15_String_Buffer;

public class Lab_146_String_builder {
    public static void main(String[] args) {
        StringBuilder b1= new StringBuilder("Tanjila");

        System.out.println(b1);
        System.out.println(b1.append("Tamboli"));
        System.out.println(b1.reverse());
        System.out.println(b1.replace(0,4 ," java"));
        System.out.println(b1.delete(0,4));


    }
}
