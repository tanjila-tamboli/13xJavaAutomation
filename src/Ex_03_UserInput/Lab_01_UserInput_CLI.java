package Ex_03_UserInput;

public class Lab_01_UserInput_CLI {

    public static void main(String[] args) {

        String String_age= args[0];
        System.out.println(String_age);
        int age= Integer.parseInt(String_age);
        String canIVote= age>=18 ? "Yes" : "No";
                System.out.println(canIVote);


    }
}
