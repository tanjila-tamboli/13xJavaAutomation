package Task_3_july;

public class Greet_User_4 {
    public static void main(String[] args) {
    Greeter g= new Greeter();
    String r1=g.Greet("hello");
        System.out.println(r1);
  String r2=  g.Greet("hello, Tanjila");
        System.out.println(r2);
    }
}
class Greeter {
    String Greet() {
        return " hello" ;
    }

    String Greet(String name) {
        return name;

    }
}