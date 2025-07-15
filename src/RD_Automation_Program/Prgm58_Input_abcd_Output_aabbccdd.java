package RD_Automation_Program;

public class Prgm58_Input_abcd_Output_aabbccdd {
    public static void main(String[] args) {
       /* String input = "abcd";
       System.out.println("abcd");
        StringBuilder output = new StringBuilder();

        for(int i=0 ; i< input.length(); i++)
        {
            char ch= input.charAt(i);
            output.append(ch).append(ch);

        }
        System.out.println("output:" +output.toString());
    }*/

        // for each loop
        {

            String input = "abcd";
            char[] chracter = input.toCharArray();
            StringBuilder output = new StringBuilder();
            for (char ch : chracter) {
                output.append(ch).append(ch);
            }
            System.out.println("Output: " + output.toString());

        }
    }
}