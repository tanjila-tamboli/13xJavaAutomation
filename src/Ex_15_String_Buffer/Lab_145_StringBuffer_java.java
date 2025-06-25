package Ex_15_String_Buffer;

public class Lab_145_StringBuffer_java {
    public static void main(String args[])
    {
        StringBuffer StringBuffer= new StringBuffer("Tanjila");
        System.out.println(StringBuffer.append(" Tamboli"));
        System.out.println(StringBuffer.reverse());
        System.out.println(StringBuffer.delete(0,1));
        System.out.println((StringBuffer.insert(0,1)));

    }
}
