package Ex_05_Switch;

import java.util.Scanner;

public class Lab_87_real_Switch_automation {
    public static void main(String[] args) {

        System.out.println("Enter the value");
        Scanner s = new Scanner(System.in);
        String browser = s.next();
        browser = browser.toLowerCase();

        switch(browser)
        {
            case "Chrome" :
                System.out.println("Strarting Chrome");
                break;
            case "Firefox":
                System.out.println("Strarting Firefox");
                break;
            case "opera":
                System.out.println("Strarting opera");
                break;
               default :
              System.out.println("not allowed");
             break;
        }

        /*switch (browser) {
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
            default:
                System.out.println("I have no idea which browser is this");
                break;*/

        }
    }
