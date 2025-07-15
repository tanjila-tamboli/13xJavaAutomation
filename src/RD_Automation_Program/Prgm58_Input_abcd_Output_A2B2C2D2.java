package RD_Automation_Program;

public class Prgm58_Input_abcd_Output_A2B2C2D2 {

    public static void main(String[] args) {
        String input= "abcd";
        System.out.println(input);

        StringBuilder output= new StringBuilder();

        for(int i=0; i< input.length();  i++)
        {
            char ch= input.charAt(i);
            output.append(2).append(ch);
        }
        System.out.println(output.toString());
    }
}
