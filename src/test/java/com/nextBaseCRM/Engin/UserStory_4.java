package com.nextBaseCRM.Engin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserStory_4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://login2.nextbasecrm.com/stream/?login=yes");

        WebElement loginInput = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        loginInput.sendKeys("hr43@cybertekschool.com");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordInput.sendKeys("UserUser");

        WebElement loginClick = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginClick.click();

        //User should see and click "poll" button top of the webpage
        Thread.sleep(3000);
        WebElement pollButton = driver.findElement(By.xpath("//span/span[.='Poll']"));

        Thread.sleep(3000);

        if (pollButton.isDisplayed()){
            System.out.println("Display pollButton PASSED");
        }else{
            System.out.println("Display pollButton FAILED");
        }

        pollButton.click();
        Thread.sleep(3000);


        //1. User can type the poll message after clicking on the "poll" button.

        WebElement pollExplanation = driver.findElement(By.xpath("//body[@contenteditable='true']"));



        if(pollExplanation.isDisplayed()) System.out.println("OK display PASSED");



        //2. User can type a Question
        WebElement pollQuestionEnter = driver.findElement(By.xpath("//input[@id='question_0']"));

        /*if(pollQuestionEnter.isDisplayed()){
            System.out.println("pollQuestionEnter field is  Displayed PASSED!");
        }else{
            System.out.println("pollQuestionEnter field is NOT Displayed FAILED!");
        }
        */
        if (pollQuestionEnter.isDisplayed()) System.out.println("Ok display PASSED");

        Thread.sleep(3000);
        pollQuestionEnter.sendKeys("Question#1");

        //3. User can type an answer
        Thread.sleep(3000);
        WebElement pollAnswerEnter = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[2]/div[1]/div/div/ol/li/ol/li[1]/input[1]"));
        pollAnswerEnter.sendKeys("Answer#1");

        if(pollAnswerEnter.isDisplayed()) System.out.println("Ok pollAnswerEnter display PASSED");








    }
}
