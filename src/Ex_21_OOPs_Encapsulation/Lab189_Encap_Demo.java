package Ex_21_OOPs_Encapsulation;

public class Lab189_Encap_Demo {
    public static void main(String[] args) {

        Google g= new Google("admin", "admin123");
              g.setPassword("admin456");
             String s1= g.getPassword();
        System.out.println(s1);



    }
}

/*class GoogleLogin
{
    public String username;
    public String password;

    public GoogleLogin(String username,String password)
    {
        this.password = password;
        this.username = username;
    }
}*/
class Google
{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Google(String usr, String psw) {
    this.password = psw;
    this.username = usr;

}
}
