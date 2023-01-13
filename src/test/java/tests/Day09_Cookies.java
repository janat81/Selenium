package tests;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;
import java.util.Set;
public class Day09_Cookies extends TestBase {
    @Test
    public void cookieTest(){
//        -Go to amazon  and automate the tasks:
        driver.get("https://www.amazon.com");
//        1. Find the total number of cookies
        Set<Cookie> allCookies = driver.manage().getCookies();
        int numOfCookies = allCookies.size();
        System.out.println("Number Of Cookies : "+numOfCookies);//Mine is 7
//        2. Print all the cookies
        for (Cookie eachCookie : allCookies){
            System.out.println("Cookie ==>>> "+eachCookie);
            System.out.println("Cookie Value ===>>> "+eachCookie.getValue());
            System.out.println("Cookie Name ===>>> "+eachCookie.getName());
        }
//        3. Get the cookies by their name
        System.out.println("Cookie Named : "+driver.manage().getCookieNamed("i18n-prefs"));//entering cookie name and getting the entire cookie
//        4. Add new cookie
        Cookie cookie = new Cookie("my-fav-cookie","apple-pie");
        driver.manage().addCookie(cookie);
        Set<Cookie> newCookies = driver.manage().getCookies();
        System.out.println("New Number Of Cookie ===>>> "+newCookies.size());//1 more than original number of cookie
//        5. Delete cookie by name
        driver.manage().deleteCookieNamed("session-id");
        int lastNumberOfCookies = driver.manage().getCookies().size();
        System.out.println("Last Number of Cookies ===>>> "+lastNumberOfCookies);
//        6. Delete all of the cookies
        driver.manage().deleteAllCookies();
        int finalNumberOfCookies = driver.manage().getCookies().size();
        System.out.println("Final Number Of cookies ===>>> "+finalNumberOfCookies);
    }
}
