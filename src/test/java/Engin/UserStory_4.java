package Engin;

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
        Thread.sleep(4000);
        WebElement pollButton = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[1]/div/span[4]/span"));

        Thread.sleep(4000);

        if (pollButton.isDisplayed()){
            System.out.println("Display pollButton PASSED");
        }else{
            System.out.println("Display pollButton FAILED");
        }

        pollButton.click();

        //User can type the poll message after clicking on the "poll" button.

        WebElement pollQuestionEnter = driver.findElement(By.xpath("//input[@id='question_0']"));
        Thread.sleep(4000);

        //pollExplanation.sendKeys("Random Poll Opened");

        if(pollQuestionEnter.isDisplayed()){
            System.out.println("pollQuestionEnter field is  Displayed PASSED!");
        }else{
            System.out.println("pollQuestionEnter field is NOT Displayed FAILED!");
        }
        Thread.sleep(4000);
        pollQuestionEnter.sendKeys("Question#1");







    }
}
