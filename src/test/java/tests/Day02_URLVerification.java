package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_URLVerification {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techproeducation.com");

        // Verify if  homepage url is "https://techproeducation.com/"
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://techproeducation.com";

        if(actualURL.equals(expectedURL)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL TITLE : "+actualURL);
            System.out.println("BUT EXPECTED TITLE : "+expectedURL);

        }
        driver.quit();
    }
}
