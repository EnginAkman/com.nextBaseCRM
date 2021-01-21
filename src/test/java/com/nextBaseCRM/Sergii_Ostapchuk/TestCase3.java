package com.nextBaseCRM.Sergii_Ostapchuk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
    public static void main(String[] args) throws InterruptedException {

        //3.User can find "Remember me on this computer" checking box successfully.


        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.nextbasecrm.com/");

        WebElement RememberMeCRM = driver.findElement(By.cssSelector("input[id='USER_REMEMBER']"));

        if (RememberMeCRM.isDisplayed()) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test failed");
        }

        Thread.sleep(5000);
        driver.close();
    }
}
