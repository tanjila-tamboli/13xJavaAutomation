package ex_19_opps_inheritance.single_inheritance;

public class Runner_class_TC1_TC2 {
    public static void main(String[] args) {
        Test_case1 tc1 = new Test_case1();
        tc1.run_TC1();

        Test_case2 tc2 = new Test_case2();
        tc2.run_TC2();

        commonAll c1 = new commonAll();
        c1.closeBrowser();
        c1.stratBrowser();

        Test_case1 t3 = new Test_case1();
        commonAll c2 = new Test_case1(); // Dynamic Dispatch (extends)
//        TestCase1 t4 = new CommonToAll();


    }
}