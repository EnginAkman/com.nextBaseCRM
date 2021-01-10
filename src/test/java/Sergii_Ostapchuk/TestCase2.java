package Sergii_Ostapchuk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



    public class TestCase2 {

        //2.User should be able to enter credential and log in successfully

        //username: hr43@cybertekschool.com
        //password: UserUser


        public static void main(String[] args) throws InterruptedException {


            WebDriverManager.chromedriver().setup();


            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://login.nextbasecrm.com/");

            WebElement PasswordCRM = driver.findElement(By.cssSelector("input[class='login-inp']"));
            PasswordCRM.sendKeys("hr43@cybertekschool.com" + Keys.ENTER);
            WebElement UserNameCRM = driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
            UserNameCRM.sendKeys("UserUser" + Keys.ENTER);


            String expectedtitle="Portal";
            String actualTitle= driver.getTitle();

            if(actualTitle.equals(expectedtitle)){
                System.out.println("Test Passed");
            }else{
                System.out.println("Test failed");
            }

            Thread.sleep(5000);
            driver.close();


        }
    }

