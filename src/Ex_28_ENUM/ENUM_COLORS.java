package Ex_28_ENUM;

public enum ENUM_COLORS {
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

     String getHexcode() {
        return hexcode;
    }

    private String hexcode;

    ENUM_COLORS(String hexcode)
    {
        this.hexcode=hexcode;
    }


}
