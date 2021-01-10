package Sergii_Ostapchuk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {
    public static void main(String[] args) throws InterruptedException {


        //4.User should by able to save his computer
        // in the data for future use by click on the"Remember me on this computer" checking box


        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.nextbasecrm.com/");

        WebElement checkboxCRM = driver.findElement(By.cssSelector("input[id='USER_REMEMBER']"));

        Thread.sleep(5000);

        checkboxCRM.click();

        if (checkboxCRM.isSelected()) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test failed");
        }

        Thread.sleep(5000);
        driver.close();
    }
}


