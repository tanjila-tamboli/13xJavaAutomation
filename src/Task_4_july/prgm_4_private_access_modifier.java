package Task_4_july;

public class prgm_4_private_access_modifier {

    public static void main(String[] args)
    {
        Student obj= new Student();

        obj.setName("Tanjila");
        System.out.println(obj.getName());

    }
}

class Student
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

