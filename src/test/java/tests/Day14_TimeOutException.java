package tests;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;
public class Day14_TimeOutException extends TestBase {

    @Test
    public void timeOutTest(){
        driver.get("https://techproeducation.com/");
        waitForVisibility(By.id("wrong-id"),15);

    }

}