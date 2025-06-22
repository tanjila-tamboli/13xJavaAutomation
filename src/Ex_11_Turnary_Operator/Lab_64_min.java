package Ex_11_Turnary_Operator;

public class Lab_64_min {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        String min = a < b ? "min" : "max";
        System.out.println(min);

        int x = 10;
        int y = 20;
//        System.out.println(Math.max(x,y));

        int min1 = x < y ? x : y;
        System.out.println(min1);
    }

}



