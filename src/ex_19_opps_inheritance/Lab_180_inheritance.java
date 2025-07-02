package ex_19_opps_inheritance;

public class Lab_180_inheritance {

    public static void main(String[] args) {

        Father f = new Father();
        System.out.println(f.gold_f);
        f.bhk2();

        Son s= new Son();
        System.out.println(s.gold_f);
        s.bhk3();
        s.bhk2();
    }
    }
        class Father {
            int gold_f = 1000; // Attribute | Data variables |  Property | Instance Variables

            void bhk2() { //  Behaviour |  Method | Function | Data members
                System.out.println("Father - 2BHK");
            }
        }
            class Son extends Father
            {
                void bhk3()
                {
                    System.out.println("3BHK Son");
                }
            }



