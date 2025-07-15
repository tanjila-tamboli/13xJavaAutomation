package RD_Automation_Program;

public class Prgm62_Remove_leading_trailing_space {
    public static void main(String[] args) {


        String str1 = "  hello  ";
        System.out.println(str1);

        /*String output1 = str1.strip(); // Removes spaces from both ends.
        System.out.println(output1);

       // romove spaces from first end
        String str2 ="   hello ";
        str2.stripLeading();

        // remove spaces from back end
        String str3 ="hello   ";

        str3.stripTrailing();*/

        // trailing spaces
         String  input= "helloo   ";
        int i= input.length()-1;
        while(i>=0 && input.charAt(i)==' ')
        {
            i--;
        }
       String result= input.substring(0, i+1);
        System.out.println(result);

        //leading spaces
        String input1 = "    Hello World";  // leading spaces
        int i1 = 0;

        // Move forward while characters are spaces
        while (i1 < input1.length() && input1.charAt(i) == ' ') {
            i++;
        }

        String result1 = input1.substring(i);
    }
}