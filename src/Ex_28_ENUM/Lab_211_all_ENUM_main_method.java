package Ex_28_ENUM;

public class Lab_211_all_ENUM_main_method {
    public static void main(String[] args) {
        System.out.println(ENUM_LOCATOES.Page_FirstName.getLocators());
        System.out.println( ENUM_LOCATOES.Page_LastName.getLocators());
        System.out.println( ENUM_LOCATOES.page_button.getLocators());

        System.out.println(ENUM_COLORS.BLUE.getHexcode());
        System.out.println(ENUM_COLORS.RED.getHexcode());
        System.out.println(ENUM_COLORS.GREEN.getHexcode());
        System.out.println(ENUM_COLORS.YELLOW.getHexcode());

        System.out.println(ENUM_APIurl.google.getUrl());
        System.out.println(ENUM_APIurl.katalon.getUrl());
        System.out.println(ENUM_APIurl.wo.getUrl());
        int a = 10;

    }

}
