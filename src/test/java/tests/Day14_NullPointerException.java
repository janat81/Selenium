package tests;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
public class Day14_NullPointerException {
    //    DECLARED BUT NEVER INSTANTIATED
    WebDriver driver;
    Faker faker;
    @Test
    public void nullPointerTest(){
        driver.get("https://techproeducation.com/");//NullPointerException
    }
    @Test
    public void nullPointerTest1(){
        System.out.println(faker.name().fullName());//NullPointerException
    }
}