package Task_4_july;

public class prgm_5_Default_access_modifier {
    public static void main(String[] args) {
        // Create object of Student
        Student1 s = new Student1();
        s.showDetails();
    }
}

class Student1 {
      void showDetails() {
        System.out.println("Student details are displayed.");
    }
}





