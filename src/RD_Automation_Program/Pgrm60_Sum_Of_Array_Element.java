package RD_Automation_Program;

public class Pgrm60_Sum_Of_Array_Element {
    public static void main(String[] args) {
        int [] num ={10,20,30,40,50,60};

        int sum= 0;
        for (int i=0 ; i<num.length; i++ )
        {
            sum = sum+ num[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
