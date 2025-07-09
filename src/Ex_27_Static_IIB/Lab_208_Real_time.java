package Ex_27_Static_IIB;

public class Lab_208_Real_time {
    public static void main(String[] args) {
ATB A= new ATB();
A.howTheyAssignment(); //non static method called by object
ATB.doAssignment();   //static method called by class
ATB.joinZoomForClass();//static method called by class
System.out.println(ATB.Course_name); // static variables called by class
System.out.println(ATB.mentor);// static variables called by class

       // ATB student = new ATB();
        A.setName("Tanjila");
        A.setPhone("9876543210");
        System.out.println(A.getName());
        System.out.println(A.getPhone());


       /* ATB student = new ATB();
        student.howTheyAssignment();

        student.setName("Tanjila");
        student.setPhone("9876543210");
        System.out.println(student.getName());
        System.out.println(student.getPhone());*/
    }
}
class ATB
{
    static {
        System.out.println("Load the class?, I will execute");
    }
    {
        System.out.println("IIB - this is called when Object is created!");

    }

    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    private String Phone;
    static String Course_name="ATB";
    static String mentor= "promod";

    static void doAssignment()
    {
        //System.out.println(phone); // Staic method can't access the non static variables
        System.out.println("Do Assignment");
    }

    static void joinZoomForClass(){
        System.out.println("Class Joined!");
    }

    void howTheyAssignment(){
        System.out.println("It is different!");
    }

}

