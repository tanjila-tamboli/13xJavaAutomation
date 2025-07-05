package Ex_22_Access_modifier.poice;

public class jrCop {
    public static void main(String args[])
    {
        cop_1 jrcop= new cop_1(10010);
        System.out.println(jrcop.gun);  //Create Cop object with 5 bullets
        jrcop.thisDefaultCop();   //Call Default  method
        jrcop.CanIShoot();//Call protected method


    }
}
