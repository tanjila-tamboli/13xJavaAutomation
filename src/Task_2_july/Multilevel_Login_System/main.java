package Task_2_july.Multilevel_Login_System;

public class main {
    public static void main(String[] args) {
         SuperAdmin ad= new  SuperAdmin();
          ad.accessAdminPanel();
          ad.shutdownSystem();
          ad.login();
    }
}
