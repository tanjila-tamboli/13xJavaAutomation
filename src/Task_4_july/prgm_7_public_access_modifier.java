package Task_4_july;

public class prgm_7_public_access_modifier {
    public static void main(String[] args) {
        Student3 s = new Student3();


        s.showInfo();
    }
}
 class Student3 {

    public void showInfo() {
        System.out.println("Public Access: Student Info");
    }
}