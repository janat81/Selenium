package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class FirstTest {
    public static void main(String[] args) {
        SeleniumManager.getInstance().getDriverPath("chromedriver");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.techproeducation.com");
    }
}
