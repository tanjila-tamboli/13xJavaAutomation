package Ex_11_Turnary_Operator;

public class Lab_67_realage_classification {
    public static void main(String[] args) {
        int age =55;

        String result= (age<18) ? "minor": (age>65) ? "Adult" :" senior ";
        String result1 =  (age < 18 ) ? "Minor" : (age < 65) ? "Adult": "Senior";
        System.out.println(result);
        System.out.println(result1);
    }
}
