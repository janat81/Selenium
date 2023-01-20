package tests;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
public class Day14_StaleElementException extends TestBase {
    @Test
    public void staleException1(){
        driver.get("https://techproeducation.com/");
//        location lmsLgin
        WebElement lmsLogin = driver.findElement(By.linkText("LMS LOGIN"));
//        clicking lmsLogin
        lmsLogin.click();
        waitFor(5);
//        going back to home page
        driver.navigate().back();
        waitFor(5);
//        clicking lmsLogin

//        FAILED cause lmsLogin is no longer fresh. It is OLD. It is STALE
        lmsLogin.click();//org.openqa.selenium.StaleElementReferenceException:

//        SOLUTION : RELOCATE THE ELEMENT
//        driver.findElement(By.linkText("LMS LOGIN")).click();
    }
}