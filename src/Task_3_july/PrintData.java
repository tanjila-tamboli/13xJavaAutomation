package Task_3_july;

public class PrintData {
    public static void main(String[] args) {
     Printer p= new Printer();
     int r1= p.printData(1);
        System.out.println(r1);
     String r2= p.printData("Tanjila","Tamboli");
        System.out.println(r2);
     float r3= p.printData(3.5f,5.20f, 5560.2f);
        System.out.println(r3);
    }
}
class Printer
{
   int  printData( int a)
   {
       return a;
   }
   float printData(float a,float b, float c)
   {
       return a*b*c;
   }
   String printData(String a, String b)
   {
       return a+b ;
   }
}
