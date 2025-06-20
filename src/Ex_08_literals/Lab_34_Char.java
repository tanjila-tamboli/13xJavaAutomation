package Ex_08_literals;

public class Lab_34_Char {
    public static void main(String args[])
    {
        char c1='a';
        char c2='@';
        char c3='-';
        char c4='_';
        char c5='=';
        char c6='.';
        char c7='9';

        char new_line='\n';
        char space='\t';
        char back_space='\b';
        char carriage_return = '\r';

        System.out.println("tanjila");
        System.out.println("Tanjila"+new_line+"Tamboli");
        System.out.println("Tanjila"+space+"Tamboli");
        System.out.println("Tanjila"+back_space+"Tamboli");
        System.out.println("Tanjila"+carriage_return+"Tamboli");

        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char c11  = '\u1F60';
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);
    }
}
