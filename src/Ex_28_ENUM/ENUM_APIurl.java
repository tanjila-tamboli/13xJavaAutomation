package Ex_28_ENUM;

public enum ENUM_APIurl
{
    wo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

   ENUM_APIurl(String url)
   {
       this.url= url;
   }

   String getUrl()
   {
       return this.url;
   }
}
