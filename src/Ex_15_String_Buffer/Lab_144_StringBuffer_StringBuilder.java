package Ex_15_String_Buffer;

public class Lab_144_StringBuffer_StringBuilder {
    public static void main(String args[])
    {
        String s=" Tanjila";
        String s1= new String("Tanjila");

        StringBuffer  StringBuffer = new StringBuffer("Tanjila");
        StringBuilder   StringBuilder = new StringBuilder("Tanjila");

        System.out.println(s);
        System.out.println(s1);
        System.out.println(StringBuffer );
        System.out.println(StringBuilder);
    }
}
