package Engin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UserStoryPoll_4 {

        public static void main(String[] args) throws InterruptedException {
        // 1. set the chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // 2. get to the login page
        driver.get("http://login2.nextbasecrm.com/");
        // 3. type in login in login input box
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("hr43@cybertekschool.com");
        // 4. enter password in password input box
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("UserUser");
        // 5. click the login button
        driver.findElement(By.cssSelector(".login-btn")).click();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //6. Click Poll Module
        driver.findElement(By.xpath("//span/span[.='Poll']")).click();
        Thread.sleep(3000);

        driver.switchTo().frame(0);

        //7. Enter a text in input box
        WebElement thisi = driver.findElement(By.xpath("//body[@contenteditable='true']"));
        thisi.sendKeys("This a random poll explanation");
                Thread.sleep(3000);
        String result = thisi.getText();
                Thread.sleep(5000);
        if(result.equals("This a random poll explanation")){
                System.out.println("Text: "+ result+ " Test PASSED!");
        }else{
                System.out.println("Test FAILED!");
        }

        Thread.sleep(5000);
        driver.switchTo().parentFrame();
        Thread.sleep(5000);

        //8. Type a question
        WebElement thisj = driver.findElement(By.xpath("//input[@id='question_0']"));
        thisj.sendKeys("What");
                Thread.sleep(5000);
        String result1 = thisj.getText();
                Thread.sleep(5000);
                if(result1.equals("What")){
                        System.out.println("Text: "+ result1+ " Test PASSED!");
                }else{
                        System.out.println("Test FAILED!");
                }

        Thread.sleep(5000);

        //9. Enter Answer 1
        WebElement thisk = driver.findElement(By.xpath("//input[@id='answer_0__0_']"));
        thisk.sendKeys("A");
                Thread.sleep(5000);
        String result2 = thisk.getText();
                Thread.sleep(5000);
                if(result2.equals("A")){
                        System.out.println("Text: "+ result2+ " Test PASSED!");
                }else{
                        System.out.println("Test FAILED!");
                }


        Thread.sleep(5000);

        //10. Enter Answer 2
        WebElement thisl = driver.findElement(By.xpath("//input[@id='answer_0__1_']"));
        thisl.sendKeys("B");
                Thread.sleep(5000);
        String result3 = thisl.getText();
                Thread.sleep(5000);
                if(result3.equals("B")){
                        System.out.println("Text: "+ result3+ " Test PASSED!");
                }else{
                        System.out.println("Test FAILED!");
                }



    }
}