package Task_3_july.overriding;

public class Login_Functionality {
    public static void main(String[] args) {
        User user1 = new AdminUser();     // Polymorphism
        User user2 = new RegularUser();   // Polymorphism

        user1.login();  // Output: Admin login: Accessing admin dashboard
        user2.login();  // Output: Regular user login: Accessing user homepage
    }
}
class User {
    void login() {
        System.out.println("User login");
    }
}
class AdminUser extends User {
    @Override
    void login() {
        System.out.println("Admin login: Accessing admin dashboard");
    }
}
class RegularUser extends User {
    @Override
    void login() {
        System.out.println("Regular user login: Accessing user homepage");
    }
}
