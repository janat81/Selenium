package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class Day04_LinkTexts {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }
    @Test
    public void LMSPage(){
        driver.get("https://techproeducation.com/");
        //Click on LMS LOGIN

        driver.findElement(By.linkText("LMS LOGIN")).click();

        String expectedURL = "https://lms.techproeducation.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals("LMS LOGIN PAGE IS NOT DISPLAYED",expectedURL,actualURL);

    }
    @Test
    public void LMSPagePatialLinkText(){
        driver.get("https://techproeducation.com/");
        driver.findElement(By.partialLinkText("LMS")).click();


        WebElement loginElement = driver.findElement(By.linkText("Login/Register"));
        Assert.assertTrue(loginElement.isDisplayed());

    }

    @After
    public void tearDown(){

    }
}
