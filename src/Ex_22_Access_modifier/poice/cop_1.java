package Ex_22_Access_modifier.poice;

public class cop_1 {

   public int gun;   // public variable - accessible everywhere

   private  String Icard; // private variable - accessible only inside Cop class

    //constuctor
   public cop_1(int bullet)
   {

       this.gun=bullet;    // 'this' refers to the current object
   }
   // Protected Method - accessible in same package and subclasses
   protected void CanIShoot()
   {
       System.out.println("yes! you can shoot..");
   }
// Default method - accessible within the same package
   void thisDefaultCop()
   {
       System.out.println("hi! cop..");
   }
}
