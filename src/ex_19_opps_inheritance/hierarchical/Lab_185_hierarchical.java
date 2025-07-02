package ex_19_opps_inheritance.hierarchical;

public class Lab_185_hierarchical {
    public static void main(String[] args) {

        father f = new father();
        f.car();

        pramod p= new pramod();
        p.home1();
        p.car();

        Tanjila t= new Tanjila();
        t.home2();
        t.car();

        orhan o = new orhan();
        o.car2();
        o.car();


    }
}
        class father {
            void car()
            {
                System.out.println("nexon");
            }
        }

            class pramod extends father
            {
             void home1()
             {
                 System.out.println("1 bhk");
             }
            }

            class Tanjila extends father
            {
             void home2 ()
            {
               System.out.println("2 bhk");
            }
            }

            class orhan extends father
            {
                void car2()
                {
                    System.out.println("RANGE ROVER");
                }
            }




