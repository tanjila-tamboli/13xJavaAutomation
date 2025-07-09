package Ex_28_ENUM;

public enum ENUM_LOCATOES {

    Page_FirstName("Tanjila"),
    Page_LastName("Tamboli"),
    page_button("#btn");


    public String getLocators() {
        return Locators;
    }

    private String Locators;


    ENUM_LOCATOES(String locators) {
        Locators = locators;
    }
}
