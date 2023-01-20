package tests;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import utilities.TestBase;
import java.io.IOException;
public class Day13_JSExecutor extends TestBase {
    @Test
    public void scrollIntoViewTest() throws IOException {
        driver.get("https://techproeducation.com/");
        waitFor(3);
//        1. create js executor object
        JavascriptExecutor js =(JavascriptExecutor)driver;
//        2. execute the command
        waitFor(3);
//        scrolling We Offer element
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//*[.='we offer']")));
        takeScreenshotOfPage();
        waitFor(3);
//        scrolling LMS LOGIN element
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[.=' Enroll Free ']")));
        takeScreenshotOfPage();

        waitFor(3);
//        scrolling WHY US element
        scrollIntoViewJS(driver.findElement(By.xpath("//h3[.='WHY US?']")));
        takeScreenshotOfPage();
        waitFor(3);
//        scrolling back up to enroll free
        scrollIntoViewJS(driver.findElement(By.xpath("//span[.=' Enroll Free ']")));
        takeScreenshotOfPage();
    }
}

