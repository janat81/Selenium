package practices.practice_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q02 {

    //  ...Practice 2...
    // Set Driver Path
    // Create chrome driver object
    // Maximize the window
    // Open google home page https://www.google.com/
    // Wait for 3 seconds
    // Go to the "https://techproeducation.com/"
    // Get the title and URL of the page
    // Check if the title contains the word "Bootcamps" print console "Title contains Bootcamps" or "Title does not contain Bootcamps"
    // Check if the URL contains the word "Courses" print console "URL contains Courses" or "URL does not contain Courses"
    // Then go to "https://medunna.com/"
    // Get the title and check if it contains the word "MEDUNNA" and print "Title contains MEDUNNA" or "Title does not contain MEDUNNA"
    // Back to the previous webpage
    // Refresh the page
    // Navigate to forward
    // Wait for 3 seconds
    // Close the browser
    public static void main(String[] args) throws InterruptedException {
        //  ...Practice 2...
        // Set Driver Path
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        // Create chrome driver object
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Open google home page https://www.google.com/
        driver.get("https://www.google.com");

        // Wait for 3 seconds
        Thread.sleep(3000);

        // Go to the "https://techproeducation.com/"
        driver.navigate().to("https://techproeducation.com/");

        // Get the title and URL of the page
        String techproTitle = driver.getTitle();
        String techproUrl = driver.getCurrentUrl();

        // Check if the title contains the word "Bootcamps" print console "Title contains Bootcamps" or "Title does not contain Bootcamps"
        if(techproTitle.contains("Bootcamps")){
            System.out.println("Title contains Bootcamps");
        }else{
            System.out.println("Title does not contain Bootcamps");
        }

        // Check if the URL contains the word "Courses" print console "URL contains Courses" or "URL does not contain Courses"
        if(techproUrl.contains("Courses")){
            System.out.println("contains");
        }else{
            System.out.println("Does not contain Courses");
        }

        // Then go to "https://medunna.com/"
        driver.get("https://medunna.com/");

        // Get the title and check if it contains the word "MEDUNNA" and print "Title contains MEDUNNA" or "Title does not contain MEDUNNA"
        String medunnaTitle = driver.getTitle();
        if(medunnaTitle.contains("MEDUNNA")){
            System.out.println("Title contains MEDUNNA");
        }else{
            System.out.println("Does not contain MEDUNNA");
        }

        // Navigate back to the previous webpage
        driver.navigate().back();

        // Refresh the page
        driver.navigate().refresh();

        // Navigate to forward
        driver.navigate().forward();

        Thread.sleep(3000);// Wait for 3 seconds

        // Close the browser
        driver.close();


    }
}
