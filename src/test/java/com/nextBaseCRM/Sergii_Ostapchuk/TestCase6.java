package com.nextBaseCRM.Sergii_Ostapchuk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase6 {
    public static void main(String[] args) throws InterruptedException {

        //6.User successfully load to"FORGOT YOUR PASSWORD" page


        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.nextbasecrm.com/");


        WebElement ForgotMeButtonCRM = driver.findElement(By.cssSelector("a.login-link-forgot-pass"));

        Thread.sleep(5000);
        ForgotMeButtonCRM.click();


        String expectedTitle="Get Password";
        String actualTitle=driver.getTitle();


        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test failed");
        }

        Thread.sleep(5000);
        driver.close();


    }
}
