package Ex_28_ENUM;

public class Lab_210_ENUM {

    public static void main(String[] args) {
        System.out.println(Day.FRIDAY);
        System.out.println(PROJECT_NAMES.google);

    }
}

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
enum PROJECT_NAMES
{
    google, restassured, katalon, vwo
}