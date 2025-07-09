package Ex_29_Wrapper_class;

public class Lab_All_concept {
    public static void main(String[] args) {

        // Creating two Mobile objects using parameterized constructor
        Mobile iphone = new Mobile(1, "iphone 16", 120000.00);
        Mobile samsung = new Mobile(2, "ultra 24", 1350000.00);

        // Changing the price of the iPhone using setter method
        iphone.setPrice(200000.89);

        // Displaying details of both mobile phones
        iphone.display();    // Output: Name, Phone ID, Price
        samsung.display();   // Output: Name, Phone ID, Price

        // Accessing static variable (shared by all objects)
        System.out.println(Mobile.mobile_carrier);  // Output: airtel

        // Calling static method using class name
        Mobile.switchOnAirplaneMode();  // Output: Common Airplane Mode

        // Accessing enum value and calling its method to get the color
        System.out.println(Covers.red.getColor());  // Output: red_pokeman
    }
}

// ================= Mobile Class =================
class Mobile1 extends OldPhone1 {

    // Private member variables
    private Integer phone;
    private String name;
    private Double price;

    // Static variable shared by all Mobile objects
    static String mobile_carrier = "airtel";

    // Default constructor
    Mobile1() {
        System.out.println("DC");
    }

    // Parameterized constructor to initialize mobile details
    public Mobile1(Integer phone, String name, Double price) {
        this.phone = phone;
        this.name = name;
        this.price = price;
    }

    // Getter and Setter methods for encapsulation
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // Method to display mobile details
    void display() {
        System.out.println("Name: " + name + ", Phone ID: " + phone + ", Price: ₹" + price);
    }

    // Static method – can be called without object
    static void switchOnAirplaneMode() {
        System.out.println("Common Airplane Mode");
    }

    // Overloaded method (accepts Integer)
    void priceChange(Integer price) {
        System.out.println("Change price in Integers");
    }

    // Overloaded method (accepts Double)
    void priceChange(Double price) {
        System.out.println("Change price in decimals");
    }

    // Overriding the calling() method from OldPhone
    @Override
    void calling() {
        System.out.println("dialpad -> touch dialpad now!!");
    }
}

// ================= OldPhone Class =================
class OldPhone1 implements SIMCard1 {

    // Method to simulate calling (can be overridden)
    void calling() {
        System.out.println("dialpad");
    }

    // Method from SIMCard interface
    @Override
    public void enterCard() {
        System.out.println("Card entered");
    }
}

// ================= SIMCard Interface =================
interface SIMCard1 {
    // Abstract method to be implemented by class
    void enterCard();
}

// ================= Covers Enum =================
enum Covers1 {
    // Enum constants with color names
    red("red_pokeman"),
    blue("blue_pokeman");

    // Private variable to store color name
    private String color;

    // Constructor to assign color
    Covers1(String color) {
        this.color = color;
    }

    // Method to return color name
    String getColor() {
        return this.color;
    }
}