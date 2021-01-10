package Sergii_Ostapchuk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase5 {
    public static void main(String[] args) throws InterruptedException {


        //5.User find "FORGOT YOUR PASSWORD" button successfully

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.nextbasecrm.com/");



        WebElement ForgotMeButtonCRM = driver.findElement(By.cssSelector("a.login-link-forgot-pass"));

        if (ForgotMeButtonCRM.isDisplayed()) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test failed");
        }

        Thread.sleep(5000);
        driver.close();


    }
}

